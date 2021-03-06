
//cargamos de las librerias la clase scanner
import java.util.Scanner;

//importamos el pakete
import com.zubiri.geometria.*;

//CLASSPATH=:/home/zubiri/ProyectosJava; export CLASSPATH

//definimos el nombre de la clase
public class OperacionesGeometricas {

	//sin esta linea no se ejecuta el programa
	public static void main (String[] args) {

	//Creamos una varaible y expecificamos el tipo de dato en este caso char
	char seleccion;
	
	//Utilizamos Scanner y lo guardamos en la variable sc
	Scanner sc = new Scanner(System.in);
	
	//Imprimimos en pantalla el texto
	System.out.println("\n¿De que figura quieres hacer los cálculos? Escribe (C),(R) o (T)");
	
	//pedimos al usuario introducir lo solicitado y lo guardamos en la variable seleccion
	seleccion = sc.next().charAt(0);

	//si la variable cumple la condicion comienza el bucle
	while (seleccion != 'T'&& seleccion != 't')
	{
		//si la variable cumple la condicion ejecuta el contenido de if	
		if(seleccion=='C' || seleccion=='c' )
		{
			//System.out.println("has elegido circulo");
			//con el equalsIgnoreCase no hace falta distinguir entre mayusculas y minusculas.
			//con char usar comillas simples, no usar equalsIgnoreCase.

			float radio, resultadoArea, resultadoCircun;

			System.out.print("\ningresa un radio: ");
			radio = sc.nextFloat();
			
			//metemos el contenido de la variable radio en la clase Ciruclo
			Circulo operaciones = new Circulo(radio);
			
			//pedimos a la clase circulo que nos de el area y lo guarde en la variable resultadoArea
			resultadoArea = operaciones.area();
			
			//pedimos a la clase circulo que nos de el circunferencia y lo guarde en la variable resultadoCircun
			resultadoCircun = operaciones.circu();

			//Imprime en pantalla el contenido de las variables antes guardadas
			System.out.println("\nEl resultado del AREA es: " + resultadoArea);
			System.out.println("\nEl resultado de la CIRCUNFERENCIA es: " + resultadoCircun);
	
			System.out.println("\n\nEGUN ONA IZAN!!\n");
		}


		//Si la variable no cumplio la condicion anterior lo intenta con esta
		else if (seleccion=='R' || seleccion=='r')
		{
			//System.out.println("has elegido rectangulo");
				
			  //creamos las variables y expecificamos el tipo de dato.
			  double altura = 0, base = 0;
			  double result = 0;
		
			  //Imprimimos en pantalla
			  System.out.print("Estamos trabajando con un rectangulo");

			  System.out.print("\ningresa la altura: ");
			  //guardamos en la variable lo que ha introducido el usuario que tiene que ser de tipo numerico
			  altura = sc.nextDouble();

			  System.out.print("\ningresa la base: ");
			  base = sc.nextDouble();

			  //llamamos a la clase Rectangulo enviandole mediante variables lo que el usuario introdujo
			  Rectangulo rectangulo = new Rectangulo(base, altura);

			  //Pedimos a la clase rectangulo el area y lo guardamos en una variable
			  result =  rectangulo.area();
			  //Imprimimos en pantalla el resultado
			  System.out.println("El area del rectangulo: " + result); 
			
			  result =  rectangulo.perimetro();
			  System.out.println("El perimetro del rectangulo: " + result); 
		}
		//si no se cumplio la anteriores condiciones entra en el else
		else
		{
			//si la variable cumple con alguna de estas condiciones
			if(seleccion=='T' || seleccion=='t')
			{
				//este commando termina el bucle
				break;
			}

			//Si no cumplio las anteriores condiciones entrara en esta
			else
			{
				//Imprimimos en pantalla informando al usuario que no introdujo la figura correcta.
				System.out.println("Error, no has elegido la figura correcta");
			}
		}
		//Si cumplio la condicion de C o R vuelve a preguntar que operacion quiere realizar
		System.out.println("\n\n¿Que operacion quieres volver a realizar? Escribe (C),(R) o (T) \n");
		
		seleccion = sc.next().charAt(0);
	}
	//Cuando termina el bucle imprime en pantalla el texto.
	System.out.println("\nHas seleccionado salir.\n");
}
}
