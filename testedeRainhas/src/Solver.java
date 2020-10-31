public class Solver {

    public int iterac=0;


        public boolean queenSolverRec(int matriz[][], int colunaAtual) {


            ++iterac;
            //checando pra ver se existe
            if (colunaAtual >= matriz.length) {
                return true;
            }
            //
            for (int i = 0; i < matriz.length; i++) {


                //se tiver como colocar uma Rainha aqui, coloca.

                if (checkQueenSafe(matriz, i, colunaAtual)) {
                    matriz[i][colunaAtual] = 1;

                    if (queenSolverRec(matriz, colunaAtual + 1)) {


                        //++iterac;
                        return true;
                    }
                    matriz[i][colunaAtual] = 0;
                }
                //++iterac;

            }
            return false;
        }


        public boolean checkQueenSafe(int umTabuleiro[][], int umaLinha, int umaColuna) {

            int i=0;
            int j=0;


            //percorer pra checar a coluna  "  |  "
            for (i = 0; i < umaColuna; i++) {
                ++iterac;
                //System.out.println("A");
                if (umTabuleiro[umaLinha][i] == 1) {
                    return false;
                }
            }

            //percorrer pra checar a diagonal   "  \  "
            for (i = umaLinha, j = umaColuna; i >= 0 && j >= 0; i--, j--) {
                ++iterac;
                //System.out.println("A");
                if (umTabuleiro[i][j] == 1) {
                    return false;
                }
            }

            //percorrer pra checar a segunda diagonal   "  /  "
            for (i = umaLinha, j = umaColuna; j >= 0 && i < umTabuleiro.length; i++, j--) {
                ++iterac;
                //System.out.println("A");
                if (umTabuleiro[i][j] == 1) {
                    return false;
                }
            }



            return true;
        }


    public boolean queenSolver(int tamanho) {

        int tabuleiro[][] = new int[tamanho][tamanho];

        if (!queenSolverRec(tabuleiro, 0)) {
            System.out.println("Solucao Nao Existe");
            return false;
        }

        printTabuleiro(tabuleiro);
        return true;
    }





        public void printTabuleiro(int umTabuleiro[][]) {

            for (int i = 0; i < umTabuleiro.length; i++) {

                for (int j = 0; j < umTabuleiro.length; j++) {
                    System.out.print(" " + umTabuleiro[i][j] + " ");
                }

                System.out.println();
            }
            System.out.println("\nTotal de Iteracoes: "+iterac+"\n");
            this.iterac=0;
        }




}
