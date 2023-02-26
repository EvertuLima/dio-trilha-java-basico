public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? "+ smartTv.ligada);
        System.out.println("TV canal? "+ smartTv.canal);
        System.out.println("TV volume? "+ smartTv.volume);
        smartTv.ligar();

        System.out.println(smartTv.toString()); 

    }
}
