import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int num = scanner.nextInt();
        boolean check = false;
        for (int elem : array) {
            if (elem == num) {
                check = true;
                break;
            }
        }
        System.out.println(check);

    }
}