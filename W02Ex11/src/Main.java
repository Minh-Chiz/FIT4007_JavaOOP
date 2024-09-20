public class Main {
    public static void main(String[] args) {
        System.out.println("Các số lẻ từ 1 đến 99 là:");
        for (int i = 1; i <= 99; i++){
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}