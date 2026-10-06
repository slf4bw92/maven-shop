<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>회원 조회</title>
</head>
<body>

  <c:forEach var="member" items="${members}">
    <p>${member.mbrNm}</p>
  </c:forEach>

</body>
</html>
