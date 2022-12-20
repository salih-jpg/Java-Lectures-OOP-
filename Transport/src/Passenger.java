public abstract class Passenger {
    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public  void setTransportation(Transportation transportation)
    {
        this.transportation = transportation;

    }
    Transportation transportation;

    public void performTransport(){
        System.out.println(name +" "+transportation.transport());
    }

}
