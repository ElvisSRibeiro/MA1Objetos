import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1 � Cliente Especial");

        System.out.println("2 � Cliente Normal");

        int r = scan.nextInt();

        Conta c;
        //qual � o tipo da conta?//
        if( r==1 ){

            c = new ContaEspecial(0);

        }else if( r==2 ){

            c = new Conta(0);

        }else{

            System.out.println("Op��o inv�lida!");

            return;

        }
        //menu de opera��es
        while (true){

                System.out.println("1 � Sacar");

                System.out.println("2 � Depositar");

                System.out.println("3 � Ver o Saldo");

                System.out.println("4 � Sair");

                int ope = scan.nextInt();

                double val=0;
                
                
                //aqui vai fazer as opera��es acontecerem
                switch (ope){

                        case 1:

                            val=0;

                            System.out.println("Digite o Valor: ");

                            val = scan.nextDouble();

                            c.Sacar(val);

                            break;

                        case 2:

                            val=0;

                            System.out.println("Digite o Valor: ");

                            val = scan.nextDouble();

                            c.Depositar(val);

                            break;

                        case 3:

                            System.out.println("Saldo:"+c.Saldo());

                            break;

                        case 4:

                            return;

                        default:

                            System.out.println("Op��o Inv�lida!!");

                }

        }

    }

}