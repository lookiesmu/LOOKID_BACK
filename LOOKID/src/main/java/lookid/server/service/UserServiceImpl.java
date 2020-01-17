package lookid.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lookid.server.dao.UserDAO;
import lookid.server.dto.AdminDTO;
import lookid.server.dto.FindIdDTO;
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