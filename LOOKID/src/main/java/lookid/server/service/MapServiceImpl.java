package lookid.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import lookid.server.dao.ReservationListDAO;
import lookid.server.dto.ChildDTO;
import lookid.server.dto.GroupDTO;

@Service("MapService")
public class MapServiceImpl implements MapService {

	@Autowired
	@Qualifier("ReservationListDAO")
	ReservationListDAO list;

	@Override
	public GroupDTO[] group(int rv_pid) throws Exception {
		try {
			return list.group_detail(rv_pid);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public ChildDTO[] child(int g_pid) throws Exception {
		try {
			return list.child_detail(g_pid);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}

}
