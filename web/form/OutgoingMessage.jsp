<%-- 
    Document   : OutgoingMessage
    Created on : Apr 22, 2012, 8:51:04 PM
    Author     : 13100173
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>OutGoing Message</title>
        <link rel="stylesheet" type="text/css" href="view.css" media="all">
        <script type="text/javascript" src="view.js"></script>

    </head>
    <body id="main_body" >

        <img id="top" src="top.png" alt="">
        <div id="form_container">

            <h1>Message</h1>

            <form id="message" class="appnitro"  method="post" action="../Controller">
                <div class="form_description">
                    <h2>Message</h2>
                </div>						
                <ul >

                    <!--<li class="section_break">
                        <h3></h3>

                        <p></p>
                    </li>-->
                    <li id="li_7" >
                        <!--<label class="description" for="element_8"> </label>-->
                        <span>
                            <input type="text" id="phn_number" name= "phn_number" class="element text" maxlength="255" size="14" value=""/>
                            <label>phone Number</label>
                        </span>
                        </li>
                     <li id="li_7">   
                        <span>
                            <textarea id="outgoing_message" name="outgoing_message" class="element textarea medium" style="min-width: 300px"></textarea>
                            <label>Message</label>
                        </span> 
                </li>
                    <li class="buttons">
                        <input type="hidden" name="page_id" value="outgoing_message_page" />

                        <input id="send_message" class="button_text" type="submit" name="submit" value="Submit" />
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

