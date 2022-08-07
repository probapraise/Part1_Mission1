<%@page import="PbWifi.Db_handler"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% String id = request.getParameter("history_id"); %>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
		table {
			width: 100%;
			border-collapse: collapse;
			border: 1px solid #808080;
			
		}
		thead, th {
			border:solid 1px #808080;
			color: #fff;
			background-color: #008000;
		}
		tbody, td {
			border: 1px solid #808080;
			text-align: center
		}
		div {
			margin: 10px
		}
		.cell_padding {
			padding: 15px;
		}
</style>
</head>
<body>
	<% 
		Db_handler db_handler = new Db_handler();
		db_handler.delete_User_Info(id);
		String tag = db_handler.User_Info_Search();
	%>

	<form method="post" action="user_history2.jsp" id="form2">
		<input type="hidden" id="history_id" name="history_id">
	</form>
	<h1>와이파이 정보 구하기</h1>
	<div>
		<a href="http://localhost:8080/Part1_Assignment_1/Home.jsp">홈</a>
		<span> | </span>
		<a href="user_history.jsp">위치 히스토리 목록</a>
		<span> | </span>
		<a href="getPbWifi.jsp">Open API 와이파이 정보 가져오기</a>
	</div>
	<div>
		<table id="user_info">
			<thead>
			 	<tr>
					<th>ID</th>
					<th>X좌표</th>
					<th>Y좌표</th>
					<th>조회일자</th>
					<th>비고</th>
			 	</tr>	
			</thead>
			<tbody id = "my_tbody">
			<%=tag%>
			</tbody>
		</table>
	</div>
	<script>
	function row_delete() {
		let user_info = document.getElementById('user_info');
		for (let i = 1; i < user_info.rows.length; i++) {
			   user_info.rows[i].cells[4].onclick = function () {
			      let userId = user_info.rows[i].cells[0].innerText;
			      document.getElementById('history_id').value = userId;
			      document.getElementById('form2').submit();
			   }
			}
	}
	</script>
</body>
</html>