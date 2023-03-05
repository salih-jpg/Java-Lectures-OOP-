public class Camel extends Thread{

    static int order=0;
    public String name;
    Camel(String name){
        this.name = name;
    }

    public void go(){
        for (int i=0;i<100; i++){
            System.out.println(this.name +": "+i);


        }
        order++;
    }

    @Override
    public void run() {
        super.run();
            go();
    }
}

