package tweetsParser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Parser {
   private ArrayList<String> robba = new ArrayList<>();
   private HashMap<String, Integer> pippolippo = new HashMap();
    //Integer occurences;



    public void readFile (){
        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/djdin/Desktop/realdonaldtrump.csv"))) {
            String line;
            String[] row;
            while ((line = br.readLine()) != null) {
                row = line.split(",");
                String content = "";
                for (int i = 2; i < row.length-6; i++) {
                    content += row[i];
                    String [] words=content.split(" ");
                    for (int j = 0; j < words.length; j++) {
                        char quotes = 34;
                       // words[j].replace(" has","pene ");
                        robba.add(words[j].replaceAll("[^a-zA-Z0-9]",""));


                        if(!pippolippo.containsKey(words[j].replaceAll("[^a-zA-Z0-9]",""))){
                            pippolippo.put(words[j],1);
                        }
                        else {
                            if(pippolippo.get(words[j])!= null){
                                int value = pippolippo.get(words[j])+1;
                            pippolippo.replace(words[j],pippolippo.get(words[j]),value);
                            }
                        }
                    }
                 }
                }
            }
         catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        Parser p = new Parser();
        p.readFile();


        //System.out.println(p.pippolippo.values().stream().sorted(Integer::compareTo).collect(Collectors.toList()));

         System.out.println(p.pippolippo.toString());


    }
}


