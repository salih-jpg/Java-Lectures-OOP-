package trashBin;

public class Main {

	public static void main(String[] args) {
		bin myBin = new bin(20);
		myBin.thrw(2);
		myBin.thrw(15);
		myBin.thrw(4);
		myBin.empty();
		myBin.thrw(2);
		myBin.thrw(2);
	}

}
