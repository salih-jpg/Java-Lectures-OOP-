import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    List<Observer> observers = new ArrayList<Observer>();
    float temprature =0;


    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyO() {
        for (int i=0; i<observers.size(); i++) {
            Observer o = observers.get(i);
            o.update(temprature);
        }
    }

    public void tempratureChanged(){
        notifyO();
    }

    public void setTemprature(float temprature){
        this.temprature = temprature;
        tempratureChanged();
    }
}
