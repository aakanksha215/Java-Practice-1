interface Fest {
    public void start();
}
interface Dance {
    public void Letsgo();
}
interface Traditional extends Dance, Fest{
    public void show();
}
public class Main{
    public static void main(String[] args){
        Traditional trad = new Traditional() {
            public void start() {
                System.out.println("Start Fest");
            }
            public void Letsgo() {
                System.out.println("Letsgo Dance.");
            }
            public void show() {
                System.out.println("Show Traditional.");
            }
        };

        trad.start();
        trad.Letsgo();
        trad.show();
    }
}
