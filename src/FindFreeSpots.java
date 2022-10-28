import java.io.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FindFreeSpots {
    FindFreeSpots()
    {

    }
    public static boolean ReadFromFile() throws IOException
    {
        boolean e = false;
        int ans =0;
        BufferedReader br = null;
        try {
            File file = new File("src/urinal.dat"); // java.io.File
            FileReader fr = new FileReader(file); // java.io.FileReader
            br = new BufferedReader(fr); // java.io.BufferedReader




            //incrementing file name if already exists
            String fileName = "rules.txt";
            String extension = "";
            String name = "";

            int idxOfDot = fileName.lastIndexOf('.');   //Get the last index of . to separate extension
            extension = fileName.substring(idxOfDot + 1);
            name = fileName.substring(0, idxOfDot);

            Path path = Paths.get(fileName);
            int counter = 1;
            File fout = null;
            while(Files.exists(path)){
                fileName = name+""+counter+"."+extension;
                path = Paths.get(fileName);
                counter++;
            }
            fout = new File(fileName);
            FileOutputStream fos = new FileOutputStream(fout);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("input : "+line);
                ans = CheckAvaibility(line);
                System.out.println("answer : "+ ans);
                bw.write(""+ans+"");
                bw.newLine();


            }
            bw.close();
        }
        catch(FileNotFoundException ex) {
            //file not found
            e=true;
        }
        catch(IOException ex) {
            //file not found
            e=true;
        }
        finally
        {
            try { if (br != null) br.close(); }
            catch(IOException ex) { e=true; }
        }
return e;

    }

    public static int CheckAvaibility(String Input){
        boolean ex=false;
        boolean IsCorrectString=true;
        int freeUrinals=0;
        try{
        for (int i=0;i<Input.length();i++){

            if (Input.charAt(i) == '0') {
                if ((i - 1 >= 0 && Input.charAt(i - 1) == '0') && (i + 1 < Input.length() && Input.charAt(i + 1) == '0')) {
                    freeUrinals++;
                }
            } else {
                IsCorrectString=checkString(Input,i);
                if(IsCorrectString==false)
                {
                    freeUrinals=-1;
                    break;
                }
            }

        }}
        catch(StringIndexOutOfBoundsException e){
            ex=true;

        }

        return freeUrinals;
    }

    public static boolean checkString(String Input,int  Index)
    {
        boolean IsCorrect=true;
        if ((Index - 1 >= 0 && Input.charAt(Index - 1) == '1') || (Index + 1 < Input.length() && Input.charAt(Index + 1) == '1')) {
            IsCorrect = false;}
        return IsCorrect;
    }
}
