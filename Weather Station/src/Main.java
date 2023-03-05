public class Main {

    public static void main(String[] args) {
        WeatherData w1 = new WeatherData();
        CurrentDisplay c1 = new CurrentDisplay(w1);
        CurrentDisplay c2 = new CurrentDisplay(w1);
        w1.setTemprature(12);
        w1.setTemprature(13);
        w1.setTemprature(11);
    }
}