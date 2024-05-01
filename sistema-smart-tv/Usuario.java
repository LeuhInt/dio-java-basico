public class Usuario {

    public static void main(String[] args) {

        SmartTv oSmartTv = new SmartTv();

        System.out.println("TV esta ligada? :" + oSmartTv.ligada);
        System.out.println("Qual o canal da TV? :" + oSmartTv.canal);
        System.out.println("Qual o volume da TV? :" + oSmartTv.volume);

        oSmartTv.ligar();
        System.out.println("TV esta ligada? :" + oSmartTv.ligada);
    }
}
