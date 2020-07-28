<%--enable to use jstl tags--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--enable to use spring form tags--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--import class--%>
<%@ page import="com.mike.util.AttributeNames" %>
<html>
<head>
    <title>Add Items</title>
</head>

<body>
<div align="center">
    <form:form method="POST" modelAttribute="${AttributeNames.TODO_ITEM}">

    </form:form>
</div>

</body>
</html>