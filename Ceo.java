public class Ceo extends Manager{

    boolean hasCompanyCar;


    public Ceo(String name, int age, long salary, boolean hasStocks, boolean hasCompanyCar) {
        super(name, age, salary, hasStocks);
        this.hasCompanyCar = hasCompanyCar;
    }

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    @Override
    public String toString() {
        return "Ceo{" +
                "hasCompanyCar=" + hasCompanyCar +
                ", hasStocks=" + hasStocks +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
    @Override
    void print(){
        super.print();
        System.out.println("Есть ли у СЕО рабочая машина от компании?" + hasCompanyCar);
    }

    @Override
    public void goToDayOff() {
        super.goToDayOff();
        System.out.println("\"The CEO is resting!\"");
    }
}
