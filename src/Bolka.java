import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bolka {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        int a,b,c;
        System.out.println("Введи первое число");
        a = Integer.parseInt(reader.readLine());
        System.out.println("Введи второе число");
        b = Integer.parseInt(reader.readLine());
        System.out.println("Введи третье число");
        c = Integer.parseInt(reader.readLine());


        System.out.println("Сумма"+(a+b+c));
        System.out.println("Разность"+(a-b-c));



    }
    class bulkaTop{
        public void top(){

        }
    }
}
