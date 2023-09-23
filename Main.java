import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password;
        Scanner input=new Scanner(System.in);

        System.out.print("Kullanızı adınızı giriniz:");
        userName=input.nextLine();
        System.out.print("Şifrenizi giriniz:");
        password=input.nextLine();

        if(userName.equals("kullanici") && password.equals("12345")){
            System.out.print("Hesabınıza giriş yapıldı ");
        }
        else {
            System.out.print("Yanlış şifre veya yanlış kullanıcı adı girişi!");
        }














    }
}
