<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>LOOKID 관리자페이지</title>
</head>
<body>

	<h1 align="center">LOOKID 관리자페이지</h1>
	<hr>

	<div class="container">
		<div class="row">
			<form method="post" action="./deviceAction">
				<table class="table table-striped" style="text-align: center; border: 1px solid #dddddd">
					<thead>
						<tr>
							<th colspan="2" style="background-color: #eeeeee; text-align: center;">[디바이스]-[피보호자] 연결</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1. <input type="text" class="form-control" placeholder="기기 번호" name="d_num1" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name1" maxlength="50"/></td>
						</tr>
						<tr>
							<td>2. <input type="text" class="form-control" placeholder="기기 번호" name="d_num2" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name2" maxlength="50"/></td>
						</tr>
						<tr>
							<td>3. <input type="text" class="form-control" placeholder="기기 번호" name="d_num3" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name3" maxlength="50"/></td>
						</tr>
						<tr>
							<td>4. <input type="text" class="form-control" placeholder="기기 번호" name="d_num4" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name4" maxlength="50"/></td>
						</tr>
						<tr>
							<td>5. <input type="text" class="form-control" placeholder="기기 번호" name="d_num5" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name5" maxlength="50"/></td>
						</tr>
						<tr>
							<td>6. <input type="text" class="form-control" placeholder="기기 번호" name="d_num6" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name6" maxlength="50"/></td>
						</tr>
						<tr>
							<td>7. <input type="text" class="form-control" placeholder="기기 번호" name="d_num7" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name7" maxlength="50"/></td>
						</tr>
						<tr>
							<td>8. <input type="text" class="form-control" placeholder="기기 번호" name="d_num8" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name8" maxlength="50"/></td>
						</tr>
						<tr>
							<td>9. <input type="text" class="form-control" placeholder="기기 번호" name="d_num9" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name9" maxlength="50"/></td>
						</tr>
						<tr>
							<td>10. <input type="text" class="form-control" placeholder="기기 번호" name="d_num10" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name10" maxlength="50"/></td>
						</tr>
						<tr>
							<td>11. <input type="text" class="form-control" placeholder="기기 번호" name="d_num11" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name11" maxlength="50"/></td>
						</tr>
						<tr>
							<td>12. <input type="text" class="form-control" placeholder="기기 번호" name="d_num12" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name12" maxlength="50"/></td>
						</tr>
						<tr>
							<td>13. <input type="text" class="form-control" placeholder="기기 번호" name="d_num13" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name13" maxlength="50"/></td>
						</tr>
						<tr>
							<td>14. <input type="text" class="form-control" placeholder="기기 번호" name="d_num14" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name14" maxlength="50"/></td>
						</tr>
						<tr>
							<td>15. <input type="text" class="form-control" placeholder="기기 번호" name="d_num15" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name15" maxlength="50"/></td>
						</tr>
						<tr>
							<td>16. <input type="text" class="form-control" placeholder="기기 번호" name="d_num16" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name16" maxlength="50"/></td>
						</tr>
						<tr>
							<td>17. <input type="text" class="form-control" placeholder="기기 번호" name="d_num17" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name17" maxlength="50"/></td>
						</tr>
						<tr>
							<td>18. <input type="text" class="form-control" placeholder="기기 번호" name="d_num18" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name18" maxlength="50"/></td>
						</tr>
						<tr>
							<td>19. <input type="text" class="form-control" placeholder="기기 번호" name="d_num19" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name19" maxlength="50"/></td>
						</tr>
						<tr>
							<td>20. <input type="text" class="form-control" placeholder="기기 번호" name="d_num20" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name20" maxlength="50"/></td>
						</tr>
						<tr>
							<td>21. <input type="text" class="form-control" placeholder="기기 번호" name="d_num21" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name21" maxlength="50"/></td>
						</tr>
						<tr>
							<td>22. <input type="text" class="form-control" placeholder="기기 번호" name="d_num22" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name22" maxlength="50"/></td>
						</tr>
						<tr>
							<td>23. <input type="text" class="form-control" placeholder="기기 번호" name="d_num23" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name23" maxlength="50"/></td>
						</tr>
						<tr> 
							<td>24. <input type="text" class="form-control" placeholder="기기 번호" name="d_num24" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name24" maxlength="50"/></td>
						</tr>
						<tr>
							<td>25. <input type="text" class="form-control" placeholder="기기 번호" name="d_num25" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name25" maxlength="50"/></td>
						</tr>
						<tr>
							<td>26. <input type="text" class="form-control" placeholder="기기 번호" name="d_num26" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name26" maxlength="50"/></td>
						</tr>
						<tr>
							<td>27. <input type="text" class="form-control" placeholder="기기 번호" name="d_num27" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name27" maxlength="50"/></td>
						</tr>
						<tr>
							<td>28. <input type="text" class="form-control" placeholder="기기 번호" name="d_num28" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name28" maxlength="50"/></td>
						</tr>
						<tr>
							<td>29. <input type="text" class="form-control" placeholder="기기 번호" name="d_num29" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name29" maxlength="50"/></td>
						</tr>
						<tr>
							<td>30. <input type="text" class="form-control" placeholder="기기 번호" name="d_num30" maxlength="50"/>&nbsp;<input type="text" class="form-control" placeholder="피보호자" name="c_name30" maxlength="50"/></td>
						</tr>
						
					</tbody>
				</table>
				<input type="reset" value = "입력 내용 초기화">	
				<input type="submit" class="btn btn-primary pull-right" value="작성 완료" />
			</form>
		</div>
	</div>

</body>
</html>