public class Baget extends Bread {
    private  double length;
    private int rubcy;

    public Baget(double weight, double prize, double length,int rubcy) {
        super(weight, prize);
        this.length = length;
        this.rubcy=rubcy;
    }

    public int getRubcy() {
        return rubcy;
    }

    public void setRubcy(int rubcy) {
        this.rubcy = rubcy;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    void rubcevat(){
        System.out.println("Рубцевать !");
    }
    void pack(){
        System.out.println("Только в экологичный пакет !");
    }
    @Override
    public String toString(){
        return "Провансальский багет : "+"\nweight : "+getWeight()+"\nprize : "+getPrize()+
                "\nlength : "+getLength()+"\nrubcy : "+getRubcy();
    }
}
