<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>사이트 제목</title>

  <%-- 모든 화면에서 사용할 공통 CSS --%>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">

  <script src="${pageContext.request.contextPath}/js/jquery-3.7.1.min.js"></script>
</head>
<body>
  <!-- Page Contents -->
  <tiles:insertAttribute name="body" />
  
</body>
</html>