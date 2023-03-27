import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int num = scanner.nextInt();
        System.out.print("Nhập chuỗi: ");
//        String str = scanner.next();
        String str = scanner.nextLine();
        System.out.println("Số: " + num);
        System.out.println("Chuỗi: " + str);
    }
}
