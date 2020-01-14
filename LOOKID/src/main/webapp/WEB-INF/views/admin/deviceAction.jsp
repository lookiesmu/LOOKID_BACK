<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOOKID 관리자 페이지</title>
</head>
<body>

	<%
		List<String> deviceList = new ArrayList<String>();
		List<String> childList = new ArrayList<String>();
		
		String d_num1 = request.getParameter("d_num1");
		String d_num2 = request.getParameter("d_num2");
		String d_num3 = request.getParameter("d_num3");
		String d_num4 = request.getParameter("d_num4");
		String d_num5 = request.getParameter("d_num5");
		String d_num6 = request.getParameter("d_num6");
		String d_num7 = request.getParameter("d_num7");
		String d_num8 = request.getParameter("d_num8");
		String d_num9 = request.getParameter("d_num9");
		String d_num10 = request.getParameter("d_num10");
		String d_num11 = request.getParameter("d_num11");
		String d_num12 = request.getParameter("d_num12");
		String d_num13 = request.getParameter("d_num13");
		String d_num14 = request.getParameter("d_num14");
		String d_num15 = request.getParameter("d_num15");
		String d_num16 = request.getParameter("d_num16");
		String d_num17 = request.getParameter("d_num17");
		String d_num18 = request.getParameter("d_num18");
		String d_num19 = request.getParameter("d_num19");
		String d_num20 = request.getParameter("d_num20");
		String d_num21 = request.getParameter("d_num21");
		String d_num22 = request.getParameter("d_num22");
		String d_num23 = request.getParameter("d_num23");
		String d_num24 = request.getParameter("d_num24");
		String d_num25 = request.getParameter("d_num25");
		String d_num26 = request.getParameter("d_num26");
		String d_num27 = request.getParameter("d_num27");
		String d_num28 = request.getParameter("d_num28");
		String d_num29 = request.getParameter("d_num29");
		String d_num30 = request.getParameter("d_num30");
		
		String c_name1 = request.getParameter("c_name1");
		String c_name2 = request.getParameter("c_name2");
		String c_name3 = request.getParameter("c_name3");
		String c_name4 = request.getParameter("c_name4");
		String c_name5 = request.getParameter("c_name5");
		String c_name6 = request.getParameter("c_name6");
		String c_name7 = request.getParameter("c_name7");
		String c_name8 = request.getParameter("c_name8");
		String c_name9 = request.getParameter("c_name9");
		String c_name10 = request.getParameter("c_name10");
		String c_name11 = request.getParameter("c_name11");
		String c_name12 = request.getParameter("c_name12");
		String c_name13 = request.getParameter("c_name13");
		String c_name14 = request.getParameter("c_name14");
		String c_name15 = request.getParameter("c_name15");
		String c_name16 = request.getParameter("c_name16");
		String c_name17 = request.getParameter("c_name17");
		String c_name18 = request.getParameter("c_name18");
		String c_name19 = request.getParameter("c_name19");
		String c_name20 = request.getParameter("c_name20");
		String c_name21 = request.getParameter("c_name21");
		String c_name22 = request.getParameter("c_name22");
		String c_name23 = request.getParameter("c_name23");
		String c_name24 = request.getParameter("c_name24");
		String c_name25 = request.getParameter("c_name25");
		String c_name26 = request.getParameter("c_name26");
		String c_name27 = request.getParameter("c_name27");
		String c_name28 = request.getParameter("c_name28");
		String c_name29 = request.getParameter("c_name29");
		String c_name30 = request.getParameter("c_name30");
		
		deviceList.add(d_num1);
		deviceList.add(d_num2);
		deviceList.add(d_num3);
		deviceList.add(d_num4);
		deviceList.add(d_num5);
		deviceList.add(d_num6);
		deviceList.add(d_num7);
		deviceList.add(d_num8);
		deviceList.add(d_num9);
		deviceList.add(d_num10);
		deviceList.add(d_num11);
		deviceList.add(d_num12);
		deviceList.add(d_num13);
		deviceList.add(d_num14);
		deviceList.add(d_num15);
		deviceList.add(d_num16);
		deviceList.add(d_num17);
		deviceList.add(d_num18);
		deviceList.add(d_num19);
		deviceList.add(d_num20);
		deviceList.add(d_num21);
		deviceList.add(d_num22);
		deviceList.add(d_num23);
		deviceList.add(d_num24);
		deviceList.add(d_num25);
		deviceList.add(d_num26);
		deviceList.add(d_num27);
		deviceList.add(d_num28);
		deviceList.add(d_num29);
		deviceList.add(d_num30);
		
		childList.add(c_name1);
		childList.add(c_name2);
		childList.add(c_name3);
		childList.add(c_name4);
		childList.add(c_name5);
		childList.add(c_name6);
		childList.add(c_name7);
		childList.add(c_name8);
		childList.add(c_name9);
		childList.add(c_name10);
		childList.add(c_name11);
		childList.add(c_name12);
		childList.add(c_name13);
		childList.add(c_name14);
		childList.add(c_name15);
		childList.add(c_name16);
		childList.add(c_name17);
		childList.add(c_name18);
		childList.add(c_name19);
		childList.add(c_name20);
		childList.add(c_name21);
		childList.add(c_name22);
		childList.add(c_name23);
		childList.add(c_name24);
		childList.add(c_name25);
		childList.add(c_name26);
		childList.add(c_name27);
		childList.add(c_name28);
		childList.add(c_name29);
		childList.add(c_name30);
		
	%>

	<h1>[디바이스]-[피보호자] 연결 리스트</h1>
	<hr>

	<%
		
		for(int i = 0; i < childList.size(); i++){
			if(!childList.get(i).equals("")){
				out.print("d_num" + (i+1) + " : " + deviceList.get(i) + " / " + "c_name" + (i+1) + " : " + childList.get(i) + "</br>");	
			}
		}	
	
	%>
		
</body>
</html>