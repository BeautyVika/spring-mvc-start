<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<body>
<h2>Enter details</h2>
<br>
<br>
<form:form action="showDetails" modelAttribute="employee">
    <br><br>
    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
    Department <form:select path="department">
    <form:options items="${employee.departments}" />
                   <%--<form:option value="Information Technology" label="IT" />
                   <form:option value="Human Resources" label="HR" />
                   <form:option value="Sales" label="Sales" />--%>
               </form:select>
    <br><br>
    Which car do you want?
<%--    <form:radiobutton path="carBrand" value="BMV"/> BMV--%>
<%--    <form:radiobutton path="carBrand" value="Audi"/> Audi--%>
<%--    <form:radiobutton path="carBrand" value="Mercedes"/> Mercedes--%>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}" />
    <br><br>
    Foreign Language(s)
    <form:checkboxes path="languages" items="${employee.listLanguages}" />
<%--    <form:checkbox path="languages" value="English"/> EN--%>
<%--    <form:checkbox path="languages" value="Deught"/> DE--%>
<%--    <form:checkbox path="languages" value="French"/> FR--%>
    <br><br>
    <input type="submit" value="Ok">
</form:form>
<%--<form action="showDetails" method="get">--%>
<%--    <input type="text" name="employeeName" placeholder="Write your name..." />--%>

<%--    <input type="submit"/>--%>
<%--</form>--%>
</body>
</html>


