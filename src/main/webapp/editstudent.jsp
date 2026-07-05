<%@ page import="model.Student" %>

<%
Student student = (Student) request.getAttribute("student");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Student</title>

<link rel="stylesheet" href="css/style.css">

</head>

<body>

<div class="container">

<h1>Edit Student</h1>

<form action="UpdateStudentServlet" method="post">

<input type="hidden" name="id" value="<%= student.getId() %>">

<label>Name</label>
<input type="text" name="name" value="<%= student.getName() %>">

<label>Roll No</label>
<input type="text" name="rollNo" value="<%= student.getRollNo() %>">

<label>Department</label>
<input type="text" name="department" value="<%= student.getDepartment() %>">

<label>Semester</label>
<input type="number" name="semester" value="<%= student.getSemester() %>">

<label>Email</label>
<input type="email" name="email" value="<%= student.getEmail() %>">

<label>Phone</label>
<input type="text" name="phone" value="<%= student.getPhone() %>">

<button type="submit">
Update Student
</button>

</form>

</div>

</body>
</html>