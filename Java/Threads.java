
 class Morning extends Thread{
int millis;
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println(" Morning");
            try {
                Thread.sleep(millis=10);
            } catch (InterruptedException e) {
            
                e.printStackTrace();
            }
        }
    }
   
 }
 class Night extends Thread{
    public void run(){
        int mi;
        for(int i=0; i<=5; i++){
            System.out.println(" Night");
            try {
                Thread.sleep(mi=10);
            } catch (InterruptedException e) {
            
                e.printStackTrace();
            }
        }
    }
 }

public class Threads {
   
    public static void main(String[] args) {
        int mil;
        Morning m=new Morning();
        Night n=new Night();
       // System.out.println(m.getPriority());
        m.start();
        try {
            Thread.sleep(mil=2);
        } catch (InterruptedException e) {
        
            e.printStackTrace();
        }
        n.start();
       
    }
}
