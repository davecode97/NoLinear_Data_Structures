package Tree;

import java.io.*;
import javax.swing.JOptionPane;
import static java.lang.System.out;
import java.util.*;

public class PruebaArbol {
    static  Arbol arbol = new Arbol();
    static int valor;
    static String Dato;
    	
    public static void main(String[] args)throws java.io.IOException {
    	int N=0;
    	String datoEntrada;
    	InputStreamReader entrada = new InputStreamReader(System.in);
    	BufferedReader flujoEntrada = new BufferedReader(entrada);
    	Scanner LeerTeclado = new Scanner(System.in);
    	
    	while(true){
    		out.println("------------------------------");
    		out.println("           BINARY TREE        ");
    		out.println("------------------------------");
    		out.println("  1)..............Insert      ");
    		out.println("  2)..............PreOrder    ");
    		out.println("  3)..............InOrder     ");
    		out.println("  4)............  PosOrder    ");
    		out.println("  5)..............Leave       ");
    		out.println("------------------------------");
    	
    		do{
    			out.print("  >");
    			try{
    				N = LeerTeclado.nextInt();
    				if(N<1||N>5){
    					out.println("Error solo datos de 1 a 5");
    					continue;
    				}
    				break;	
    			}catch(InputMismatchException e){
    				out.println("Error, solo introducir numeros enteros");
    				LeerTeclado.next();
    			}
    		}while(true);
    		switch(N){
    			case 1:
    				InsertarDato();
    			break;
    			
    			case 2:
    				Preorden();
    				out.println("Precione enter para continuar");
    				System.in.read();
    			break;
    			
    			case 3:
    				Inorden();
    				out.println("Precione enter para continuar");
    				System.in.read();
    			break;
    			
    			case 4:
    				Posorden();
    				out.println("Precione enter para continuar");
    				System.in.read();
    			break;
    			
    			case 5:
    				System.exit(0);
    			break;	
    		}
    	}
    }
    public static void InsertarDato()throws java.io.IOException{
    	Dato = JOptionPane.showInputDialog("Inserte el numero de nodos que desea ingresar");
    	int n = Integer.parseInt(Dato);
    	
    	for(int i=1; i<=n;i++){
    		Dato = JOptionPane.showInputDialog("Dame el "+ i +" valor para colocar en el arbol");
    		valor = Integer.parseInt(Dato);
    		out.println(valor + " ");
    		arbol.InsertarNodo(valor);
    	}
    }
    public static void Preorden()throws java.io.IOException{
    	out.println("recorrido preorden");
    	arbol.RecorridoPreorden();
    }
        public static void Inorden()throws java.io.IOException{
    	out.println("recorrido inorden");
    	arbol.RecorridoInorden();
    }
        public static void Posorden()throws java.io.IOException{
    	out.println("recorrido postorden");
    	arbol.RecorridoPosorden();
    }
}
