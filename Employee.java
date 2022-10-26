public abstract class Employee {

    String name;
    int age;
    long salary;

    public Employee(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Employee(String name, int age, long salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee(String name) {
        this.name = name;
    }

    void print(){
        System.out.println("name: "+ name + "\n" +  "age: " + age +"\n" + "salary: "+ salary);
    }
    public abstract void goToDayOff();




}
