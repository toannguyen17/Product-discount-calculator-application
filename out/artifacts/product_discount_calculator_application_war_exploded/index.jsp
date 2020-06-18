<%--
  Created by IntelliJ IDEA.
  User: toanv
  Date: 18/06/2020
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <form action="/display-discount" method="POST">
    <input type="text" name="description" placeholder="Product Description" /><br />
    <input type="text" name="price" placeholder="List Price" /><br />
    <input type="text" name="percent" placeholder="Discount Percent" /><br />
    <button type="submit">Calculator</button>
  </form>
  </body>
</html>
