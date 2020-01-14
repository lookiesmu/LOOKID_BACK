package lookid.server.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("DeviceDAO")
public class DeviceDAOImpl implements DeviceDAO {
	
	@Autowired
	private Mapper mapper;

	public void device(double x, double y,String d_num){
		mapper.device_update(x, y, d_num);
		return;
	}
	
}
