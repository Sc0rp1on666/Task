import java.io.*;
import java.util.*;

public class WriteObj {
     public static void main(String[] args) throws IOException {
         System.out.println("Write object");// just text
         int Worknumber;// variable for number of workers
         Scanner scan= new Scanner(System.in);// declaration of scanner
         System.out.println("How many users?");// just text
         Worknumber=scan.nextInt();// ussage of scanner to manually update 
         Tasks2 [] Workers ={ new Tasks2("Marcel","Rusu","RusuMarcel","Create Test users","Create users for testing with different permissions")};
         // test single object
         ArrayList<Tasks2> WorkerList = new  ArrayList<Tasks2>(Arrays.asList(Workers));// declare a new Array of objects
         
         try(FileOutputStream fs = new FileOutputStream("Worker.ser")){// creates the file itself
             ObjectOutputStream os = new ObjectOutputStream(fs);// creates the output stream for file
             for(int i=0;i<Worknumber;i++){
             objIndex = Workers.findIndex((obj => obj.FirstName =="Marcel"));// try to change value of an object using index
             console.log("Before update: ", Workers[objIndex]);// output for console
             Workers[objIndex].FirstName = scan.nextLine();// try to assign new data for an field from object
             }
             os.writeObject(Workers);// write only one object
             os.writeObject(WorkerList);// write Array of objects of Workers
             os.writeInt(WorkerList.size());// How many objects are written in file
             for(Tasks2 task:WorkerList){
                 os.writeObject(Workers);// write each object in array
             }
             os.close();// close the flow
         }catch(FileNotFoundException e){// exception if file doesn't exist
             e.printStackTrace();
         }catch (IOException e){// exception for input output
             e.printStackTrace();
         }
     }
}
