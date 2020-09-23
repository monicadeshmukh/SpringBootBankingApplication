<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>

<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />

<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />

</head>
<body style="background-color: black; color: white;">

<!-- The isErrorPage attribute is used to declare that the current page is the error page.
     The exception object can only be used in the error page.-->
    <div style="margin: 30px;">
        <%@ page isErrorPage="true" %>
        Oops! Something went wrong.
        We are sorry for the inconvenience!<br/>
        The following error occured : <%= exception %>
    </div>
	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>
