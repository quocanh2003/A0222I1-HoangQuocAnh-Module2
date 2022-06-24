package demo;

public class SearchBinary {

    public static   int searchBinary(int[] arr,int value){
        int begin = 0;
        int end = arr.length-1;
        int mid;
        while (end >= begin){
            mid = (begin + end)/2;
            if(arr[mid] == value){
                return mid;
            }else if(arr[mid] > value){
                end = mid - 1;
            }else {
                begin = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
//        SearchBinary a = new SearchBinary();
        System.out.println(searchBinary(arr,4));
    }

}
