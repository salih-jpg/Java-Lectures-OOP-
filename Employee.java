package dBasketRace;
import java.util.Random;

public class Employee {
	public int score = 0;
	private int hits;
	
	public Employee(int hits) {
	this.hits = hits;
	}
	
	public boolean hit() {
		Random rnd = new Random();
		for(int i=0; i< hits; i++) {
			
			if(rnd.nextInt(100) >= 50) {
				int a = rnd.nextInt(100);
				if(a < 50) {
					score++;
					System.out.println("a hit!");				
				}
			}else {
				System.out.println("unlucky :/");
			}
		}
		
		System.out.println("score: " + score);
		return true;
	}	
	
}
