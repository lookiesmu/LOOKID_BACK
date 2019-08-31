package lookid.server.dao;

import org.apache.ibatis.annotations.Param;

import lookid.server.dto.GroupDTO;
import lookid.server.vo.GroupVO;
import lookid.server.vo.ReservationVO;

public interface Mapper {
	// 예약 정보 생성
	public void reservation_create(ReservationVO input);
	
	// 그룹 정보 생성
	public void group_create(GroupVO input);
	
	// child 정보 생성
	public void child_create(@Param("g_pid")int g_pid, @Param("children")String[] children);
	
	// admin 정보 생성
	public void admin_create(@Param("g_pid")int g_pid, @Param("admins")String[] admins);
	
	// 예약 정보 수정
	public void reservation_modify(ReservationVO input);
	
	// 그룹 정보 수정
	public void group_modify(GroupDTO input);
	
	// child 정보 수정을 위한 child 정보 삭제
	public void child_delete(@Param("g_pid")int g_pid);
	
	// admin 정보 수정을 위한 child 정보 삭제
	public void admin_delete(@Param("g_pid")int g_pid);
	
	
}