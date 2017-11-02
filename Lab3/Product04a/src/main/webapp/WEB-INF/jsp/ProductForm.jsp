 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>
<html>
<head>
<title>Add Product Form</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>

<div id="global">

<form:form modelAttribute="newProduct" action="product" method="post">
    <fieldset>
        <legend>Add a product</legend>
        <p>
    <label for="category">Category </label> 
        <form:select id="category" path="category.id">
<form:option value="0" label="--Select Category"/>
<form:options items="${categories}" itemLabel="name" itemValue= "id"/>
</form:select>
    </p>
 	
         
        <p>
            <label for="name">Product Name: </label>
            <form:input type="text" id="name" path="name" 
                tabindex="1"/>
        </p>
        <p>
            <label for="description">Description: </label>
            <form:input type="text" id="description" value= "${product.description}"
                path="description" tabindex="2"/>
        </p>
        <p>
            <label for="price">Price: </label>
            <form:input type="text" id="price" path="price" 
                tabindex="3"/>
        </p>
        <p id="buttons">
            <input id="reset" type="reset" tabindex="4"/>
            <input id="submit" type="submit" tabindex="5" value="Add Product"/>
        </p>
    </fieldset>
</form:form>
</div>
</body>
</html>
