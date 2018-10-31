package delegate;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Worker {

    private String name;

    public Boss(String name){
        this.name = name;
    }

    protected List<Worker> list= new ArrayList<>();

    public void addWorker(Worker worker) {
        list.add(worker);
    }

    void removeWorker(Worker worker){
        list.remove(worker);
    }

    void notifyWorkers(Work youShallWork){
        for(Worker w : list)
            w.doWork(youShallWork);
    }

    @Override
    public void doWork(Work youShallWork) {
        System.out.println(name + " pracuje... ");
        notifyWorkers(youShallWork);
    }
}
