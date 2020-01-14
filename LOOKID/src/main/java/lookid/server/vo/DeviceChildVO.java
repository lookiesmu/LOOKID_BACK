package lookid.server.vo;

public class DeviceChildVO {

	private int dc_pid;
	private String d_num;
	private String c_name;

	public DeviceChildVO(String d_num, String c_name) {
	
		this.d_num = d_num;
		this.c_name = c_name;
	}

	public int getDc_pid() {
		return dc_pid;
	}

	public void setDc_pid(int dc_pid) {
		this.dc_pid = dc_pid;
	}

	public String getD_num() {
		return d_num;
	}

	public void setD_num(String d_num) {
		this.d_num = d_num;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	@Override
	public String toString() {
		return "DeviceChildVO [dc_pid=" + dc_pid + ", d_num=" + d_num + ", c_name=" + c_name + "]";
	}

}
