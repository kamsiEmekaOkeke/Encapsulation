public class Main {
    public static void main(String[] args) {
        CMP202 cmp = new CMP202();
        cmp.printuserDetails();

        Person person = new Person();
        person.setName("David Smith");
        person.setPassword("1234567");
        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Password: " + person.getPass());

        Person student = new Person("Bingham", "1234567", "Joe", "BHU/04/05/0056", 0);
        System.out.println("Student School Name: " + student.getSchoolName());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Password: " + student.getPass());
        System.out.println("Student Matric No: " + student.getMatricNo());

        Person staff = new Person("Bingham", "654321", "Abu", "", 667);
        System.out.println("Staff School Name: " + staff.getSchoolName());
        System.out.println("Staff Name: " + staff.getName());
        System.out.println("Staff Password: " + staff.getPass());
        System.out.println("Staff No: " + staff.getStaffNo());


        Physics physics = new Physics();
        float velocity1 = physics.calculateVelocity(100, 5);
        System.out.println("Velocity (distance/time): " + velocity1);

        float velocity2 = physics.calculateVelocity(20, 3, 4);
        System.out.println("Velocity (initial velocity + acceleration * time): " + velocity2);
    }
}
