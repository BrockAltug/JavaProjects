package Practice;

import javax.xml.namespace.QName;

class person{
    private String name;
    private String eyes;
    private int age;
    public person(String theirName, int theirAge, String colorEyes){
        name = theirName;
        age = theirAge;
        eyes = colorEyes;
    }
    public void getPersonInfo(){
        System.out.println("The persons name is " + name);
        System.out.println("They are " + age + " years old");
        System.out.println("Their eyes are the color " + eyes);
    }
}
class fruit{
    private String type;
    private int count;
    public fruit(String fruitType, int fruitCount){
        type = fruitType;
        count = fruitCount;
    }
    public void getFruitInfo(){
        System.out.println("Their favorite fruit is " + type);
        System.out.println("When they go to the store they buy " + count + " of them");
    }
}
class job{
    private String jobName;
    private int weeklyHours;
    private double salary;
    public job(String theJobName, int theWeeklyHours, double theSalary){
        jobName = theJobName;
        weeklyHours = theWeeklyHours;
        salary = theSalary;
    }
    public void getJobInfo(){
        System.out.println("They work as a " + jobName);
        System.out.println("They work " + weeklyHours + " hours per week");
        System.out.println("They make $" + salary + " per hour");
        System.out.println("----------------------------------------------------");
    }
}
public class Practice3
{

    public static void main(String[] args)
    {
        System.out.println("Start of Main");
        System.out.println("----------------------------------------------------");
        person person1 = new person("James",28,"Blue");
        person person2 = new person("Emily",48,"Brown");
        person person3 = new person("Sara",19,"Green");
        //------------------------------------------------------------------------
        fruit fruit1 = new fruit("Strawberries", 5);
        fruit fruit2 = new fruit("Apples",9);
        fruit fruit3 = new fruit("Bananas",3);
        //------------------------------------------------------------------------
        job job1 = new job("Engineer",40,30.70);
        job job2 = new job("Farmer",70,25.54);
        job job3 = new job("Astronaut",23,250.32);
        //------------------------------------------------------------------------
        person1.getPersonInfo();
        fruit1.getFruitInfo();
        job1.getJobInfo();
        //-----
        person2.getPersonInfo();
        fruit2.getFruitInfo();
        job2.getJobInfo();
        //-----
        person3.getPersonInfo();
        fruit3.getFruitInfo();
        job3.getJobInfo();
        //-----
        System.out.println("End of Main");
    }

}
