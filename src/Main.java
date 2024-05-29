import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        String name = a.nextLine();
        name = name.replaceAll(" ", "").toLowerCase();
        System.out.println();
        int n = 0;
        int l = name.length()-1;
        for (;n<l;){
            if (name.charAt(l) == name.charAt(n)) {
                l--;
                n++;
            } else {
                break;
            }
        }if (n >= l) {
            System.out.println("Строка является палиндромом");
        }else{
            System.out.println("строка не является палиндромом");
        }
    }
}
