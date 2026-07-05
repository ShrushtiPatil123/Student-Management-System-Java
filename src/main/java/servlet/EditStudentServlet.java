package servlet;

import dao.StudentDAO;
import model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/EditStudentServlet")
public class EditStudentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        StudentDAO dao = new StudentDAO();

        List<Student> students = dao.getAllStudents();

        for(Student s : students){
            if(s.getId() == id){
                request.setAttribute("student", s);
                break;
            }
        }

        request.getRequestDispatcher("editstudent.jsp")
               .forward(request, response);
    }
}