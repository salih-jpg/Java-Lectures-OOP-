package trashBin;

public class bin {
	
	private boolean state = true;
	private int capacity;
	private int cts = 0; // current trash size

	
	 bin(int capacity){
		this.capacity = capacity;
	}

	
	public boolean openLid() {
		if(state == false) {
			state = true;
			return true;
		}
		return true;
	}
	
	public boolean closeLid() {
		if(state == true) {
			state = false;
			return true;
		}
		return true;
	}

	public boolean thrw(int a) {
		if(cts + a < this.capacity) {
			cts += a;
			System.out.println("cts: " + cts);
		}else {
			System.out.println("the bin is full!");

		}
		return true;
	}
	
	public boolean empty() {
		cts = 0;
		return true;
	}
}