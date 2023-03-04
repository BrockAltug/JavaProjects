package Project_2;
//create 3 classes with constructors, create main method, call the constructors to create objects
//create new class for Students
class Students{
    //new private for String - StudentsName
    private String studentsName;
    //new private for int - studentsId
    private int studentsId;
    //create constructor public Students with new variables
    ////create new parameters inside (here), in this case string for theStudentsName, and int for theStudentsId, to get new values to give to the variables - (studentsName,studentsId)
    public Students (String theStudentsName, int theStudentsId){
        //studentsName = whatever the new input of theStudentsName is
        studentsName = theStudentsName;
        //studentsId = whatever the new input of theStudentsId is
        studentsId = theStudentsId;
    }
}
class Houses {
    private int housesAddress;
    private String housesStreet;
    public Houses(int theHousesAddress, String theHousesStreet){
        housesAddress = theHousesAddress;
        housesStreet = theHousesStreet;
    }
}
class Employees {
    private String employeesName;
    private int employeesPhoneNumber;
    public Employees(String theEmployeesName, int theEmployeesPhoneNumber){
        employeesName = theEmployeesName;
        employeesPhoneNumber = theEmployeesPhoneNumber;
    }
}
public class Assignment_11_Main {
    public static void main(String[] args) {
        //-------------------------------------------------------------------------------------------
        Employees employee1 = new Employees("John",2063757183);
        //-------------------------------------------------------------------------------------------
        Houses house1 = new Houses(47298,"SE Lightning ST");
        //-------------------------------------------------------------------------------------------
        Students student1 = new Students("Mike",317461);
        //-------------------------------------------------------------------------------------------
    }
}
