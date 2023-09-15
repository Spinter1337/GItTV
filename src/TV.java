import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TV {

    public static String screen, speakers, remote_control;
    public static boolean on;


    public static void main(String[] args) {
        add_har();
        show_info();
        watching_tv();
        listening_music();




    }
    public static String add_har(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите параметры дисплея:");
        screen = scanner.nextLine();
        System.out.println("Налчие динамиков(1 -есть динамик: 2-нет динамиков:");
        int dynamic_off = scanner.nextInt();
        if (dynamic_off == 1){
            on =true;
            System.out.println("введите параметры динамиков:");
            speakers = scanner.nextLine();
        }
        else {
            on= false;
            System.out.println("нет динамиков.");

        }


        System.out.println("введите параметры пульта управления:");
        remote_control = scanner.nextLine();

        return screen+ speakers +remote_control;

    }

    public static void  watching_tv(){
        Scanner scan = new Scanner(System.in);

        System.out.println("телеивзор влючен:");
        System.out.println("дисплей включен");
        if (on == true){
            System.out.println("динамики работают");
        }
        else {
            System.out.println("нет звука(((");
        }
        System.out.println("нажмитена пульт");
        String prosto = scan.nextLine();
        System.out.println("пульт работает");
        System.out.println("показываю мультики))");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }







        System.out.println("");
    }

    public static void listening_music(){
        if (on == true){
            for (int i =0; i<10; i++){

                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("*музыка*");

            }

        }
        else {
            System.out.println("музыка не играет((");
            System.out.println("подключите звуковые устройства");
            connecting_devices();

        }


    }
    public static void connecting_devices(){
        System.out.println("выберите порт подключения");
        System.out.println("1"+"2"+"3"+"4");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println("порт "+a+" подключен");
        on = true;
        listening_music();







    }

    public static void show_info(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(screen);
        System.out.println(speakers);
        System.out.println(remote_control);
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }




}