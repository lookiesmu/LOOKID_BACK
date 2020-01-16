package lookid.server.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lookid.server.dto.AdminDTO;
import lookid.server.dto.FindIdDTO;
import lookid.server.dto.ModifyTempPwDTO;
import lookid.server.vo.UserVO;

@Repository
public class UserDAOImpl implements UserDAO {

   @Autowired
   private Mapper mapper;

   @Override
   public Integer checkId(String id) throws Exception {
      return mapper.checkId(id);
   }

   @Override
   public void signup(UserVO user) throws Exception {

      mapper.signup(user);
      return;

   }

   @Override
   public FindIdDTO find_id(String name, String phone) throws Exception {
      return mapper.find_id(name, phone);
   }

   @Override
   public String find_pw(String id, String mail) throws Exception {
      return mapper.find_pw(id, mail);
   }

   @Override
   public void modify_temp_pw(ModifyTempPwDTO user) throws Exception {
      mapper.modify_temp_pw(user);
      return;
   }

   @Override
   public AdminDTO find_admin(String id) throws Exception {
      return mapper.find_admin(id);
   }

   @Override
   public int count() throws Exception {
      return mapper.count();
   }

}