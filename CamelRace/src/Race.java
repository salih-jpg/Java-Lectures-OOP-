public class Race {
    public static void main(String[] args) {
        Camel camel1 = new Camel("1");
        Camel camel2 = new Camel("2");
        Camel camel3 = new Camel("3");
        Camel camel4 = new Camel("4");
        camel4.start();
        camel2.start();
        camel3.start();
        camel1.start();
    }
}
