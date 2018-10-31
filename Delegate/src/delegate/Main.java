package delegate;

public class Main {

    public static void main(String[] args) {

        Worker boss = new Boss("Wiesiu BOSS");
        Worker emp1 = new Employee("Kolega1");
        Worker rob1 = new Robot("Kolega robot");
        Worker emp2 = new Employee("Zdzisiu");
        Worker rob2 = new Robot("Robot kolegi");
        Worker emp3 = new Employee("Zdzisiu Wiesia");
        Worker rob3 = new Robot("Robot Zdzisia Wiesia");
        Worker emp4 = new Employee("Kolega Zdzisia posiadający robota");
        Worker rob4 = new Robot("Robot będący robotem kolegi Zdzisia");
        ((Boss) boss).addWorker(emp1);
        ((Boss) boss).addWorker(rob1);
        ((Boss) boss).addWorker(emp2);
        ((Boss) boss).addWorker(rob2);
        ((Boss) boss).addWorker(rob3);
        ((Boss) boss).addWorker(emp3);
        ((Boss) boss).addWorker(emp4);
        ((Boss) boss).addWorker(rob4);
        Work work1 = new Work_1();
        ((Work_1) work1).setWork("Zrob to");
        Work work2 = new Work_2();
        ((Work_2) work2).setWork("Zrób tamto");

        ((Employee) emp1).setWork(work1);
        ((Employee) emp2).setWork(work2);
        ((Employee) emp3).setWork(work1);
        ((Employee) emp4).setWork(work2);
        ((Robot) rob1).setWork(work1);
        ((Robot) rob2).setWork(work2);
        ((Robot) rob3).setWork(work1);
        ((Robot) rob4).setWork(work2);

        boss.doWork(work1);
        boss.doWork(work2);

    }
}
