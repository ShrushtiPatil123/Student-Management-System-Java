package dao;

import connection.DBConnection;
import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public boolean addStudent(Student student) {

        String sql = "INSERT INTO students(name, roll_no, department, semester, email, phone) VALUES (?, ?, ?, ?, ?, ?)";

        try {

            Connection con = DBConnection.getConnection();
            System.out.println(con);

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, student.getName());
            ps.setString(2, student.getRollNo());
            ps.setString(3, student.getDepartment());
            ps.setInt(4, student.getSemester());
            ps.setString(5, student.getEmail());
            ps.setString(6, student.getPhone());

            int rows = ps.executeUpdate();

            return rows > 0;

        } catch (SQLException e) {

            e.printStackTrace();
            return false;
        }
    }
    public List<Student> getAllStudents() {

    List<Student> studentList = new ArrayList<>();

    String sql = "SELECT * FROM students";

    try {

        Connection con = DBConnection.getConnection();

        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            Student student = new Student();

            student.setId(rs.getInt("student_id"));
            student.setName(rs.getString("name"));
            student.setRollNo(rs.getString("roll_no"));
            student.setDepartment(rs.getString("department"));
            student.setSemester(rs.getInt("semester"));
            student.setEmail(rs.getString("email"));
            student.setPhone(rs.getString("phone"));

            studentList.add(student);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return studentList;
}
public boolean updateStudent(Student student) {

    String sql = "UPDATE students SET name=?, roll_no=?, department=?, semester=?, email=?, phone=? WHERE student_id=?";

    try {

        Connection con = DBConnection.getConnection();

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, student.getName());
        ps.setString(2, student.getRollNo());
        ps.setString(3, student.getDepartment());
        ps.setInt(4, student.getSemester());
        ps.setString(5, student.getEmail());
        ps.setString(6, student.getPhone());
        ps.setInt(7, student.getId());

        int rows = ps.executeUpdate();

        return rows > 0;

    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
public boolean deleteStudent(int id) {

    String sql = "DELETE FROM students WHERE student_id=?";

    try {

        Connection con = DBConnection.getConnection();

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, id);

        int rows = ps.executeUpdate();

        return rows > 0;

    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
}