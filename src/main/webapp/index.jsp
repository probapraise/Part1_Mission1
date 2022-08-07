<%@page import="PbWifi.Db_handler"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
	String LAT = request.getParameter("tmp_lat");
    String LNT = request.getParameter("tmp_lnt");
%>

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
	<% Db_handler db_handler = new Db_handler();
		Double lat = Double.valueOf(LAT);
		Double lnt = Double.valueOf(LNT);
		String tag = db_handler.Near_Wifi_Search(lat, lnt);
	%>
	
	<input type="hidden" id="hidden_lat" value="<%=LAT%>">
	<input type="hidden" id="hidden_lnt" value="<%=LNT%>">
	
	<h1>와이파이 정보 구하기</h1>
	<div>
		<a href="http://localhost:8080/Part1_Assignment_1/Home.jsp">홈</a>
		<span> | </span>
		<a href="user_history.jsp">위치 히스토리 목록</a>
		<span> | </span>
		<a href="getPbWifi.jsp">Open API 와이파이 정보 가져오기</a>
	</div>
	<div>
		LAT: <input type="number" placeholder="<%=LAT%>" id="LAT">, 
		LNT: <input type="number" placeholder="<%=LNT%>" id="LNT"> 
		<button id="btn1" onclick="getMyLocation()">내 위치 가져오기</button>     
		<button id="btn2" onclick="getNearWifi()">근처 WIFI 정보 보기</button>
	</div>
	<form method="post" action="index.jsp" id="form1">
		<input type="hidden" id="tmp_lat" name="tmp_lat">
		<input type="hidden" id="tmp_lnt" name="tmp_lnt">
	</form>
	<div>
		<table>
			<thead>
			 	<tr>
					<th>거리(km)</th>
					<th>관리번호</th>
					<th>자치구</th>
					<th>와이파이명</th>
					<th>도로명주소</th>
					<th>상세주소</th>
					<th>설치위치(층)</th>
					<th>설치유형</th>
					<th>설치기관</th>
					<th>서비스구분</th>
					<th>망종류</th>
					<th>설치년도</th>
					<th>실내외구분</th>
					<th>WIFI접속환경</th>
					<th>X좌표</th>
					<th>Y좌표</th>
					<th>작업일자</th>
			 	</tr>	
			</thead>
			<tbody id = "my_tbody">
			<%=tag%>
			</tbody>
		</table>
	</div>
	<script type="text/javascript">	
		function getMyLocation() {						
	  		if (navigator.geolocation) {
	  		    navigator.geolocation.getCurrentPosition(function(position) {
	  		      document.getElementById('LAT').value = position.coords.latitude;
	  	      	  document.getElementById('LNT').value = position.coords.longitude;
	  		      alert(position.coords.latitude + ' ' + position.coords.longitude);
	  		    }, function(error) {
	  		      console.error(error);
	  		    }, {
	  		      enableHighAccuracy: false,
	  		      maximumAge: 0,
	  		      timeout: Infinity
	  		    });
	  		  } else {
	  		    alert('GPS를 지원하지 않습니다');
	  		  }
	  		};
  		
  		function getNearWifi() {
  			document.getElementById('tmp_lat').value = document.getElementById('LAT').value;
  			document.getElementById('tmp_lnt').value = document.getElementById('LNT').value;
      		document.getElementById('form1').submit();        		
      		};
      		
      	function deleteRow() {
      		var my_tbody = document.getElementById('my_tbody');
      		if (my_tbody.rows.length < 1) return;
      		my_tbody.deleteRow(my_tbody.rows.length-1);
      	}
	</script>
</body>
</html>