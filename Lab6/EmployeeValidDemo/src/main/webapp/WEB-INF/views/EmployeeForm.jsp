<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Add Employee Form</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/main.css"/>">
</head>
<body>

	<section>
		<div class="jumbotron">
			<div class="pull-right" style="padding-right: 50px">
				<a href="?language=en">English</a>|<a href="?language=fr">French</a>
			</div>

		</div>
	</section>
	
	<div id="global">
		<form:form commandName="employee" enctype="multipart/form-data" action="employee_save" method="post" >
			<fieldset>
				<legend>Add an employee</legend>
				<p>
					<form:errors path="*" cssStyle="color : red;" />
				</p>
				<p>
					<label for="id"><spring:message code="employee.form.id.label"/> </label>
					<form:input path="id" id="id" />
					<div style="text-align: center;">
						<form:errors path="id" cssStyle="color : red;" />
					</div>
			    	</p>
				<p>
					<label for="firstName"><spring:message code="employee.form.firstname.label"/> </label>
					<form:input path="firstName" />
					<div style="text-align: center;">
						<form:errors path="firstName" cssStyle="color : red;" />
					</div>
				</p>
				<p>
					<label for="lastName"><spring:message code="employee.form.lastname.label"/></label>
					<form:input path="lastName" />
					<div style="text-align: center;">
						<form:errors path="lastName" cssStyle="color : red;" />
					</div>
				</p>

				<p>
					<label for="birthDate"><spring:message code="employee.form.dateofbirth.label"/> </label>
					<form:input path="birthDate" id="birthDate" />
					<form:errors path="birthDate" cssStyle="color : red;" />
				</p>
				<p>
					<label for="salaryLevel"><spring:message code="employee.form.salary.label"/> </label>
					<form:input path="salaryLevel" id="salaryLevel" />
					<div style="text-align: center;">
						<form:errors path="salaryLevel" cssStyle="color : red;" />
					</div>
				</p>
				<h4><spring:message code="employee.address"/></h4>
				<p>
					<label for="street"><spring:message code="employee.form.street.label"/> </label>
					<form:input path="address.street" id="street" />
					<div style="text-align: center;">
						<form:errors path="address.street" cssStyle="color : red;" />
					</div>
				</p>
				<p>
					<label for="state"><spring:message code="employee.form.state.label"/></label>
					<form:input path="address.state" id="state" />
					<div style="text-align: center;">
						<form:errors path="address.state" cssStyle="color : red; " />
					</div>
				</p>
				<p>
					<label for="zipCode"><spring:message code="employee.form.zip.label"/></label>
					<form:input path="address.zipCode" id="zipCode" />
					<div style="text-align: center;">
						<form:errors path="address.zipCode" cssStyle="color : red; " />
					</div>
				</p>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="employeeImage"><spring:message code="employee.form.employeeImage.label"/></label>
					<div class="col-lg-10">
						<form:input id="employeeImage" path="employeeImage" type="file"
							class="form:input-large" />
					</div>
				</div>
				
				<p id="buttons">
					<input id="reset" type="reset" tabindex="4"> 
					<input id="submit" type="submit" tabindex="5" value="Add Employee">
				</p>
			</fieldset>
		</form:form>
	</div>
</body>
</html>
