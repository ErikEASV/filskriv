// Skriv til fil med FileWriter (også med at tilføje til filen)
import java.io.FileWriter;
import java.io.IOException;
class CreateFile
{
    public static void main(String[] args) throws IOException
    {
        // Accept a string 
        String str = "Skriv til fil med FileWrite";

        // attach a file to FileWriter 
        FileWriter fw=new FileWriter("output.txt");
        //FileWriter fw=new FileWriter("output.txt" ,true);  // sæt i append-mode

        // Skriv til filen...
        fw.write("Nu skriver vi til filen...\n");
        // Skriv strengen ud som enkelt tegn...
        for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i));

        // Skriv besked til terminalen.
        System.out.println("Alt OK");

        // Luk filen
        fw.close();
    }
} 