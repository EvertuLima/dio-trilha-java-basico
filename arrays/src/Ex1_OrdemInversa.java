public class Ex1_OrdemInversa {
    public static void main(String[] args) throws Exception {
        
        int[] vetor = {1,2,34,56};

        int i = vetor.length-1;
        while(vetor.length > i && i > -1){
            System.out.println(vetor[i]);
            i--;
        }
    }
}
