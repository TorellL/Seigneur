import java.io.*;

public class Sample{

public static void main(String args[]) {

Process process;

try
{
process = Runtime.getRuntime().exec("perl ../PerlNussia/Lyndons_pengar.pl");
process.waitFor();
if(process.exitValue() == 0)
{
System.out.println("Command Successful");
}
else
{
System.out.println("Command Failure");
}
}
catch(Exception e)
{
System.out.println("Exception: "+ e.toString());
}
}
}