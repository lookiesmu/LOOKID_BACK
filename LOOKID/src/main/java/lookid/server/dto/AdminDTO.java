package lookid.server.dto;

public class AdminDTO {

	private int user_pid;
	private String id;
	private String name;

	public int getUser_pid() {
		return user_pid;
	}

	public void setUser_pid(int user_pid) {
		this.user_pid = user_pid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AdminDTO [user_pid=" + user_pid + ", id=" + id + ", name=" + name + "]";
	}

}