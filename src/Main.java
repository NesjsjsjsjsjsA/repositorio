import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        menu();


    }

    //////////////////////////////////////

    public  static  void Bucles ()
    {
        for (int i = 0; i<5;i++){

            System.out.println("holi");}

    }

    public  static void name ()
    {
        Scanner escan = new Scanner(System.in); //leer datos de entrada

        String name = escan.nextLine();

        String apellii = escan.nextLine();

        int edad = escan.nextInt();

        System.out.println(name + " " + apellii + " " + edad);
    }

    public static void menu()
    {
        Scanner escan = new Scanner(System.in);

        int option = 0;

        do {
            System.out.println("Welcome to the calculator!!!!, selecciona una opcion basica");
            System.out.println("1-suma");
            System.out.println("2-resta");
            System.out.println("3-multiplicar");
            System.out.println("4 -dividir");
            System.out.println("5-salir");

            option = escan.nextInt();

            if (option == 1)
            {
                suma();
            } else if (option == 2) {

                resta();
            }


        } while (option != 5);
    }

    public static int suma()
    {

        Scanner escan = new Scanner(System.in);
        int valora = 0;
        int valorb = 0;

        System.out.println("ingrese dos valores");
        valora = escan.nextInt();
        valorb = escan.nextInt();

        return valora + valorb;
    }

    public static int resta()
    {

        Scanner escan = new Scanner(System.in);
        int valora = 0;
        int valorb = 0;

        System.out.println("ingrese dos valores");
        valora = escan.nextInt();
        valorb = escan.nextInt();

        return valora - valorb;
    }

    public static int multiplicacion ()
    {
        Scanner help2 = new Scanner(System.in);
        int valora = 0;
        int valorb = 0;

        System.out.println("ingrese dos valores");
        valora = help2.nextInt();
        valorb = help2.nextInt();

        return valora*valorb;
    }

    public static int division ()
    {
        Scanner help = new Scanner(System.in);


        int valora = 0;
        int valorb = 0;


        System.out.println("ingrese dos valores");

        valora = help.nextInt();
        valorb = help.nextInt();

        return valora - valorb;
    }

}