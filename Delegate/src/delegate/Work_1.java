package delegate;

public class Work_1 extends Work {

    private Work_1() {}

    private static class SingletonHolder {
        private static Work_1 instance = new Work_1();
    }

    public static Work_1 getInstance(){
        return SingletonHolder.instance;
    }

    private String work;

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
}
