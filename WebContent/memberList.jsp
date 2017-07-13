<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="kr.bit.mem.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%
		List<MemberVO> list = (List<MemberVO>) request.getAttribute("list");
	%>


	<table border=1>
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>나이</td>
			<td>이메일</td>
			<td>자기소개</td>
		</tr>

		<%
			for (MemberVO vo : list) {
		%>

		<tr>
			<td><%=vo.getNum()%></td>
			<td><%=vo.getIrum()%></td>
			<td><%=vo.getAge()%></td>
			<td><%=vo.getEmail()%></td>
			<td><%=vo.getIntro()%></td>
		</tr>
		<%
			}
		%>

	</table>

</body>
</html>