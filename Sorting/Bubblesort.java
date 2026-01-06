// Bubble Sort pushes big numbers to the right, one by one.

import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
      } 
      for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
          if(arr[j+1]<arr[j]){
            int a=arr[i];
            arr[i]=arr[j];
            arr[j]=a;
          }
        }
      } 
      
      for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
      }
      
  }
}  
