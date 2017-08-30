<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
<h2>uploadPage+${path}</h2>
 ${user.userId}<br>
 ${user.userName}<br>
 ${user.userPassword}<br>
 ${user.userEmail}<br>
 
 

<form action="testFileUpload" method="post" enctype="multipart/form-data">
         文件1: <input type="file" name="file"/><br/>   
 <input type="text" name="desc"/><br/>  
   		<input type="submit" value="上传">
</form>
</body>
</html>
