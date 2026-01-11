package JFrame;


public class teste {
    public static void main(String[] args) throws InterruptedException {
        String string = "Hello World";
        char[] list = string.toCharArray();

        StringBuilder builder = new StringBuilder();

        for (int j = 0; j < list.length; j++) {

            builder.append(list[j]);

            for(int y = 0; y < 10; y++){
                System.out.println(builder + String.valueOf(y));
            }
        }
    }
}
