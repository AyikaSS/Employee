public class Specialist extends Employee {

    int levels;

    public Specialist(){

    }

    public Specialist(int levels) {
        this.levels = levels;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public Specialist(String name, int age, long salary, int levels) {
        super(name, age, salary);
        this.levels = levels;
    }
    public void workWithClients(){
        System.out.println("We love our job!");
    }
    @Override
    void print(){
        super.print();
        System.out.println("Уровень специалиста: " + levels);
    }

    @Override
    public void goToDayOff() {
        System.out.println("У специалистов поход в горы!");
    }
}

