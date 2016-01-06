<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Добавление мотоцикла</title>
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>
<body>
<form:form method="post" modelAttribute="motorcycle" action="saveMotorcycle">
    <form:hidden path="id"/>
    <div>
        <form:label path="modelName">Модель мотоцикла</form:label>
        <form:input path="modelName"/>
    </div>


    <div>
        <form:select path="classMotorcycle.id">
            <form:options items="${classesMotorcycles}"/>
        </form:select>
        <a href="newClassMoto">Добавить новый класс мотоцикла</a>
    </div>
    <div>
        <form:select path="brand.id">
            <form:options items="${brandsMotorcycles}"/>
        </form:select>
        <a href="newBrand">Добавить производителя мотоцикла</a>
    </div>

    <div>
        <form:select path="motorType.id">
            <form:options items="${motorTypes}"/>
        </form:select>
        <a href="newMotorType">Добавить тип двигателя</a>
    </div>
    <div>
        <form:select path="locationCylindersType.id">
            <form:options items="${locationCylindersTypes}"/>
        </form:select>
        <a href="newLocationCylindersType">Добавить тип расположения цилиндров</a>
    </div>
    <div>
        <form:label path="motorCapacity">Объём двигателя</form:label>
        <form:input path="motorCapacity"/>
    </div>
    <div>
        <form:label path="power">Мощность</form:label>
        <form:input path="power"/>
    </div>
    <div>
        <form:label path="maxSpeed">Максимальная скорость</form:label>
        <form:input path="maxSpeed"/>
    </div>
    <div>
        <form:label path="numberCylinders">Количество цилиндров</form:label>
        <form:input path="numberCylinders"/>
    </div>
    <div>
        <form:select path="driveType.id">
            <form:options items="${driveTypes}"/>
        </form:select>
        <a href="newDriveType">Добавить тип привода</a>
    </div>
    <div>
        <form:checkbox path="electricStarter" label="Электрический стартер"/>
    </div>
    <div>
        <form:select path="coolingType.id">
            <form:options items="${coolingTypes}"/>
        </form:select>
        <a href="newCoolingType">Добавить тип охлаждения</a>
    </div>
    <div>
        <form:select path="fuelSupplyType.id">
            <form:options items="${fuelSupplyTypes}"/>
        </form:select>
        <a href="newFuelSupplyType">Добавить тип подачи топлива</a>
    </div>
    <div>
        <form:label path="fuelTankCapacity">Объём топливного бака</form:label>
        <form:input path="fuelTankCapacity"/>
    </div>
    <div>
        <form:select path="frontSuspensionType.id">
            <form:options items="${frontSuspensionTypes}"/>
        </form:select>
        <a href="newFrontSuspensionType">Добавить тип передней подвески</a>
    </div>
    <div>
        <form:checkbox path="controlFrontSuspension" label="Контроль передней подвески"/>
    </div>
    <div>
        <form:select path="backSuspensionType.id">
            <form:options items="${backSuspensionTypes}"/>
        </form:select>
        <a href="newBackSuspensionType">Добавить тип задней подвески</a>
    </div>
    <div>
        <form:checkbox path="controlBackSuspension" label="Контроль задней подвески"/>
    </div>
    <input type="submit" value="Добавить мотоцикл">
</form:form>

<div class="out-moto">
    <table>
        <tr>
            <th>Модель мотоцикла</th>
            <th>Класс мотоцикла</th>
            <th style="width: 30px">Электрический стартер</th>
        </tr>
        <c:forEach var="moto" items="${motorcycles}">
            <tr>
                <td>${moto.modelName}</td>
                <td>${moto.classMotorcycle.name}</td>
                <td><c:if test="${moto.electricStarter}">
                    <input type="checkbox" checked/>
                </c:if>
                    <c:if test="${!moto.electricStarter}">
                        <input type="checkbox"/>
                    </c:if>
                </td>
                <td><a href="delete/${moto.id}">Удалить</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
