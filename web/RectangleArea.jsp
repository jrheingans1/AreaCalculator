<%-- 
    Document   : RectangleArea
    Created on : Sep 1, 2014, 11:56:51 PM
    Author     : James
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Area Calculated</title>
    </head>
    <body>
        <h1>The Area of your Rectangle is:</h1>

        <%
            Object obj = request.getAttribute("totalArea");
            if(obj == null){
                out.println("An error in your calculation has occured");
            }else {
                out.println(obj.toString());
            }
        %>

    </body>
</html>
