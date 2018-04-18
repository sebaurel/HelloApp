<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: SeB
  Date: 17/04/2018
  Time: 09:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String phrase = (String)request.getAttribute("phrase"); %>

<html>
<head>
    <title>Title</title>
    <link type="text/css" href="styles.css" rel="stylesheet" >
</head>
<body>
 <p><%= phrase%></p>

</body>
</html>
