<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<c:forEach var="e" items="${lisv}">
<p>
<span>${e.no}</span>
<span>${e.writer}</span>
<span>${e.subject}</span>
<span>${e.content}</span>
<span>${e.regdate}</span>
</p>
</c:forEach>


</body>
</html>


