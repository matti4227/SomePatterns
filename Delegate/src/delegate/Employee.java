package delegate;

public class Employee implements Worker {

    @Override
    public void doWork() {
        System.out.println(this.getClass().getName() + " pracuje... ");
    }
}
