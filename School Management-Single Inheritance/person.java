package studentmanagement;
public class person {
      
	private String name;
	private int age;
	
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	void displayPersonDetails() {
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
	}
}


class Student extends person {
	
	private int rollNo;
	private String course;
	
	
	void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	void setCourse(String course) {
		this.course = course;
	}
	
	 void displayStudentDetails() {
		System.out.println("Roll Number: "+ rollNo);
		System.out.println("Course: "+ course);
	 }	
}
