package Oops_concept;

//run-time_polymorpism
interface vechicle{
	 static void start() {
		System.out.println("STARTED");
	}	
}
class bike implements vechicle{
	public void start() {
		System.out.println("moving");
	}
}
 class Run_Time_Polymorphism {
	public static void main(String[] args) {
		bike v=new bike();
		v.start();
		


	}




}
