import java.util.Scanner;
class VoterAgeException extends Exception
{
VoterAgeException(String s)
{
super(s);
}
}

class UserExcept
{
public static void main(String args[])
{
int age;
Scanner o = new Scanner(System.in);
System.out.println("Enter your age: ");
age = o.nextInt();
try
{
if(age<18)
{
throw new VoterAgeException("Age less than 18 so not eligible for votting");
}
else
{
System.out.println("Eligible for votting");
}
}
catch(VoterAgeException e)
{
System.out.println(e.getMessage());
}
} 
}