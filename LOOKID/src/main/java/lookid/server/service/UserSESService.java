package lookid.server.service;

import lookid.server.dto.SuccessDTO;

public interface UserSESService {

	public SuccessDTO find_pw(String id, String mail) throws Exception;
}
