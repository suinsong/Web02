<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:set var="c" value="11" />
	<c:if test="${c%2 == 0}">
	짝수입니다<br />

	</c:if>

	<c:if test="${c%2!=0 }">
	홀수입니다<br />

	</c:if>



	<c:set var="b" value="10" />
	
	<c:choose>
		<c:when test="${b%2==1 }">
	${b}는 짝수입니다<br />
		</c:when>
		<c:when test="${b%2!=0 }">
	${b}홀수입니다 <br />
		</c:when>
	<c:otherwise>
	일치하는 when부분이 없을 때 실행한다
	</c:otherwise>



	</c:choose>




	${c+b}
	<br />
	<c:forEach var="i" begin="1" end="5" step="1">
		<font size="${i}">야호~~~</font>
		<br/>

	</c:forEach>

</body>
</html>
