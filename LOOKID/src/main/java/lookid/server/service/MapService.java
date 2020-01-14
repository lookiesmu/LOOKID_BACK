package lookid.server.service;

import lookid.server.dto.ChildDTO;
import lookid.server.dto.GroupDTO;

public interface MapService {

	public GroupDTO[] group(int rv_pid) throws Exception;

	public ChildDTO[] child(int g_pid) throws Exception;

}
