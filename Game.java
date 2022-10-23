package dBasketRace;


public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Employee1 = new Employee(20);
		Employee1.hit();
	Employee Employee2 = new Employee(20);
		Employee2.hit();
		
	if(Employee1.score < Employee2.score) {
		System.out.println("Employee 2 kazandi");
	}else if(Employee1.score == Employee2.score) {
		System.out.println("berabere");
	}else {
		System.out.println("Employee1 kazandi");
	}
	
	}

}
