package delegate;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Worker {

    protected List<Worker> list= new ArrayList<>();

    public void addWorker(Worker worker) {
        list.add(worker);
    }

    void removeWorker(Worker worker){
        list.remove(worker);
    }

    void notifyWorkers(){
        for(Worker w : list)
            w.doWork();
    }

    @Override
    public void doWork() {
        System.out.println(getClass().getName() + " pracuje... ");
        notifyWorkers();
    }
}
