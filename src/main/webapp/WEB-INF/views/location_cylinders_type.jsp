<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title></title>
</head>
<body>
<form:form method="post" action="saveLocationCylindersType" modelAttribute="locationCylindersType">
    <form:hidden path="id"/>

    <div>
        <form:label path="name">Расположение цилиндров</form:label>
        <form:input path="name"/>

        <input type="submit" value="Добавить">
    </div>
</form:form>

</body>
</html>
