public class DemoString {
    public static void main(String[] args) {
        String str="appleuy,jfk";
        String str2="apple";
        System.out.println(str.endsWith("jfk"));
        int result= str.compareTo(str2);
        System.out.println(result);
    }
}
