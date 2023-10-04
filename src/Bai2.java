import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chuỗi thứ nhất");
        String str1=scanner.nextLine();
        System.out.println("Nhâp chuỗi thứ 2 ");
        String str2 =scanner.nextLine();
        boolean test= str1.equals(str2);
        if(test){
            System.out.println("Hai chuỗi bằng nhau");
        }else {
            System.out.println("Hai chuỗi không bằng nhau");
        }
    }
}
