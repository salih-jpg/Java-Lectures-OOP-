public class CurrentDisplay implements Observer{

    WeatherData wheater;
    float temprature;

    public CurrentDisplay(WeatherData wheater) {
        this.wheater = wheater;
        wheater.register(this);
    }

    @Override
    public void update(float temprature) {
        this.temprature = temprature;
        display();
    }

    public void display() {
        System.out.println("Temprature has changed in Baltimore today:" + temprature + "C");
    }
}
