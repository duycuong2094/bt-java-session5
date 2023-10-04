import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập email muốn kiểm tra");
        String email=scanner.next();
        String regexEmail="^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern checkRegex= Pattern.compile(regexEmail);
        Matcher checkEmail=checkRegex.matcher(email);
        if(checkEmail.matches()){
            System.out.println("Email của bạn là "+ email);
        }else {
            System.err.println("Email không hợp Lệ");
        }

    }
}
