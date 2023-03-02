package Project_2;

public class Assignment_03
{
    //analyze the following code and guess the output pt.2
    public static void main(String[] args) {
        int x = 5;
        x++;      //5 + 1
        System.out.println(x);    //printing 5
        x = 5;
        ++x;      //same as 5 + 1
        System.out.println(x);    //printing 5
        x = 5;
        System.out.println(x++);  //printing 5 + 1
        System.out.println(x);    //printing 5
        x = 5;
        System.out.println(++x);  //same thing as 1 + 5
        System.out.println(x);    //will be 6 because ++ before in above statement
        //result returned by var++ is the value of the variable before incrementing,
        //whereas the result returned by ++var is the value of the variable after the increment is applied
    }
}
