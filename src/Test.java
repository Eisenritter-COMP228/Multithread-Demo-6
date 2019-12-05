public class Test extends Thread {
    public void run(){
        for(int i=1; i<=5; i++){
            try {
                Thread.sleep(600);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
