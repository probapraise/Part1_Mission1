<%@page import="PbWifi.API"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% API api = new API();
	int r = api.get_Wifi_Info();
%>
	<h1 style="text-align:center"><%=r%>개의 WIFI 정보를 정상적으로 저장하였습니다.</h1>
	<div style="text-align:center">
		<a href="Home.jsp">홈으로 가기</a>
	</div>
</body>
</html>