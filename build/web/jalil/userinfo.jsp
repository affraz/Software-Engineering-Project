<%-- 
    Document   : userinfo
    Created on : Apr 25, 2012, 6:11:57 PM
    Author     : Bhatti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Info</title>
    </head>
    <body>
        <h1>You can Only View user info if you are an administrator.</h1>
        <form id="user_info"  method="post" action="../Controller">
            <input type="hidden" id="page_id" name="page_id" value="user_info_page"> 
            <input type="submit" value="I am an administrator">
        </form>
    </body>
</html>
