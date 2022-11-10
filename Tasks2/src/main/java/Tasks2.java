import java.io.*;

public class Tasks2 implements Serializable{
    public String FirstName;
    public String LastName;
    public String UserName;
    public String TaskTitle;
    public String TaskDescription;
  
    // Default constructor
    public Tasks2(String FirstName, String LastName,String UserName,String TaskTitle,String TaskDescription)
    {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.UserName = UserName;
        this.TaskTitle = TaskTitle;
        this.TaskDescription = TaskDescription;
    }
    @Override
    public String toString(){
        return "ReadObj[FirstName="+FirstName+" ,LastName"+LastName+" ,UserName="+UserName+" ,TaskTitle="+TaskTitle+" ,TaskDescription="+TaskDescription+"]";
    }
}
