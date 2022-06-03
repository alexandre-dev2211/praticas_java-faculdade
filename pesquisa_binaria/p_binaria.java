package pesquisa_binaria;

public class p_binaria {
    public static void main(String[] args){

        p_binaria bin = new p_binaria();

        int[] num_bin = {1, 3, 4, 7, 9, 10, 13, 18, 20, 21, 22, 35, 39, 42, 51, 60, 63, 71};

        bin.pesq_num(20, num_bin);
        bin.pesq_num(3, num_bin);
        bin.pesq_num(6,num_bin);
        bin.pesq_num(29, num_bin);
    }
    public void pesq_num(int x, int[] num) {
        int inicio = 0;
        int meio = 0;
        int fim = num.length - 1;

        while(inicio <= fim) {
            meio = (fim + inicio) / 2;

            System.out.println("Inicio: " + num[inicio] + " - Meio: " + num[meio] + " - Fim: " + num[fim]);
            System.out.println("Inicio: " + inicio + " - Meio: " + meio + " - Fim: " + fim);

            if(num[meio] == x) {
                System.out.println("Número Encontrado:  " + x);
                break;
            }

            if(num[meio] < x) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        if(inicio > fim) {
            System.out.println("Número Não Encontrado: " + x);
        }
    }
}