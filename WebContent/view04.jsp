<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="kr.bit.mem.* "%>
<%@page import="java.util.* "%>
<%
	MemberVO vo = new MemberVO();
	vo.setNum(1);
	vo.setIrum("홍길동");
	vo.setAge(30);
	vo.setEmail("bit@hanmail.net");
	vo.setIntro("안녕하세요 ");
	request.setAttribute("vo", vo);
	List<MemberVO> list = new ArrayList<MemberVO>();
	list.add(vo);
	list.add(vo);
	list.add(vo);
	request.setAttribute("list", list);
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>나이</td>
			<td>이메일</td>
			<td>소개</td>
		</tr>

		<tr>
			<c:forEach var="vo" items="${list}">
				<tr>
					<td>${vo.num}</td>
					<td>${vo.irum}</td>
					<td>${vo.age}</td>
					<td>${vo.email}</td>
					<td>${vo.intro}</td>
				</tr>

			</c:forEach>
	</table>
</body>
</html>