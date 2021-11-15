import java.util.List;

public class Sorter {

    private SortingStrategy strategy;

    public Sorter(SortingStrategy strategy){
        this.strategy = strategy;
    }

    public List sort(List list){
        return strategy.sort(list);
    }
}
