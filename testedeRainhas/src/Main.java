import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Solver nRainha = new Solver();

        Boolean b = false;

        Scanner in = new Scanner(System.in);

        int tamanho = 2;



        while(true){

            b = false;

            System.out.println("Informe o tamanho da Matriz:");

            tamanho = in.nextInt();

            if(tamanho >= 2){

                b = nRainha.queenSolver(tamanho);
                System.out.println(b);


            }else{
                System.out.println("Tamanho inválido, insira um valor > ou = 2");
            }


        }


    }
}
