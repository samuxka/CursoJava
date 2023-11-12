public class User {
    public static void main(String[] args) {
        exSmart smartTv = new exSmart();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal " + smartTv.canal);
        System.out.println("Volume " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("novo -> Tv ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("novo -> Tv ligada? " + smartTv.ligada);

        smartTv.mudarcanal(22);
        System.out.println("novo -> canal " + smartTv.canal);
        
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("novo -> volume " + smartTv.volume);
    }
}
