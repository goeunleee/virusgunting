<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>야관문</title>

</head>
<body>
	<jsp:include page="./nav.jsp" flush="true" />
	<div class="container"  align="center"  >
		<p style="font-size: 4rem; font-family: times new roman; font-weight: 700;">minjae ear is donkey ear</p>
		<img src="<c:url value='/images/home/donkey.gif'/>" style="max-width: 65%; height: auto;">
	</div>
	<div align="center" style="position=absolute">
	대구 달서구 성서공단로 217 8F 한국 품질재단 대구경북지역본부<br>
	217, Seongseogongdan-ro, Dalseo-gu, Daegu, Republic of Korea, 8f kfq <br>
	   Copyright © 2020 야관문 Inc. All rights reserved.<br>
	</div>
</body>
</html>
