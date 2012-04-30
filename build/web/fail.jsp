<%-- 
    Document   : fail
    Created on : Apr 6, 2012, 11:50:17 AM
    Author     : Bhatti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>fail</title>
    </head>
    <body>
        <h1 style="">Signing In</h1>
        <form action="Controller" method="POST">

            <div style="padding: 100px 100px 100px 500px">
                <h1><b>User Name</b></h1>&nbsp;&nbsp;
                <input type="text" name="userName" value="" size="50" />
                <br/>
                <h1><b>Password</b></h1>&nbsp;&nbsp;
                <input type="text" name="password" value="" size="50" />
                <br/><br/><br/>
                <p style="padding: 0px 0px 0px 100px; ">
                <input type="submit" value="Sign in" name="sign_in" /></p>
                <input type="hidden" name="pageid" value="fail" />
            </div>
        </form>
        <div> <h1 style="color: red">Invalid userName or password</h1></div>
    </body>
</html>
