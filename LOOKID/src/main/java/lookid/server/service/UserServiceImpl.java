package lookid.server.service;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lookid.server.dao.UserDAO;
import lookid.server.dto.AdminDTO;
import lookid.server.dto.FindIdDTO;
import lookid.server.dto.ModifyTempPwDTO;
import lookid.server.dto.SuccessDTO;
import lookid.server.vo.UserVO;

@Service("UserService")
public class UserServiceImpl implements UserService {

   @Autowired
   private UserDAO dao;

   private final SuccessDTO success = new SuccessDTO(true);
   private final SuccessDTO fail = new SuccessDTO(false);

   @Override
   public SuccessDTO checkId(String id) throws Exception {

      try {
         if (dao.checkId(id) != 0) {
            return fail;
         } else {
            return null;
         }
      } catch (Exception e) {
         return success;
      }

   }

   @Override
   public SuccessDTO signup(UserVO user) throws Exception {

      int beforeInsert, afterInsert;

      try {
         beforeInsert = count();
         dao.signup(user);
         afterInsert = count();

         if (beforeInsert == afterInsert) {
            return fail;
         } else {
            return success;
         }

      } catch (Exception e) {
         return fail;
      }

   }

   @Override
   public FindIdDTO find_id(String name, String phone) throws Exception {

      try {
         dao.find_id(name, phone).getId();
         return dao.find_id(name, phone);

      } catch (NullPointerException e) {
         FindIdDTO fdto = new FindIdDTO();
         return fdto;
      }

   }

   @Override
   public SuccessDTO find_pw(String id, String mail) throws FileNotFoundException, URISyntaxException, Exception {

      String email = dao.find_pw(id, mail);
      String temp_pw;

      if (email != null) {
         Random rnd = new Random();
         StringBuffer buf = new StringBuffer();

         for (int i = 0; i < 10; i++) {

            if (rnd.nextBoolean()) {
               buf.append((char) ((int) (rnd.nextInt(26)) + 97));
            } else {
               buf.append((rnd.nextInt(10)));
            }
         }
         
         temp_pw = buf.toString();

         String from = "smulookid@gmail.com";
         String fromname = "LOOKID";

         String to = email;

         String SMTP_USERNAME = "AKIAQKE5G6BCVQZGAL72";
         String SMTP_PASSWORD = "BBimterFLvsl1JQanGKs2djL+ZhgixO06mMV8AcqGQS5";

         String host = "email-smtp.us-east-1.amazonaws.com";

         int port = 587;
         String subject = "루키드 LOOKID 임시 비밀번호 발급입니다.";

         String body = String.join(System.getProperty("line.separator"),
               "안녕하세요. LOOKID 입니다.<br><br>회원님의 LOOKID 임시 비밀번호가 발급되었습니다." + "<br><br>"
                     + "임시 비밀번호로 로그인하여 '내 정보 수정' -> '비밀번호 변경' 을 해주세요." + "<br><br>" + "임시 비밀번호 : " + temp_pw
                     + "<br><br>LOOKID를 이용하여 주셔서 감사합니다.");

         Properties props = System.getProperties();
         props.put("mail.transport.protocol", "smtp");
         props.put("mail.smtp.port", port);
         props.put("mail.smtp.starttls.enable", "true");
         props.put("mail.smtp.auth", "true");

         Session session = Session.getDefaultInstance(props);

         MimeMessage msg = new MimeMessage(session);
         msg.setFrom(new InternetAddress(from, fromname));
         msg.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
         msg.setSubject(subject);
         msg.setContent(body, "text/html");
         msg.setText(body, "utf-8", "html");

         Transport transport = session.getTransport();

         try {
            transport.connect(host, SMTP_USERNAME, SMTP_PASSWORD);

            transport.sendMessage(msg, msg.getAllRecipients());

            ModifyTempPwDTO mtp = new ModifyTempPwDTO();
            mtp.setMail(email);
            mtp.setPw(temp_pw);
            mtp.setId(id);

            dao.modify_temp_pw(mtp);
            return success;
         } catch (Exception ex) {
            return fail;
         } finally {
            transport.close();
         }
      }
      return fail;
   }

   @Override
   public AdminDTO find_admin(String id) throws Exception {

      try {
         dao.find_admin(id).getName();
         return dao.find_admin(id);

      } catch (NullPointerException e) {
         AdminDTO fdto = new AdminDTO();
         return fdto;
      }
   }

   @Override
   public int count() throws Exception {
      return dao.count();
   }

}