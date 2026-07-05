<%@ page import="java.util.List" %>
<%@ page import="model.Student" %>

<%
List<Student> students = (List<Student>) request.getAttribute("students");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Students</title>
<link rel="stylesheet" href="css/style.css">
</head>

<body>

<div class="container">

<h1>Student List</h1>

<table border="1">

<tr>
<th>ID</th>
<th>Name</th>
<th>Roll No</th>
<th>Department</th>
<th>Semester</th>
<th>Email</th>
<th>Phone</th>
<th>Edit</th>
<th>Delete</th>
</tr>

<%
if(students != null){
    for(Student s : students){
%>

<tr>

<td><%= s.getId() %></td>
<td><%= s.getName() %></td>
<td><%= s.getRollNo() %></td>
<td><%= s.getDepartment() %></td>
<td><%= s.getSemester() %></td>
<td><%= s.getEmail() %></td>
<td><%= s.getPhone() %></td>

<td>
<a href="EditStudentServlet?id=<%= s.getId() %>">Edit</a>
</td>

<td>
<a href="DeleteStudentServlet?id=<%= s.getId() %>">Delete</a>
</td>

</tr>

<%
    }
}
%>

</table>

</div>

</body>
</html>