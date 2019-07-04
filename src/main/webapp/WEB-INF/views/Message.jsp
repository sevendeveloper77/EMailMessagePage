<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>WELCOME TO MESSAGE PAGE!!</h2>
<form:form action="save" method="post" modelAttribute="email" enctype="multipart/form-data">
<pre>
To	 :<form:input path="to"/>  Cc:<form:input path="cc"/>	   
Subject  :<form:input path="subject"/> Bcc:<form:input path="bcc"/>   
Text     :<form:textarea path="text"/>
File     :<input type="file"  name="fileOb"/> 

		<input type="submit" value="SEND"/>
</pre>
</form:form>
${message}
</body>
</body>
</html>