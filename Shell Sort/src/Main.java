public class Main {
    public static void printArray(int arr[]){

        int n = arr.length;
        for (int i=0;i<n;++i){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,3,43,5,6,7};
        System.out.println("Array before sorting");
        printArray(arr);

        Shell ss = new Shell();
        ss.sort(arr);

        System.out.println("Array after sorting");
        printArray(arr);
    }
}
