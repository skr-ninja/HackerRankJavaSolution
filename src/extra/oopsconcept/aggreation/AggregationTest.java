package extra.oopsconcept.aggreation;

import java.util.ArrayList;
import java.util.List;

public class AggregationTest {

    public static void main(String[] args) {

        Student s1 = new Student("John", 1, "CSE");
        Student s2 = new Student("Peeter", 2, "CSE");
        Student s3 = new Student("Marry", 3, "EE");
        Student s4 = new Student("Tom", 4, "EE");

        // Making list of CSE Students
        List<Student> cse_students = new ArrayList<Student>();
        cse_students.add(s1);
        cse_students.add(s2);

        // Making List of EE Students
        List<Student> ee_students = new ArrayList<Student>();
        ee_students.add(s3);
        ee_students.add(s4);

        Department cse = new Department("CSE", cse_students);
        Department ee = new Department("EE", ee_students);

        List<Department> departments = new ArrayList<Department>();
        departments.add(cse);
        departments.add(ee);

        // creating an instance of Institute.
        Institute institute = new Institute("SATI", departments);
        System.out.println("Total students in institute are: "+ institute.getTotalStudentsInInstitute());
    }
}
