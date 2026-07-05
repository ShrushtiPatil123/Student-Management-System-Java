package servlet;

import dao.StudentDAO;
import model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/UpdateStudentServlet")
public class UpdateStudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        Student student = new Student();

        student.setId(Integer.parseInt(request.getParameter("id")));
        student.setName(request.getParameter("name"));
        student.setRollNo(request.getParameter("rollNo"));
        student.setDepartment(request.getParameter("department"));
        student.setSemester(Integer.parseInt(request.getParameter("semester")));
        student.setEmail(request.getParameter("email"));
        student.setPhone(request.getParameter("phone"));

        StudentDAO dao = new StudentDAO();

        dao.updateStudent(student);

        response.sendRedirect("ViewStudentsServlet");
    }
}