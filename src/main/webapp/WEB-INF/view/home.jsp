<%--enable to use jstl tags--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="com.mike.util.Mappings" %>

<html>
<head>
    <title>Todo List Application</title>
</head>

<body>
<div align="center">
	<c:url var="itemsLink" value="${Mappings.ITEMS}" />
	<h2><a href="${itemsLink}">Show todo items</a></h2>
</div>

</body>
</html>