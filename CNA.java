import java.io.*;

public class JavaProgram
{
    public static void main(String args[])
    {
		
String sentence = "ABC ABC ABC 123";


String indexes = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";


int[] count = new int[indexes.length()];


for (int i = 0; i < sentence.length(); i++) {
    
    int index = indexes.indexOf(sentence.charAt(i));

    
    if (index < 0)
        continue;

    count[index]++;
}
Then you can print them all out with this:

for (int i = 0; i < count.length; i++) {
    if (count[i] < 1)
        continue;

    System.out.println(String.format("%s (%d) %s",
            indexes.charAt(i),
            count[i],
            
            new String(new char[count[i]]).replace('\0', '*')));
}
