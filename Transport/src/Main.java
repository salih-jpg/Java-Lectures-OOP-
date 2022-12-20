public class Main {
    public static void main(String[] args) {
        Annane annane1 = new Annane();
        annane1.setTransportation(new Araba());
        annane1.performTransport();
        annane1.setTransportation(new Metro());
        annane1.performTransport();
    }
}