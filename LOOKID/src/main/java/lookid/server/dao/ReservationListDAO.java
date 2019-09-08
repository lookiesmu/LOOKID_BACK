package lookid.server.dao;

import lookid.server.dto.FindAdminDTO;
import lookid.server.dto.GroupDTO;
import lookid.server.dto.ReservationDTO;
import lookid.server.dto.ReservationListDTO;
import lookid.server.dto.RvPidDTO;

public interface ReservationListDAO {

	public RvPidDTO[] today(int user_pid);

	public ReservationListDTO[] list(int user_pid) throws Exception;

	public ReservationDTO reservation_detail(int rv_pid) throws Exception;

	public GroupDTO[] group_detail(int rv_pid) throws Exception;

	public String child_detail(int g_pid) throws Exception;

	public FindAdminDTO[] admin_detail(int g_pid) throws Exception;

}
