public class Developer extends Employee {

    private String rang;

    public Developer(){
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    public Developer(String name, int age, long salary, String rang) {
        super(name, age, salary);
        this.rang = rang;
    }
    public void writeCode(){
        System.out.println("We are writing our awesome algorithm!");
    }
    @Override
    void print(){
        super.print();
        System.out.println("Какой ранг у разработчика? " + rang);
    }

    @Override
    public void goToDayOff() {
        System.out.println("В этот день у разработчиков футбол!");
    }
}
