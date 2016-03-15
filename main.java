import java.util.*;
import java.io.*;
public //Christopher Tam
//January 27. 2016
//Language Processing
//Lab 2

import java.util.*;
import java.io.*;


//This is Problem 1 of Lab 2
class Problem1{

    public static void main(String[]args) throws IOException{
        Scanner fileRead = new Scanner(new File("input.txt"));
        ArrayList arr = new ArrayList<Integer>();
        
        while(fileRead.hasNextInt()){
          arr.add(fileRead.nextInt());
        }

        while(arr.size() > 0)
        {
            if(arr.size() == 1){
                System.out.println(arr.get(0));
                arr.remove(0);
            } else{
                System.out.println(arr.get(arr.size()-1));
                arr.remove(arr.size()-1);
            }
        }
        
        System.out.println("Reached End of File.");
    }
}

//This is Problem 2 of Lab 2
public class Problem2{
    
    public static void main(String[]args)throws IOException{
        Scanner fileName = new Scanner(new File("input.txt"));
        readIntFiles(fileName);
        
    }
    
    public static void readIntFiles(Scanner a){
        int temp = 0;
        if(a.hasNextInt()){
            
            temp = a.nextInt();
            readIntFiles(a);
            System.out.println(temp);
        }
    }
    
}