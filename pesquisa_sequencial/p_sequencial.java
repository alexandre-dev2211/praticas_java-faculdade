package pesquisa_sequencial;

public class p_sequencial {
    public static void main(String[] args){

        p_sequencial p_seq = new p_sequencial();

        int[] num = {3, 5, 9, 21, 10, 1, 2};

        p_seq.pesq_num(0, num);
        p_seq.pesq_num(3, num);
        p_seq.pesq_num(9, num);
        p_seq.pesq_num(12,num);

    }
    public void pesq_num(int x, int[] numeros) {
        int cont = 0;

        for(cont = 0; cont < numeros.length; cont++) {
            if (numeros[cont] == x) {
                System.out.println("Número Localizado: " + x);
                break;
            }
        }
        if(cont >= numeros.length)
            System.out.println("Número Não Localizado: " + x);
    }
}
