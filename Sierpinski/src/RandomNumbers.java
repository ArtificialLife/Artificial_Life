
package randomnumbers;

public class RandomNumbers {

    public static void main(String[] args) {
        int ITERATIONS = 30;
        int[] values = new int[30];
        double[] diferencia = new double[30];
        double aux;
        double suma=0;
        double desviacion = 0;
        for(int j=0;j<100;j++){
            for(int i=0;i<ITERATIONS;i++){
                aux = Math.random();
                if(aux<0.5){
                    values[i] = 0;
                }else{
                    values[i] = 1;
                }
                suma+=values[i];
            }
            suma = suma/ITERATIONS;
            for(int i=0;i<ITERATIONS;i++){
                diferencia[i] = suma-values[i];
                desviacion+=Math.pow(diferencia[i],2); 
            }
            desviacion = desviacion/(ITERATIONS-1);
            desviacion = Math.pow(desviacion,2);
            System.out.println("Experimento numero: "+j);
            System.out.println("Media: "+suma);
            System.out.println("Desviación "+desviacion);
        }
    }
    
}
