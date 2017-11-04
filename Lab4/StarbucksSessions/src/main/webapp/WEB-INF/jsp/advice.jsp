 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<title>Starbuck's</title>
</head>
<body>
	<c:choose>
  		<c:when test = "${filisession eq null}">
			You have to login!
 			
 			<form action = "login">
				<p><input type="submit" value = "Login"/></p> 
 			</form> 
		</c:when>
		
   <c:otherwise>
		
			<h2> Hello ${filisession.name}</h2>

<h2>Ask for advice about your favorite roast:</h2>
<p />
<form action = "advice" method="post">
	<select name="roastKey"   >
	   	<option value="-">  --Select Roast-- </option>
		
		  		<c:forEach var="roast" items="${roasts}">
		    		<option value="${roast.key}" > ${roast.value}</option>
				</c:forEach>
		    </select>
 
 	<p><input type="submit" value = "Submit"/></p>
</form>
         </c:otherwise>
         
  </c:choose>
  
 </body>
</html>