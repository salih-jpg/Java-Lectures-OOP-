package javaapplication1;

public class elevator {
    private double capacity;
    private int maxFloor;
    private int minFloor;
    private int currentFloor;
    private boolean doorState;
    private state currentState = state.Idle;
    
    
    public int getCurrentFloor(){
        return currentFloor;
    }
    public boolean openDoor(){
        return true;
    }
    public boolean closeDoor(){
        return true;
    }
    
    public boolean liftUp(){
        if(currentFloor < maxFloor){
            currentFloor++;
            return true;
        }
        return false;
    }
    
    public boolean liftDown(){
         if(currentFloor > maxFloor){
            currentFloor--;
            return true;
        }
        return false;
    }
    
    public int goFloor(int a){
        while(a != currentFloor){
            
        }
    }
}
