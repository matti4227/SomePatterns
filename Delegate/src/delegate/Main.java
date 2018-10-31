package delegate;

public class Main {

    public static void main(String[] args) {

        Worker boss = new Boss();
        Worker emp1 = new Employee();
        Worker rob1 = new Robot();
        ((Boss) boss).addWorker(emp1);
        ((Boss) boss).addWorker(rob1);
        boss.doWork();
        ((Boss) boss).removeWorker(emp1);
        boss.doWork();

    }
}
