<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.mike.util.Mappings" %>

<html>
<head>
    <title>Todo Item</title>
</head>

<body>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>Todo Item</h2></caption>

        <tr>
            <th>Id</th>
            <th>Title</th>
            <th>Deadline</th>
            <th>Details</th>
        </tr>
        <tr>
	        <td><c:out value="${todoItem.id}" /></td>
	        <td><c:out value="${todoItem.title}" /></td>
            <td><c:out value="${todoItem.deadline}" /></td>
            <td><c:out value="${todoItem.details}" /></td>
        </tr>
    </table>

    <c:url var="itemsLink" value="${Mappings.ITEMS}" />
    <h2><a href="${itemsLink}">Show todo items</a></h2>
</div>

</body>
</html>