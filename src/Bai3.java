import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chuỗi muốn đâỏ ngược");
        String str=scanner.nextLine();
        StringBuffer stringBuffer=new StringBuffer(str);
      stringBuffer.reverse();
      String str2=stringBuffer.toString();
        System.out.println("Chuỗi đảo ngược là " + str2);
    }
}
