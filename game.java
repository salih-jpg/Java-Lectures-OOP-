package dart1;

public class game {

	public static void main(String[] args) {
		
	player player1 = new player(20);
		player1.hit();
	player player2 = new player(20);
		player2.hit();
		
	if(player1.score < player2.score) {
		System.out.println("player 2 kazandi");
	}else if(player1.score == player2.score) {
		System.out.println("berabere");
	}else {
		System.out.println("player1 kazandi");
	}
	
	}
}
