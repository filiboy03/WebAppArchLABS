<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>

<h1>Registration Form</h1><br />
    
    <form:form  method="post" modelAttribute="student" >
    	<fieldset>
					<label for="id">ID: </label>
					<form:input path="id" id="id" />
						<form:errors path="id" cssStyle="color : red;" />
				
				
    <p>
    <label for="firstName">First name</label>
    <form:input path="firstName"/>
     <form:errors path="firstName" cssStyle="color : red;" />

    </p>
     <p>
    <label for="lastName">Last Name</label>
    <form:input path="lastName"/>
    <form:errors path="lastName" cssStyle="color: red;"/>
   
      </p>
      <p>
    <label for="email">Email</label>
    <form:input path="email"/>
      <form:errors path="email" cssStyle="color: red;"/>

      </p>
       <p>
      <label for="gender">Gender</label>
    <form:select path="gender">
  <form:option value="NONE"> --SELECT--</form:option>
  <form:option value="MALE"></form:option>
  <form:option value="FEMALE"></form:option>
  </form:select>
    
    <form:errors path="email" cssStyle="color: red;"/>

     </p>
      <p>
      <label for="birthday">Birth day</label>
    <form:input path="birthday" id="birthday"/>
       <form:errors path="birthday" cssStyle="color: red;"/>
 
     </p>
    
      <p>
       <label for="area">Phone area code</label>
    <form:input path="phone.area" id="area"/>
    <form:errors path="phone.area" cssStyle="color: red;"/>

      </p>
       <p>
           <label for="prefix">Phone ext.</label>
    <form:input path="phone.prefix" id="area"/>
     <form:errors path="phone.prefix" cssStyle="color: red;"/>

      </p>
       <p>
           <label for="number">Phone number</label>
    <form:input path="phone.number" id="area"/>
       <form:errors path="phone.number" cssStyle="color: red;"/>
  
      </p>
      
    	<p id="buttons">
					<input id="reset" type="reset" > 
					<input id="submit" type="submit" value="Add Student">
				</p>
    </fieldset>
    
    </form:form>
    
</body>
</html>