package school.basic;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Student");
        Student marcel = new Student("Marcel", 23);
        Student lucas = new Student("Lucas", 24);
        Student dominik = new Student("Dominik", 23);
        Student timbo = new Student("Timbo", 23);
        Student nick = new Student("Nick", 25);

        School gdrs = new School("gdrs", 10);
        gdrs.print();
        gdrs.addStudent(marcel);
        gdrs.addStudent(lucas);
        gdrs.addStudent(timbo);
        gdrs.addStudent(dominik);
        gdrs.addStudent(nick);
        gdrs.print();
        gdrs.deleteStudent(0);
        gdrs.print();
        gdrs.deleteStudent(-6);
        gdrs.deleteStudent(1);
        gdrs.print();
        gdrs.addStudent(nick);
        gdrs.print();
        System.out.println(gdrs.getAverageAge());
    }
}
