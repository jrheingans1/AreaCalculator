<%-- 
    Document   : CircleArea
    Created on : Sep 3, 2014, 8:56:21 PM
    Author     : jrheingans1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Circle Area Calculator</title>
    </head>
    <body>
        <h1>The Area of your Circle is:</h1>
        
        <%
            Object obj = request.getAttribute("totalCircleArea");
            if(obj == null){
                out.println("An error in your calculation has occured");
            }else {
                out.println(obj.toString());
            }
        %>
    </body>
</html>
