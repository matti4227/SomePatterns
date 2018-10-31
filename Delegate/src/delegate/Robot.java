package delegate;

public class Robot implements Worker{

    @Override
    public void doWork() {
        System.out.println(this.getClass().getName() + " pracuje... ");
    }
}
