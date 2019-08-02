import java.util.*;
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        ArrayList <Integer> my_list=new ArrayList<Integer>();//decalring a list-ArrayList            ArrayList <data_type> name= new ArarysList<data_type>()
        
        System.out.println("empty List");
        
        System.out.println(my_list+"\n");
        my_list.add(1);                 //adding elemets to list(at end)                             name.add(elemnent to add)
        my_list.add(2);
      
        my_list.add(2,3);               //adding element at specific poistion                         name.add(poistion,element)
        my_list.add(3,4);
        my_list.add(4,5);
        my_list.add(5,6);
      
        System.out.println("After adding elements");
        System.out.println(my_list+"\n");
      
        my_list.remove(0);              // deleting element from list                                  name.remove(position)
      
        System.out.println("After deeleting element in position 0");
        System.out.println(my_list+"\n");
      
        int len=my_list.size();         // to find the length of list                                  name.size()
        
        System.out.println("printing size of list");
        System.out.println(len);
        System.out.println(my_list+"\n");
      
        my_list.removeIf(n->(n%4==0));  // removes if it satiesfies the condition ,for full list       name.removeIf(condition)
      
        System.out.println("After applying removeIf --multiples of 4 are removed");
        System.out.println(my_list+"\n");
      
        ArrayList <Integer> my_list2=new ArrayList<Integer>();
        my_list2.add(1);
        my_list2.add(3);
        my_list2.add(10);
       
        System.out.println(my_list+"\n"+my_list2);
        my_list2.retainAll(my_list);   // removes the uncommon elemets compared with the passed list    name1.retainAll(name2)
        System.out.println("After applying retainAll to list2");
        System.out.println(my_list+"\n"+my_list2+"\n");
        
        my_list.addAll(my_list2);    // making two list combine or adding                               name1.addAll(name2)
        System.out.println("After adding list1 and list2");
        System.out.println(my_list+"\n");
       
        System.out.println("accessing list through iterator");
        Iterator itr=my_list.iterator();  // making traversal in list  trough Iterator                                     
        while(itr.hasNext())
        {
           System.out.print(itr.next()+" ");
        }
      System.out.println("\n\nAccessig through for each loop");
       for(Integer obj:my_list)  // making traversal with for each loop
       System.out.print(obj+" ");
    }
}
	
