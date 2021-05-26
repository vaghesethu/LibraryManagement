<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library Management Home</title>
</head>
<body>

<form action="saveBook">
Book Id:<input type="text" name="bookId"><br>
Quantity:<input type="text" name="quantity"><br>
Book Name:<input type="text" name="bookName"><br>
Genre:<input type="text" name="genre"><br>
<input type="submit" value="Save">
</form><br><br>

<form action="editBook">
Book Id:<input type="text" name="bookId"><br>
<input type="submit" value="Update">
</form><br><br>

<form action="deleteBook">
Book Id:<input type="text" name="bookId"><br>
<input type="submit" value="Delete">
</form><br><br>

<form action="getBooks">
<input type="submit" value="Get All">
</form><br><br>

<form action="getByType">
Genre:<input type="text" name="genre"><br>
<input type="submit" value="Get Genre">
</form><br><br>

</body>
</html>