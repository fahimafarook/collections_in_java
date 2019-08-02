import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner scan=new Scanner(System.in);
    
                                                                                         //writting values to list_of_list
      System.out.println("rows and cloms");
      int row=scan.nextInt();
      int col=scan.nextInt();
      ArrayList<ArrayList<Integer>>list_of_list=new ArrayList<ArrayList<Integer>>();     //decalring list_of_list
      for(int i=0;i<row;i++)                                                             //outer loop--its like rows
      {
           ArrayList<Integer>list=new ArrayList<Integer>();                              // declaring an list of type Integer
          for(int j=0;j<col;j++)                                                         //inner  loop--its like column
          {
              int val=scan.nextInt();
              list.add(val);
          }
          list_of_list.add(list);
      }
      System.out.println(list_of_list);                                                  // list_of_list
     
                                                                                         //accessing values in list of list
        ArrayList<Integer>current_list=new ArrayList<Integer>();                         //list for storing the current row
       for(int i=0;i<row;i++)
      {
          current_list=(list_of_list.get(i));                                            //accessing as single list
          for(int j=0;j<col;j++)
          {
              System.out.print(current_list.get(j)+" ");                               
          }
          System.out.println();
      }
     
    }
}
