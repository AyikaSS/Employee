public class Main {
    public static void main(String[] args) {
        Specialist specialist = new Specialist("Tom", 25, 200000, 1);
        Specialist specialist1 = new Specialist("Jerry", 21, 150000,2);
        Specialist specialist2 = new Specialist("Mickey", 26, 300000, 3);
        specialist2.goToDayOff();

        Developer developer = new Developer("SpanchBob", 25, 500000,"Gold");
        Developer developer1 = new Developer("Squid", 27, 300000, "Bronze");
        Developer developer2 = new Developer("Seylor", 28, 600000, "Platimum");
        Developer developer3 = new Developer("Naruto", 35, 1000000, "Gold");
        developer.goToDayOff();

        Manager manager = new Manager("Zolushka", 24, 200000, true);
        Manager manager1 = new Manager("Mulan", 23, 250000,  false);
        manager.goToDayOff();

        Ceo ceo = new Ceo("Panda",30, 20000000, false, true);
        ceo.goToDayOff();

        Employee[] employees = new Employee[]{ ceo, manager1, manager, developer1, developer2, developer3, developer,
                specialist1, specialist, specialist2};
//        int i = 0;
//        while (i < employees.length){
//            employees[i].print();
//            System.out.println("----------------");
//            i++;
//        }
//        for(int i = 0; i<employees.length; i++){
//            employees[i].print();
//            System.out.println("----------------");
//        }
        for(Employee i : employees){
            if(i.getAge()<=25){
                continue;
            } else {
            i.print();
            System.out.println("==================");}
        }
//        employees[(int) (Math.random()*(employees.length-1))].print();




    }
}
