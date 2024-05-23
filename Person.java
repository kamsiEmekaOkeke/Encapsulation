public class Person {
    private String name;
    private String password;
    private String matricNo;
    private String schoolName;
    private int staffNo;

    // Default constructor
    public Person() {
    }

    // Parameterized constructor for students and staff
    public Person(String schoolName, String password, String name, String matricNo, int staffNo) {
        this.schoolName = schoolName;
        this.password = password;
        this.name = name;
        this.matricNo = matricNo;
        this.staffNo = staffNo;
    }

    String getName() {
        return name;
    }

    String getPass() {
        return password;
    }

    String getMatricNo() {
        return matricNo;
    }

    String getSchoolName() {
        return schoolName;
    }

    int getStaffNo() {
        return staffNo;
    }

    void setName(String name) {
        this.name = name;
    }

    void setPassword(String password) {
        this.password = password;
    }
}
