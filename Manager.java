public class Manager extends Employee {

    boolean hasStocks;

    public Manager(){
            }

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    public Manager(String name, int age, long salary, boolean hasStocks) {
        super(name, age, salary);
        this.hasStocks = hasStocks;
    }
    public void writeProcedures(){
        System.out.println("We are working hard!");
    }
    @Override
    void print(){
        super.print();
        System.out.println("Имеет ли акции? " + hasStocks);


    }

    @Override
    public void goToDayOff() {
        System.out.println("У менеджера намечена встреча с партнерами!");
    }

}
