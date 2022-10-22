package jar;
/*
 * It is required to create a jar class that will only hold Marbles. 

Jars may have different capacities
All Jars have a lid for itself
If the lid is open, one can add marbles or remove a certain amount of marbles. 
The jar should say the number of marbles inside it
 */

public class Jar {
	
	private int cmc;
	private boolean lid;
	private int capacity;
	
	Jar(int capacity){
		this.capacity = capacity;
	}
	
	public boolean openLid() {
		if(lid == false) {
			lid = true;
		}
		return true;
	}
	
	public boolean closeLid() {
		if(lid == true) {
			lid = false;
		}
		return true;
	}
	
	public boolean addMarbel(int marbels) {
		if(lid == true && cmc < capacity) {
			cmc += marbels;
			System.out.println("count: " + cmc);
		}
		return true;
	}
	
	public boolean remove(int marbels) {
		if(lid == true && cmc != 0) {
			cmc -= marbels;
			System.out.println("count: " + cmc);
		}
		return true;
	}
	
}

