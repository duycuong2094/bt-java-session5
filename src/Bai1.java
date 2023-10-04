import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chuỗi kiểm muốn kiểm tra");
        String str= scanner.nextLine();
        if(!str.isEmpty()){
            System.out.println("Chuỗi của bạn không rỗng");
        }else {
            System.out.println("Chuỗi của bạn rỗng");
        }
    }
}
