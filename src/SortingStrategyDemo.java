import java.util.ArrayList;

public class SortingStrategyDemo {

    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < 1000; i++){
            list1.add(i);
        }

        Sorter sorter1 = new Sorter(new QuickSortStrategy());
        sorter1.sort(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list2.add(i);
        }

        Sorter sorter2 = new Sorter(new InsertionSortStrategy());
        sorter2.sort(list2);

    }
}
