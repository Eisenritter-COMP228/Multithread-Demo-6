public class JoinThreadExample {
    public static void main(String[] args){
        Test thrd1= new Test();
        Test thrd2 = new Test();
        Test thrd3 = new Test();

        thrd1.start();
        try{
            thrd1.join();
        }catch (Exception e){
            System.out.println(e);
        }
        thrd2.start();
        thrd3.start();
    }
}
