

// librerias 
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;


public class ptarea {
    public static void main(String[] args) {
        
        // variables de valor entero
        
        //generar un millon de numeros
        int contar = 1000000; 
        
        // rango 
        int rangoinicial = -10000000; 
        int rangofinal = 10000000; 
        

        
        // utilizando random
        int[] numeros = new int[contar];
        Random random = new Random();
        for (int i = 0; i < contar; i++) {
            numeros[i] = random.nextInt(rangofinal - rangoinicial + 1) + rangoinicial;
        }

       
        // Estructura de datoss 
        Arrays.sort(numeros);

        String Nombredelarchivo = "lista_de_numeros_aleatorios.txt";
        try {
            FileWriter writer = new FileWriter(Nombredelarchivo);
            for (int i = 0; i < contar; i++) {
                writer.write(Integer.toString(numeros[i]) + "\n");
            }
            writer.close();
            System.out.println("EL archivo se escribio con exito.");
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }
    }
}



