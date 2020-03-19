import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên: ");

        name = scanner.next();

        System.out.println("Xin Chào " + name);

    }
}
