import java.io.*;
class BufferedReaderExample
{
public static void main(String args[]) throws IOException
{
System.out.println("Enter a string: ");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String s = br.readLine();   
System.out.println(s);
}
}