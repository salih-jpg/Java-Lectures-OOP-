package dart1;
import java.util.Random;

public class player {
	public int score = 0;
	private int hits;
	
	
	player(int hits){
		this.hits = hits;
	}
	
	
	public boolean hit() {
		int experience = 50;
		Random rnd = new Random();
		for(int i=0; i< hits; i++) {
			
			if(rnd.nextInt(100) >= experience) {
				experience -= 2;
				int a = rnd.nextInt(100);
				if(a < 50) {
					System.out.println(5);
					score += 5;
				}else if(a < 85) {
					System.out.println(10);
					score += 10;
				}else {
					System.out.println(20);
					score += 20;
				}
			}else {
				System.out.println("atamadin");
			}
			experience -= 2;
		}
		
		System.out.println("score: " + score);
		return true;
	}
}
