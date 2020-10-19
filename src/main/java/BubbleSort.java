import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    private List<Integer> datasource;

    public BubbleSort(List<Integer> datasource) {
        this.datasource = datasource;
    }

    public List<Integer> sort(){
        List<Integer> numbers = new ArrayList<>(datasource);
        for (int i =0 ; i < numbers.size() -1 ; i++){
            for (int j =0 ; j< numbers.size() - i - 1 ; j++){
                if (numbers.get(j) > numbers.get( j+1 )){
                    swap(j , j + 1 , numbers);
                }
            }
        }
        return numbers;
    }

    public List<Integer> improvedSort(){
        List<Integer> numbers = new ArrayList<>(datasource);
        for (int i =0 ; i < numbers.size() -1 ; i++){
            for (int j =0 ; j< numbers.size() - i - 1 ; j++){
                if (numbers.get(j) > numbers.get( j+1 )){
                    swap(j , j + 1 , numbers);
                }
            }
        }
        return numbers;
    }

    private void swap(int from , int to , List<Integer> arr){
        int tmp = arr.get(from);
        arr.set(from , arr.get(to));
        arr.set(to , tmp);
    }

    public List<Integer> getDatasource() {
        return datasource;
    }
}
