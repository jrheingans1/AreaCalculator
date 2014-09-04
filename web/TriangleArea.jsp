<%-- 
    Document   : TriangleArea
    Created on : Sep 3, 2014, 9:37:38 PM
    Author     : jrheingans1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Triangle Side</title>
    </head>
    <body>
        <h1>The Length of the side of you Triangle is:</h1>
        <%
            Object obj = request.getAttribute("totalTriangleArea");
            if (obj == null) {
                out.println("An error in your calculation has occured");
            } else {
                out.println(obj.toString());
            }
        %>
    </body>
</html>
