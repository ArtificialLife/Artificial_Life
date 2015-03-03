
import java.awt.BorderLayout;

public class SpanishLanguage {
    public static void main(String[] args) {
        char[] textoEspañol;
        char[] letras = new char[27];
        double[] probabilities = new double[27];
        for(int i=0;i<26;i++){
            letras[i] = (char)(i+65);
        }
        letras[26]='Ñ';
        probabilities[0] = 0.1253;
        probabilities[1] = 0.0142;
        probabilities[2] = 0.0468;
        probabilities[3] = 0.0586;
        probabilities[4] = 0.1368;
        probabilities[5] = 0.0069;
        probabilities[6] = 0.0101;
        probabilities[7] = 0.0070;
        probabilities[8] = 0.0625;
        probabilities[9] = 0.0044;
        probabilities[10] = 0.0001;
        probabilities[11] = 0.0497;
        probabilities[12] = 0.0315;
        probabilities[13] = 0.0671;
        probabilities[14] = 0.0868;
        probabilities[15] = 0.0251;
        probabilities[16] = 0.0088;
        probabilities[17] = 0.0687;
        probabilities[18] = 0.0798;
        probabilities[19] = 0.0463;
        probabilities[20] = 0.0393;
        probabilities[21] = 0.0090;
        probabilities[22] = 0.0002;
        probabilities[23] = 0.0022;
        probabilities[24] = 0.0090;
        probabilities[25] = 0.0052;
        probabilities[26] = 0.0031;
        for(int j=1;j<27;j++){
            probabilities[j]=probabilities[j]+probabilities[j-1];
        }
        System.out.println(probabilities[26]);
        for(int i=0;i<1000;i++){
            textoEspañol = new char[100];
            System.out.println("EXPERIMENTO #:"+i);
            System.out.println(ruleta(probabilities,textoEspañol,letras));
        }
        
    }

    private static String ruleta(double[] probabilities, char[] textoEspañol, char[] letras) {
        double probabilidad; 
        for(int i=0;i<100;i++){
             probabilidad = Math.random();
             for(int j=0;j<27;j++){
                 if(probabilidad<probabilities[j]){
                     textoEspañol[i]=letras[j];
                     break;
                 }
             }
         }
         return new String(textoEspañol);
    }

    
    
}
