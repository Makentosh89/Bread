public class Main {
    public static void main(String[] args) {

        Bread bread=new Bread(600,24);
        System.out.println(bread);
        bread.bake();
        bread.pack();
        System.out.println();

        Lepeshka lepeshka=new Lepeshka(0,25,15.6);
        System.out.println(lepeshka);
        lepeshka.bake();
        lepeshka.pattern();
        lepeshka.pack();
        lepeshka.checkWeight();
        System.out.println();

        Lavash lavash=new Lavash(150,35,65,1.2);
        System.out.println(lavash);
        lavash.bake();
        lavash.wrapUp();
        System.out.println();

        Baget baget=new Baget(250,85,95,5);
        System.out.println(baget);
        baget.rubcevat();
        baget.pack();

    }
}
