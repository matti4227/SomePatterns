package delegate;

public class Work_2 extends Work {

    private Work_2() {}

    private static class SingletonHolder {
        private static Work_2 instance = new Work_2();
    }

    public static Work_2 getInstance(){
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
