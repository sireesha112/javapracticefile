import java.io.*;
import java.util.Scanner;

public class Cal
{
    static double h;
    static double r;
static double powerInt(int num1,int num2)
{
h=Math.pow(num1,num2);
return h;
    
}
 static double powerDouble(double num3,double num4)
{

r=Math.pow(num3,num4);
return r;
}
}
class Sample{
public static void main(String[] args){
double h=Cal.powerInt(2,2);
double r=Cal.powerDouble(2,2.4);
System.out.println("result:"+h);
System.out.println("result:"+r);
}
}
