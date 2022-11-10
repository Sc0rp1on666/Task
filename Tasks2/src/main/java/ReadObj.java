import java.io.*;
import java.util.*;

public class ReadObj{
     public static void main(String[] args) throws IOException {
         System.out.println("Read object");// just text
        
         try(FileInputStream fi = new FileInputStream("Worker.ser")){// creates flow for reading file itself
             ObjectInputStream os = new ObjectInputStream(fi);// creates the input stream for file
              Tasks2 [] Workers =(Tasks2[])os.readObject();// reads single object
              @SuppressWarnings("unchecked")// not show the warnings
              ArrayList<Tasks2> WorkerList = (ArrayList<Tasks2>)os.readObject();// assignation of variable to manipulate objects
              
              for(Tasks2 task: Workers){
                  System.out.println(task);// show data of single object
              }
              for(Tasks2 task: WorkerList){
                  System.out.println(task);
              }
              int number = os.readInt();//reads how many objects are in array
              for(int i=0;i<number;i++){
                  Tasks2 task= (Tasks2)os.readObject();//reads data from each object for the specified number of objects
                  System.out.println(task);//show data of objects
              }
             os.close();
         }catch(FileNotFoundException e){
             e.printStackTrace();
         }catch (IOException e){
             e.printStackTrace();
         }catch (ClassNotFoundException e){
              e.printStackTrace();
         }
     }
}
