public class Bread {
    private double weight;
    private double prize;

    public Bread(double weight, double prize) {
        this.weight = weight;
        this.prize = prize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }
    void bake(){
        System.out.println("Хлеб готов ! ");
    }
    void pack(){
        System.out.println("Упаковано !");
    }
    @Override
    public String toString(){
        return "Bread : "+"\nweight : "+getWeight()+"\nprize : "+getPrize();
    }
}
