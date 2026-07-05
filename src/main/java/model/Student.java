package model;

public class Student {

    private int id;
    private String name;
    private String rollNo;
    private String department;
    private int semester;
    private String email;
    private String phone;

    public Student() {
    }

    public Student(int id, String name, String rollNo, String department,
                   int semester, String email, String phone) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
        this.semester = semester;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}