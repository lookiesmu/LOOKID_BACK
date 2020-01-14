package lookid.server.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lookid.server.dto.ModifyPwDTO;
import lookid.server.dto.SigninDTO;
import lookid.server.vo.UserVO;

@Repository
public class JUserDAOImpl implements JUserDAO {

   @Autowired
   private Mapper mapper;

   @Override
   public UserVO signin(SigninDTO user) throws Exception {
      return mapper.signin(user);
   }

   @Override
   public void modify_pw(ModifyPwDTO user) throws Exception {
      mapper.modify_pw(user);
      return;
   }

   @Override
   public void modify(UserVO user) throws Exception {
      mapper.modify(user);
      return;
   }
}