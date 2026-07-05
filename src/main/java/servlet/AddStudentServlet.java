package servlet;

import dao.StudentDAO;
import model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Student student = new Student();

        student.setName(request.getParameter("name"));
        student.setRollNo(request.getParameter("rollNo"));
        student.setDepartment(request.getParameter("department"));
        student.setSemester(Integer.parseInt(request.getParameter("semester")));
        student.setEmail(request.getParameter("email"));
        student.setPhone(request.getParameter("phone"));

        StudentDAO dao = new StudentDAO();

        if (dao.addStudent(student)) {
            response.sendRedirect("ViewStudentsServlet");
        } else {
            response.getWriter().println("Failed to add student.");
        }
    }
}