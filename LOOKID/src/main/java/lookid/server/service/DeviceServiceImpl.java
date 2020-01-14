package lookid.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import lookid.server.dao.DeviceDAO;

@Service("DeviceService")
public class DeviceServiceImpl implements DeviceService {
	
	@Autowired
	@Qualifier("DeviceDAO")
	DeviceDAO dao;

	@Override
	public void device(double x, double y) throws Exception {
		
		dao.device(x, y, "dsaf5151");
		return;

	}

}
