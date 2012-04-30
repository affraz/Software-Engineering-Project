<%-- 
    Document   : admin
    Created on : Apr 6, 2012, 11:54:07 AM
    Author     : Bhatti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="title" content="Web site" />
        <meta name="description" content="Site description here" />
        <meta name="keywords" content="keywords here" />
        <meta name="language" content="en" />
        <meta name="subject" content="Site subject here" />
        <meta name="robots" content="All" />
        <meta name="copyright" content="Your company" />
        <meta name="abstract" content="Site description here" />
        <meta name="MSSmartTagsPreventParsing" content="true" />
        <link id="theme" rel="stylesheet" type="text/css" href="style.css" title="theme" />
        <script type="text/javascript" language="javascript" src="js/jquery.js"></script>
        <script type="text/javascript" language="javascript" src="js/custom.js"></script>
        <script type="text/javascript" language="javascript" src="js/addon.js"></script>
    </head>
    <body> 
        <div id="top"> 
            <div class="overlay"></div> 
        </div>  
        <div id="wrapper"> 
            <div class="overlay"></div>  
            <div class="border-top"></div>  
            <div class="content"> 
                <div id="container"> 
                    <div class="hd"> 
                        <div id="container-top"></div>  
                        <div id="banner"></div>  
                        <div id="hmenu-wpr"> 
                            <ul id="hmenu" class="sf-menu sf-js-enabled sf-shadow">
                                <li class="current" style="border:none"> 
                                    <a class="toplvl sf-with-ul" href="admin.jsp">Home</a> 
                                </li>
                                <li> 
                                    <a class="toplvl" href="jalil/analysis.jsp">Analysis</a>  
                                    <!--<ul>
                                      <li> 
                                        <a href="#">pi chart</a> 
                                      </li>
                                      <li> 
                                        <a href="#">Bar Chart</a> 
                                      </li>                   
                                      <li> 
                                        <a href="#">Jalil Chart</a> 
                                      </li>
                                    </ul> -->
                                </li>
                                <li> 
                                    <a class="toplvl" href="admin.jsp">Services</a>  
                                    <!-- <ul>
                                        <li> 
                                            <a href="#">menu item</a> 
                                        </li>
                                        <li class="current"> 
                                            <a href="#">menu item</a>  
                                            <ul>
                                                <li class="current">
                                                    <a href="#">menu item</a>
                                                </li>
                                                <li>
                                                    <a href="#">menu item</a>
                                                </li>
                                                <li>
                                                    <a href="#">menu item</a>
                                                </li>
                                                <li>
                                                    <a href="#">menu item</a>
                                                </li>
                                                <li>
                                                    <a href="#">menu item</a>
                                                </li>
                                            </ul> 
                                        </li>
                                        <li> 
                                            <a href="#">menu item</a>  
                                            <ul>
                                                <li>
                                                    <a href="#">menu item</a>
                                                </li>
                                                <li>
                                                    <a href="#">menu item</a>
                                                </li>
                                                <li>
                                                    <a href="#">menu item</a>
                                                </li>
                                                <li>
                                                    <a href="#">menu item</a>
                                                </li>
                                                <li>
                                                    <a href="#">menu item</a>
                                                </li>
                                            </ul> 
                                        </li>
                                        <li> 
                                            <a href="#">menu item</a>  
                                            <ul>
                                                <li>
                                                    <a href="#">menu item</a>
                                                </li>
                                                <li>
                                                    <a href="#">menu item</a>
                                                </li>
                                                <li>
                                                    <a href="#">menu item</a>
                                                </li>
                                                <li>
                                                    <a href="#">menu item</a>
                                                </li>
                                                <li>
                                                    <a href="#">menu item</a>
                                                </li>
                                            </ul> 
                                        </li>
                                    </ul> -->
                                </li>
                                <li> 
                                    <a class="toplvl" href="about_us.html">About Us</a> 
                                </li>
                                <li style=""> 
                                    <a class="toplvl" href="jalil/Yourprofile.jsp">Jalil</a>  
                                    <ul>
                                        <li> 
                                            <a href="jalil/Yourprofile.jsp">Profile Settings</a> 
                                        </li>
                                        <li class="current"> 
                                            <a href="index.jsp">Log out</a>  

                                        </li>
                                    </ul>
                                </li>
                            </ul> 
                        </div> 
                    </div>  
                    <div class="bd"> 
                        <div id="page"> 
                            <!-- MAIN COLUMN -->  
                            <div id="main"> 
                                <div class="content"> 
                                    <h1 style="">Welcome Sehat</h1>  
                                    <!--<p> 
                                      <img src="images/bizwoman-1.png" style="float:right;margin-left:20px" /> Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor. Cras elementum ultrices diam. Maecenas ligula massa, varius a, semper congue, euismod non, mi.
                                    </p>-->  
                                    <h2 style="margin-top:35px;">Abstract</h2>  
                                    <p>Health care has been a matter of universal concern lately. And more so in developing nations outspread of various diseases claims lives of a million every day.</p>  
                                    <p>To address the problems and challenges faced in current efforts, we propose design of a system to abridge the gap between the needs and supply of medical facilities, thereby maximizing these facilities for all. </p>  
                                    <p>By exploiting the ease of availability of GSM as means of communication, we aim to design a system which will provide direct communication between the natives of rural areas and relevant doctors and paramedics.</p>
                                    <p>This will primarily focus on promoting awareness about cure and prevention of prevalent diseases such as dengue and malaria.</p>
                                    <div style="margin-top:25px;"> 
                                        <!-- TO REMOVE -->  
                                        <h3>Some Facts:</h3>  
                                        <p>73 Infants out of every thousand die before their first birthday</p>
                                        <p>400 mothers died due to complications of pregnancy per 100,000 live births in 2004-05</p>
                                        <p>Hundreds of people die every week through various diseases</p>


                                    </div>

                                </div> 
                            </div>  
                            <!-- END MAIN -->  
                            <!-- SIDEBAR  --> 

                            <div id="sidebar"> 
                                <div class="content">
                                    <!-- MYCODING sTARTS --> 
                                    <div class="sidebox1"> 
                                        <h2>Quick Links</h2>  
                                        <div class="vmenu"> 
                                            <ul>
                                                <li>
                                                    <a href="form/Registration.jsp">Add User</a>
                                                </li>
                                                <li>
                                                    <a href="removeUser.jsp">Remove User</a>
                                                </li>
                                                <li>
                                                    <a href="jalil/userinfo.jsp">User Information</a>
                                                </li>
                                                <li>
                                                    <a href="form/OutgoingMessage.jsp">send User a Message</a>
                                                </li>
                                            </ul> 
                                        </div> 
                                    </div>
                                    <!-- MYCODING END --> 
                                    <div class="sidebox1"> 
                                        <h2>Menu</h2>  
                                        <div class="vmenu"> 
                                            <ul>
                                                <li>
                                                    <a href="jalil/Doctors.jsp">Doctors</a>
                                                </li>
                                                <li>
                                                    <a href="jalil/Offices.jsp">Offices near you</a>
                                                </li>
                                                <li>
                                                    <a href="jalil/News.jsp">news</a>
                                                </li>
                                                <li>
                                                    <a href="jalil/disease.html">Data</a>
                                                </li>
                                            </ul> 
                                        </div> 
                                    </div>  
                                    <!-- <div> 
                                      <img src="images/business-man-1.png" style="width:100%" /> 
                                    </div>-->  
                                    <div class="sidebox1"> 
                                        <h2>Graphs</h2> <!-- Polio,Measles , TB, Hepatitus,  --> 
                                        <p>By exploiting the ease of availability of GSM as means of communication, we aim to design a system which will provide direct communication between the natives of rural areas and relevant doctors and paramedics.</p>
                                        <p>This will primarily focus on promoting awareness about cure and prevention of prevalent diseases such as dengue and malaria.</p>
                                    </div> 
                                </div> 
                            </div>  
                            <!-- END SIDEBAR  -->  
                            <div class="clear" style="height:60px"></div> 
                        </div> 
                    </div>  
                    <div class="ft"> 
                        <div id="footer"> 
                            <div class="content"> 
                                <p>
                                    <a href="http://www.bforbook.blogspot.com">Hyder</a> &nbsp;Developed By Rifa.
                                </p> 
                            </div> 
                        </div>  
                        <div id="container-bottom"></div> 
                    </div> 
                </div> 
            </div> 
        </div>  
        <div class="clear"></div> 
    </body>
</html>
