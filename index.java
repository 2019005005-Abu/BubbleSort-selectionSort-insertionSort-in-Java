class Sorting_Alogorithoms{
  public static void BubleSorting(int arr[]) {
    for(int i=0;i<arr.length;i++){
       System.out.println(arr[i]);
    }
    System.out.println();
  }
  public static void SelectionSort(int arr[]) {
    for(int i=0;i<arr.length;i++){
       System.out.println(arr[i]);
    }
    System.out.println();
  }

  public static void insertionSort(int arr[]) {
    for(int i=0;i<arr.length;i++){
       System.out.println(arr[i]);
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int arr[]={7,8,3,1,2};
    //buble
     for(int i=0;i<arr.length-1;i++){
          for(int j=0;j<arr.length-i-1;j++){
             if(arr[j]>arr[j+1]){
               int temp=0;
               temp=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;
             }
          }
     }
     System.out.println("Buble Sort");
     BubleSorting(arr);
      

     //selection sort
     for(int i=0;i<arr.length-1;i++){
      int smallest=i;
      for(int j=i+1;j<arr.length;j++){
        if(arr[smallest]>arr[j]){
          smallest=j;
        }
      }
      int temp=0;
      temp=arr[smallest];
      arr[smallest]=arr[i];
      arr[i]=temp;
     }
     System.out.println("Selection sort");
     SelectionSort(arr);
     
     //insertion sort
     for(int i=0;i<arr.length;i++){
       int current=arr[i];
       int j=i-1;
       while(j>=0 && current<arr[i]){
        arr[j+1]=arr[j];
          j--;
        }
        //placement
         arr[j+1]=current;
       }
       System.out.println("Insertion Sort");
       insertionSort(arr);

     }
     
}