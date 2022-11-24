public class Lavash extends Bread{
    private double radius;
    private double thickness;

    public Lavash(double weight, double prize, double radius, double thickness) {
        super(weight, prize);
        this.radius = radius;
        this.thickness = thickness;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    void bake(){
        System.out.println("Я лаваш , меня испекли ! ");
    }
    void wrapUp(){
        System.out.println("Завернуто !");
    }
    @Override
    public String toString(){
        return "Элитный лаваш из Дилижана  : "+"\nweight : "+getWeight()+"\nprize : "+getPrize()+
                "\nradius : "+getRadius()+"\nthickness : "+getThickness();
    }

}
