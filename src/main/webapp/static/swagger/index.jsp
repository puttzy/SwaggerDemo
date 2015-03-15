<%--
  Created by IntelliJ IDEA.
  User: Dan
  Date: 3/14/2015
  Time: 8:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Swagger UI</title>
  <link href='css/typography.css' media='screen' rel='stylesheet' type='text/css'/>
  <link href='css/reset.css' media='screen' rel='stylesheet' type='text/css'/>
  <link href='css/screen.css' media='screen' rel='stylesheet' type='text/css'/>
  <link href='css/reset.css' media='print' rel='stylesheet' type='text/css'/>
  <link href='css/screen.css' media='print' rel='stylesheet' type='text/css'/>
  <script type="text/javascript" src="lib/shred.bundle.js"></script>
  <script src='lib/jquery-1.8.0.min.js' type='text/javascript'></script>
  <script src='lib/jquery.slideto.min.js' type='text/javascript'></script>
  <script src='lib/jquery.wiggle.min.js' type='text/javascript'></script>
  <script src='lib/jquery.ba-bbq.min.js' type='text/javascript'></script>
  <script src='lib/handlebars-2.0.0.js' type='text/javascript'></script>
  <script src='lib/underscore-min.js' type='text/javascript'></script>
  <script src='lib/backbone-min.js' type='text/javascript'></script>
  <script src='lib/swagger-client.js' type='text/javascript'></script>
  <script src='swagger-ui.js' type='text/javascript'></script>
  <script src='lib/highlight.7.3.pack.js' type='text/javascript'></script>
  <script src='lib/marked.js' type='text/javascript'></script>

  <!-- enabling this will enable oauth2 implicit scope support -->
  <script src='lib/swagger-oauth.js' type='text/javascript'></script>
  <script type="text/javascript">
    $(function () {
      window.swaggerUi = new SwaggerUi({
        url:"../../api-docs",
        dom_id:"swagger-ui-container"
      });

      window.swaggerUi.load();
    });
  </script>
</head>

<body class="swagger-section">
<div id='header'  style="background-color: #172952">
  <div class="swagger-ui-wrap" style="background-color: #172952">
    <a href="http://www.CardinalSolutions.com"><img src="images/cardinallogo.png" /></a>

  </div>

</div>

<div id="message-bar" class="swagger-ui-wrap">&nbsp;</div>
<div id="swagger-ui-container" class="swagger-ui-wrap"></div>
</body>
</html>

