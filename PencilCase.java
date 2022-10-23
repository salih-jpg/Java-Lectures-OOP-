package pencilCase;

public class PencilCase {
	
	private int pencilCount;
	private boolean zip;
	private int capacity;
	
	public PencilCase(int capacity){
		this.capacity = capacity;
	}
	
	public boolean openZip() {
		zip = true;
		return true;
	}
	
	public boolean closeZip() {
		zip = false;
		return true;
	}
	
	public void add(int a) {
		if(pencilCount != capacity && zip == true) {
			pencilCount++;
		}
		else {
			System.out.println("check the capacity or zip");
		}
	}
	
	public void remove(int a) {
		if(pencilCount != 0 && zip == true) {
			pencilCount--;
		}else {
			System.out.println("pencil case is empty");
		}
	}
}
