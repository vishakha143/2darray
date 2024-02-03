import java.util.*;
import java.io.*;
public class Arraylist {
    public static void main(String args[])throws IOException
    {
    ArrayList<String> obj = new ArrayList<String>();
    DataInputStream in = new DataInputStream(System.in);
    int i,c,j,ch ;
    String str;
    do
    {
        System.out.println("STRING MANUPULATION");
        System.out.println("*******************");
        System.out.println("1. Append \t 2. Insert \t 3. Search\t");
        System.out.println("4.List string that start with specific letter");
        System.out.println("5. Remove \t 6. Sort \t 7. Display \t 8. Size");
        c = Integer.parseInt(in.readLine());
        switch(c){
            case 1:{
                System.out.println("Enter the string:");
                str = in.readLine();
                System.out.println("The added string" + obj.add(str));
                 break;
            }
            case 2:{
                System.out.println("Enter the string:");
                str = in.readLine();
                System.out.println("Enetr the index:");
                i = Integer.parseInt(in.readLine());
                obj.add(i-1,str);
                System.out.println("The list:" + obj);
                break;
            }
            case 3:{
                System.out.println("Enetr the string:");
                str = in.readLine();
                j = obj.indexOf(str);
                if(j == -1){
                    System.out.println("Element not found:");
                }
                else{
                    System.out.println("index of" + str + "is" + j);
                }
                break;
            }
            case 4:{
                System.out.println("Enter the specified character:");
                str = in.readLine();
                for(i=0;i<obj.size()-1;i++){
                 String str1 = obj.get(i);
                 System.out.println(str.startsWith(str1));
                }
                break;
            }
            case 5:{
                System.out.println("Enter the elemnt to remove:");
                str = in.readLine();
                obj.remove(str);
                System.out.println("The removed element:" + obj);
                break;
            }
            case 6:{
                 Collections.sort(obj);
                System.out.println("The sorted list:" + obj);
                break;
            }
            case 7:{
                System.out.println("The size is:" + obj.size());
                break;
            }
            case 8:{
                System.out.println("The array list is:" + obj);
                break;
            }
        }
        System.out.println("Enter 0 to break and 1 to continue:");
        ch = Integer.parseInt(in.readLine());
       } while(ch == 1);
  }
}
