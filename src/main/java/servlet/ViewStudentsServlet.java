package servlet;

import dao.StudentDAO;
import model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/ViewStudentsServlet")
public class ViewStudentsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        StudentDAO dao = new StudentDAO();

        List<Student> students = dao.getAllStudents();

        request.setAttribute("students", students);

        request.getRequestDispatcher("viewstudents.jsp")
               .forward(request, response);
    }
}