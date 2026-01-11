package JFrame;

public class teste2 {

    public static void main(String[] args){

        Thread thread = new Thread(() -> {
            for(int j = 0; j < 50; j++){
                System.out.print("Thread!");
            }
        });

        thread.start();
        for(int i = 0; i < 50; i++){
            System.out.print("Loop!");
        }	
        thread.interrupt();
    }
}
