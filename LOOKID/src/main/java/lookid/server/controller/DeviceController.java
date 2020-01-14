package lookid.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import lookid.server.service.DeviceService;

@Controller
public class DeviceController {
	
	@Autowired
	@Qualifier("DeviceService")
	DeviceService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String aa(){
		return "success";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public void device(@RequestBody String data) {
		System.out.println(data);
		
//		System.out.println("input");
//		System.out.println(data);
//
//		int idx = data.indexOf("?");
//
//		String x = data.substring(0, idx);
//		String y = data.substring(idx + 1);
//
//		System.out.println(x);
//		System.out.println(y);
		
		// service.device(x, y);

		return;
	}

}
