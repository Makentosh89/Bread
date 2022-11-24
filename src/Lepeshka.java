public class Lepeshka extends Bread {
    private double radius;

    public Lepeshka(double weight, double prize, double radius) {
        super(weight, prize);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public void checkWeight(){
        if(getWeight()<=0){
            System.out.println("Подделка");
        }
    }

    void pattern(){
        System.out.println("Нанесли узоры !");
    }
    void vanish(){
        System.out.println("Лакировано!");
    }
    @Override
    public String toString(){
        return "Lepeshka : "+"\nweight : "+getWeight()+"\nprize : "+getPrize()+"\nradius : "+getRadius();
    }
}
