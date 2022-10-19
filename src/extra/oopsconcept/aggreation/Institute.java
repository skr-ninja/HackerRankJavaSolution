package extra.oopsconcept.aggreation;

import java.util.List;

class Institute {
    String instituteName;
    private List<Department> departments;

    Institute(String instituteName, List<Department> departments) {
        this.instituteName = instituteName;
        this.departments = departments;
    }

	public int getTotalStudentsInInstitute() {
		int noOfStudents = 0;
		List<Student> students;
		for(Department dept: departments) {
			students = dept.getStudents();
			for(Student s: students) {
				noOfStudents++;
			}
		}
		return noOfStudents;
	}
}