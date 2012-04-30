<%-- 
    Document   : fail
    Created on : Apr 19, 2012, 6:30:34 PM
    Author     : 13100173
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign In</title>
        <link rel="stylesheet" type="text/css" href="view.css" media="all">
        <script type="text/javascript" src="view.js"></script>

    </head>
    <body id="main_body" >

        <img id="top" src="top.png" alt="">
        <div id="form_container">

            <h1><a>Registration</a></h1>

            <form id="log_in" class="appnitro"  method="post" action="../Controller">
                <div class="form_description">
                    <h2>Login</h2>
                </div>						
                <ul >

                    <li class="">
                        <h3 style="background-color: red"> Please Enter Correct UserName and Password</h3>

                        <p></p>
                    </li>
                    <li id="li_7" >
                        <!--<label class="description" for="element_8"> </label>-->
                        <span>
                            <input type="text" id="user_name" name= "user_name" class="element text" maxlength="255" size="14" value=""/>
                            <label>UserName</label>
                        </span>
                        </li>
                     <li id="li_7">   
                        <span>
                            <input type="password" id="password" name= "password" class="element password" maxlength="255" size="14" value=""/>
                            <label>Password</label>
                        </span> 
                </li>
                    <li class="buttons">
                        <input type="hidden" name="page_id" value="signinfailed" />

                        <input id="saveForm" class="button_text" type="submit" name="submit" value="Submit" />
                    </li>
                </ul>
            </form>	
            <div id="footer">

			All rights reserved by team Core a3
            </div>
        </div>
        <img id="bottom" src="bottom.png" alt="">
    </body>
</html>
