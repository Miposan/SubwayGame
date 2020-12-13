<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>首页</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
  <style>
    .btn-right{
      margin-top: 10px !important;
    }
    .btn-group-right{
      position: absolute;
      top: 30px;
      right: 10px;
    }
    .btn-group-bottom{
      position: absolute;
      bottom: 30px;
      left: 10px;
    }
    .btn-bottom{
      margin-left: 10px !important;
    }
  </style>
</head>
<body>
<div class="btn-group-vertical btn-group-right">
  <button type="button" class="btn btn-primary btn-right">Primary</button>
  <button type="button" class="btn btn-primary btn-right">Primary</button>
  <button type="button" class="btn btn-primary btn-right">Primary</button>
  <button type="button" class="btn btn-primary btn-right">Primary</button>
</div>
<div class="btn-group btn-group-bottom">
  <button type="button" class="btn btn-primary btn-bottom">Primary</button>
  <button type="button" class="btn btn-primary btn-bottom">Primary</button>
  <button type="button" class="btn btn-primary btn-bottom">Primary</button>
  <button type="button" class="btn btn-primary btn-bottom">Primary</button>
</div>
</body>
</html>