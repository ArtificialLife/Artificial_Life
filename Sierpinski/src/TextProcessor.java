import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Neill on 3/24/2015.
 */
public class TextProcessor {

    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
        String line = lectura.nextLine();
        String entrada = line;
        while(lectura.hasNext()){
            line = lectura.nextLine();
            entrada = entrada + " "+ line;
        }
        entrada = entrada.toLowerCase();
        entrada = entrada.replaceAll("í","i").replaceAll("ó","o").replaceAll("ú","u").replaceAll("á","a").replaceAll("é","e");
        String[] words = entrada.split(" ");
        Map<String, Integer> ranking = new TreeMap<String, Integer>();
        for(int i=0;i< words.length;i++) {
            if (ranking.containsKey(words[i])) {
                ranking.put(words[i], 1 + ranking.get(words[i]));
            } else {
                ranking.put(words[i], 1);
            }
        }
        for(String j: ranking.keySet()){
            System.out.println(j+" : "+ranking.get(j));
        }

    }
}
