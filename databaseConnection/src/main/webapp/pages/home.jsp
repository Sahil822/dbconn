<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


      <h1>welcome to home</h1>
      
      <form action="add" method="post">
      Enter id:<input type="text" name="id"><br> 
      Enter name:<input type="text" name="ename"><br>
      Enter pass:<input type="text" name="pass"><br>
      <input type="submit" value="add_value">      
      </form>
      <hr>
      
      <form action="id" method="get">
      Enter id:<input type="text" name="id"><br>
      <input type="submit" value="fetch_by_id">      
      </form>
      <hr>
       
      <form action="name" method="get">
      Enter name:<input type="text" name="ename"><br>
      <input type="submit" value="fetch_by_name">      
      </form>
      <hr>
       
       <form action="dlid" method="get">
      Enter id:<input type="text" name="id"><br>
      <input type="submit" value="delete_by_id">      
      </form>
      <hr>
     
      <form action="update" method="get">
      Enter id:<input type="text" name="id"><br>
      Enter name:<input type="text" name="ename"><br>
      Enter password:<input type="password" name="pass"><br>
      <input type="submit" value="update">      
      </form>
      <hr>
      
      <form action="find" method="post">
      <input type="submit" value="find_all">      
      </form>
      <hr>
    
      
</body>
</html>