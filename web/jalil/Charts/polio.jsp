<%-- 
    Document   : polio
    Created on : Apr 3, 2012, 4:54:12 AM
    Author     : 13100173
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Measles Pie Chart</title>
        <link rel="stylesheet" href="demo.css"media="screen">
        <link rel="stylesheet" href="demo-print.css"media="print">
        <script src="raphael.js"></script>
        <script src="jquery.js"></script>

        <script src="pie.js"></script>
        <style media="screen">
            #holder {
                margin: -350px 0 0 -350px;
                width: 700px;
                height: 700px;
            }
        </style>
    </head>
    <body>
        <div style="color: #3300cc; font-size: 30px"><h2>Vaccination</h2></div>
        <table>
            <tbody>
                <tr>
                    <th scope="row">Punjab Polio - 40%</th>

                    <td>40%</td>
                </tr>
                <tr>
                    <th scope="row">Sindh Polio - 26%</th>
                    <td>26%</td>
                </tr>
                <tr>

                    <th scope="row">Balochistan Polio - 8%</th>
                    <td>8%</td>
                </tr>
                <tr>
                    <th scope="row">KPK Polio - 18%</th>
                    <td>18%</td>
                </tr>

                <tr>
                    <th scope="row">FATA Polio - 8%</th>
                    <td>8%</td>
                </tr>
            </tbody>
        </table>
        <div id="holder"></div>
        <p id="copy">Pie Chart</p>

    </body>
    </body>
</html>
