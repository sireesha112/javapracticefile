import java.io.*;
import java.util.Scanner;
public class Box{
double h,w,d;
Box(double height,double width,double depth)
{
h=height;
w=width;
d=depth;
}
 double volume(){
double v;
v=h*w*d;
return v;
}
public static void main(String[] args){
Box bx=new Box(30,40,50);
System.out.println(bx.volume());
}
}
