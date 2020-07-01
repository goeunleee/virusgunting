<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>야관문</title>
<style>
</style>
</head>
<body>
	<jsp:include page="./nav.jsp" flush="true" />
	<div class="container" align="center">
		<p style="font-size: 4rem; font-weight: 700;" class="font-shadow">
			After
			<span style="color: red;">
				Hell
				<i class="fas fa-bomb"></i>
			</span>
			, The
			<span style="color:#31B2A1;">
				Doctor
				<i class="fas fa-user-nurse"></i>
			</span>
		</p>
		<img src="<c:url value='/images/home/donkey.gif'/>" style="max-width: 65%; height: auto;">
	</div>
<<<<<<< HEAD
	<div align="center" style="position=absolute">
	대구 달서구 성서공단로 217 8F 한국 품질재단 대구경북지역본부<br>
	217, Seongseogongdan-ro, Dalseo-gu, Daegu, Republic of Korea, 8f kfq <br>
	   Copyright © 2020 야관문 Inc. All rights reserved.<br>
	</div>
=======
	<jsp:include page="./footer.jsp" flush="true" />
>>>>>>> upstream/master
</body>
</html>
