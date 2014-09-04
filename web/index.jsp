<%-- 
    Document   : index
    Created on : Sep 4, 2014, 2:28:19 PM
    Author     : James
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Geometric Calculator</title>
    </head>
    <body>
        <h1>Welcome to the World of Shapes!</h1>
        <form id="rectangle" name="rectangle" method="POST" action="GeometricController">
            <h2>Rectangle Calculator</h2>
            <p>Enter a Length:<input id="length" name="length" type="text" value=""/></p>
            <p>Enter a Width:<input id="width" name="width" type="text" value=""/></p>

            <input name="submit" type="submit" value="Submit"/>

        </form>
        <form id="circle" name="circle" method="POST" action="GeometricController">
            <h2>Circle Calculator</h2>
            <p>Enter a Radius:<input id="radius" name="radius" type="text" value=""/></p>

            <input name="submit2" type="submit" value="Submit"/>

        </form>
        <form id="triangle" name="triangle" method="POST" action="GeometricController">
            <h2>Triangle Calculator</h2>
            <p>Enter the Length of side A:<input id="sideA" name="sideA" type="text" value=""/></p>
            <p>Enter the Length of side B:<input id="sideB" name="sideB" type="text" value=""/></p>

            <input name="submit3" type="submit" value="Submit"/>

        </form>
        <h2>
            <%
            Object obj = request.getAttribute("totalArea");
            if (obj == null) {
                out.println("");
            } else {
                out.println("Result: " + obj.toString());
            }
        %>
        </h2>
    </body>
</html>
