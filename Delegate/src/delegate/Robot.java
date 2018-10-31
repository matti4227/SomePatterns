package delegate;

public class Robot implements Worker{

    private String name;
    private Work work;

    public Robot(String name) {
        this.name = name;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    @Override
    public void doWork(Work whatWork) {
        if(work == whatWork)
            System.out.println(name + " pracuje... " + whatWork.getWork());
    }
}
