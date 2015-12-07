<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Добавление мотоцикла</title>
</head>
<body>
<form:form method="post" modelAttribute="motorcycle" action="insert_motorcycle">
    <div>
        <form:select path="${classMotorcycle.name}">
            <form:options items="${classesMotorcycles}"/>
        </form:select>
        <a href="newClassMoto">Добавить новый класс мотоцикла</a>
    </div>
    <div>
        <form:select path="${brand.name}">
            <form:options items="${brands}"/>
        </form:select>
        <a href="newBrand">Добавить производителя мотоцикла</a>
    </div>

    <div>
        <form:select path="${motorType.name}">
            <form:options items="${motorTypes}"/>
        </form:select>
        <a href="newMotorType">Добавить тип двигателя</a>
    </div>
    <div>
        <form:select path="${locationCylindersType.name}">
            <form:options items="${locationCylindersTypes}"/>
        </form:select>
        <a href="newLocationCylindersType">Добавить тип расположения цилиндров</a>
    </div>
    <div>
        <form:select path="${driveType.name}">
            <form:options items="${driveTypes}"/>
        </form:select>
        <a href="newDriveType">Добавить тип привода</a>
    </div>
    <div>
        <form:select path="${coolingType.name}">
            <form:options items="${coolingTypes}"/>
        </form:select>
        <a href="newCoolingType">Добавить тип охлаждения</a>
    </div>
    <div>
        <form:select path="${fuelSupplyType.name}">
            <form:options items="${fuelSupplyTypes}"/>
        </form:select>
        <a href="newFuelSupplyType">Добавить тип подачи топлива</a>
    </div>
    <div>
        <form:select path="${frontSuspensionType.name}">
            <form:options items="${frontSuspensionTypes}"/>
        </form:select>
        <a href="newFrontSuspensionType">Добавить тип передней подвески</a>
    </div>
    <div>
        <form:select path="${backSuspensionType.name}">
            <form:options items="${backSuspensionTypes}"/>
        </form:select>
        <a href="newBackSuspensionType">Добавить тип задней подвески</a>
    </div>





    <input type="submit" value="Добавить мотоцикл">
</form:form>
</body>
</html>
