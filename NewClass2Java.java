/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasem2;

/**
 
 @author NgushcarlWAn
 * abs(x)	Returns the absolute value of x
acos(x)	Returns the arccosine of x, in radians
asin(x)	Returns the arcsine of x, in radians
atan(x)	Returns the arctangent of x as a numeric value between -PI/2 and PI/2 radians
cbrt(x)	Returns the cube root of x
ceil(x)	Returns the value of x rounded up to its nearest integer
copySign(x, y)	Returns the first floating point x with the sign of the second floating point y
cos(x)	Returns the cosine of x (x is in radians)
cosh(x)	Returns the hyperbolic cosine of a double value
exp(x)	Returns the value of Ex
expm1(x)	Returns ex -1
floor(x)	Returns the value of x rounded down to its nearest integer
getExponent(x)	Returns the unbiased exponent used in x
hypot(x, y)	Returns sqrt(x2 +y2) without intermediate overflow or underflow
IEEEremainder(x, y)	Computes the remainder operation on x and y as prescribed by the IEEE 754 standard
log(x)	Returns the natural logarithm (base E) of x
log10(x)	Returns the base 10 logarithm of x
log1p(x)	Returns the natural logarithm (base E) of the sum of x and 1
max(x, y)	Returns the number with the highest value
min(x, y)	Returns the number with the lowest value
nextAfter(x, y)	Returns the floating point number adjacent to x in the direction of y
nextUp(x)	Returns the floating point value adjacent to x in the direction of positive infinity
pow(x, y)	Returns the value of x to the power of y
random()	Returns a random number between 0 and 1
round(x)	Returns the value of x rounded to its nearest integer
rint()	Returns the double value that is closest to x and equal to a mathematical integer
signum(x)	Returns the sign of x
sin(x)	Returns the sine of x (x is in radians)
sinh(x)	Returns the hyperbolic sine of a double value
sqrt(x)	Returns the square root of x
tan(x)	Returns the tangent of an angle
tanh(x)	Returns the hyperbolic tangent of a double value
toDegrees(x)	Converts an angle measured in radians to an approx. equivalent angle measured in degrees
toRadians(x)	Converts an angle measured in degrees to an approx. angle measured in radians
ulp(x)	Returns the size of the unit of least precision (ulp) of x
 */
public class NewClass2Java {
    public static void main(String[]args){
    int x =120;
    int y = 200;
     
    String txt= "Ngure likes Codding";
   int t= txt.length();
   System.out.println(Math.min(10, 2));
   System.out.println(Math.max(11, 30));
    
    
    System.out.println(x+y);
    System.out.println("The text characters are  " + t);
    System.out.println(txt.toUpperCase());
    System.out.println(txt.toLowerCase());
    System.out.println(txt.indexOf("n"));
    System.out.println(x>y);
     System.out.println(x<y);
      System.out.println(x==y);
      
      /*
Use if    to specify a block of code to be executed, if a specified condition is true
Use else  to specify a block of code to be executed, if the same condition is false
Use else  if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be execute 
      */
      if(20>18){
          System.out.println("20 is greater than 18");
      }
      int time =12;
      if (time>12){
          System.out.println("Good Morning");
      }
      else{
        System.out.println("Good Afternoon");
     
    }
         
        int c= 30;
        if(c>40){
            System.out.println("c is less than 40");
        }else if(c>70){
            System.out.println("c is less than 70");
            
           }else{
            System.out.println("c is lesser");
        }
        // java Switch 
        
        /* Break is used to stop the code from executing when a match is finally found*/
        int day = 4;
        switch (day){
            case 1:
                System.out.println("Mon");
            break;
            case 2:
                System.out.println("Tues");
            break;
            case 3:
                System.out.println("Wen");
            break;
            case 4:
                System.out.println("Thur");
            break;
            case 5:
                System.out.println("Fri");
            break;
             case 6:
                System.out.println("Sat");
            break;
            case 7:
                System.out.println("Sun");
            break;
              
        }
        //Default key word is used if a match is not found it is executed eg
        
        int wday = 4;
        switch (wday){
            case 1:
                System.out.println("mon");
                break;
            case 10:
                System.out.print("sun");
                break;
            default:
                System.out.println("looking forward to weekend");
        }
        //while loop loops in the cod as long as the condition is true eg
        
        int i = 0;
        while (i<5){
            System.out.println(i);
              i++;
          
        }
        //do/while the code if executed first before the condition is tested eg
        
        int j = 0;
        do{
            System.out.println(j);
            j++;
        }
        while (j<5);
            
        
                
        
}
}
