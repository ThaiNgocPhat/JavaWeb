<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<h1>Product Discount Calculator</h1>
<form action="calculateDiscount" method="post">
    <label for="description">Product Description:</label>
    <input type="text" id="description" name="description" required><br><br>

    <label for="price">Price:</label>
    <input type="number" id="price" name="price" step="0.01" required><br><br>

    <label for="discount">Discount Percent:</label>
    <input type="number" id="discount" name="discount" step="0.01" required><br><br>

    <button type="submit">Calculate Discount</button>
</form>
</body>
</html>
