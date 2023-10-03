package DefaultSorting;


class Student implements Comparable<Student> {
	int marks;

	Student(int marks){
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "Sanjay mark :"+marks;
	}
	public int compareTo(Student s) 
	{
		return this.marks-s.marks;
		//return s.marks-this.marks;
	}
	



}
