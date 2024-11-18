

package tarea2.ejercicios_orientada;

/**
//Author: Jhon Díaz
//Abstract: Ejercicios POO
 */
import java.util.Scanner; // Se importa scanner para que el usuario digite en la consola (se usara en ejercicios siguientes)

public class Ejercicios_orientada { 
    
 /**
   public static void main(String[] args) { Se define la clase principal 
        System.out.println("Hola, ya se imprimir frases");  Se pide al programa mostrar la frase
    }
}
*/
 /**
    public static void main(String[] args){ //Se define la clase principal
        suma(); // Se llama el metodo suma
    }
    public static void suma(){
               int a = 200; //Se ingresa el primer entero
               int b = 73; //Se ingresa el segundo entero
               int total = (a + b); //Se les suma
               System.out.print(total); //Se muestra el resultado en pantalla
                  
       }
}
*/
 /**
    public static void main(String[] args){ //Se define la clase principal
        suma(); // Se llama el metodo suma
    }
    public static void suma(){
               double a = 0.3; //Se ingresa el primer dato en este caso un double para que sea decimal
               int b = 5; //Se ingresa un segundo dato el cual es entero
               double total = (a + b); //Se les suma
               System.out.print(total); //Se muestra el resultado en pantalla
                  
       }
}
*//*
    
    //**
    public static void main(String[] args){ //Se define la clase principal
        suma(); // Se llama el metodo suma
    }
    public static void suma(){
               int a = 1234; //Se ingresa el entero solicitado
               int b = 532; //Se ingresa el segundo entero solicitado
               int total = (a + b); //Se le pide al programa que los sume
               System.out.print("la suma de " +a+" + "+b+" es igual a "+total); //Se muestra el resultado en pantalla
                  
       }
    }
        
}*/

 //** public static void main(String[] args){ //Se define la clase principal
  //**        resta(); // Se llama el metodo resta
  //**    }
  //**    public static void resta(){
  //**               int a = 1234; //Se ingresa el entero solicitado
   //**              int b = 532; //Se ingresa el segundo entero solicitado
   //**              int total = (a - b); //Se le pide al programa que los resta
   //**              System.out.print("la resta de " +a+" - "+b+" es igual a "+total); //Se muestra el resultado en pantalla
                  
  //**       }
  //**    }
       
   /*      
    public static void main(String[] args){ //Se define la clase principal
        multiplicacion(); // Se llama el metodo multiplicacion
    }
    public static void multiplicacion(){
               int a = 1234; //Se ingresa el entero solicitado
               int b = 532; //Se ingresa el segundo entero solicitado
               int total = (a * b); //Se le pide al programa que los multiplique
               System.out.print("la multiplicion de " +a+" x "+b+" es igual a "+total); //Se muestra el resultado en pantalla
                  
       }
    }*/
    
    /*
       public static void main(String[] args){ //Se define la clase principal
        division(); // Se llama el metodo division
    }
    public static void division(){
               double a = 1234; //Se ingresa el dato solicitado
               double b = 532; //Se ingresa el segundo dato solicitado
               double total = (a / b); //Se le pide al programa que los divida y se le define como double para que nos muestre los decimales
               System.out.print("la division de " +a+" / "+b+" es igual a "+total); //Se muestra el resultado en pantalla
                  
       }
    }*/
     /*public static void main(String[] args){ //Se define la clase principal
        for(int i=1; i<=3; i++) { //Se crea un bucle que recoja desde el 1 todos los numeros mayores o iguales a 3
            System.out.println(i); // Se imprime el intervalo obtenido
        }
    }
}*/
   /* public static void main(String[] args){ //Se define la clase principal
        for(int i=1; i<=9; i++) { //Se crea un bucle que recoja desde el 1 todos los numeros mayores o iguales a 9
            System.out.println(i); // Se imprime el intervalo obtenido
        }
    }
}

    public static void main(String[] args){ //Se define la clase principal
        for(int i=1; i<=10000; i++) { //Se crea un bucle que recoja desde el 1 todos los numeros mayores o iguales a 10000
            System.out.println(i); // Se imprime el intervalo obtenido
        }
    }
}
        public static void main(String[] args){ //Se define la clase principal
        for(int i=5; i<=10; i++) { //Se crea un bucle que recoja desde el 5 todos los numeros mayores o iguales a 10
            System.out.println(i); // Se imprime el intervalo obtenido
        }
    }
}
        public static void main(String[] args){ //Se define la clase principal
        for(int i=5; i<=15; i++) { //Se crea un bucle que recoja desde el 5 todos los numeros mayores a este o iguales a 15
            System.out.println(i); // Se imprime el intervalo obtenido
        }
    }
}
     public static void main(String[] args){ //Se define la clase principal
        for(int i=5; i<=15000; i++) { //Se crea un bucle que recoja desde el 5 todos los numeros mayores a este o iguales a 15000
            System.out.println(i); // Se imprime el intervalo obtenido
        }
    }
}
          public static void main(String[] args){ //Se define la clase principal
        for(int i=5; i<=200; i++) { //Se crea un bucle que cuente de 1 a 200
            System.out.println("Hola"); // Se imprime la palabra hola en la cantidad establecida en el bucle
        }
    }
}
         public static void main(String[] args){ //Se define la clase principal
        for(int i=1; i<=30; i++) { // Se obtienen los primeros 30 numeros naturales
            int cuadrado = i * i; // Se elevan al cuadrado multiplicandose por si mismos
            System.out.println(cuadrado); // Se imprimen los cuadrados obtenidos
        }
    }
}
         public static void main(String[] args){ //Se define la clase principal
             long multiplicacion = 1; // Se aplica el long para manejar numeros grandes
             for(int i=1; i<=20; i++) { //Se crea un bucle que recoja desde el 1 todos los numeros mayores a este o iguales a 20
                 multiplicacion *=i; // Se multiplican
            System.out.println(multiplicacion); // Se imprime el producto
        }
    }
}
             public static void main(String[] args){ //Se define la clase principal
                 long suma = 0; // Se define "suma" con un valor inicial de 0
                 for (int i = 1; i <= 100; i++) { //Se recopilan los datos de 1-100
                     suma += i * i;  // Se multiplican
                     System.out.println(suma); // Se imprime el producto
             }
             }
} 
        public static void main(String[] args) { //Se define la clase principal
            Scanner scanner = new Scanner(System.in); // Se crea un scanner para porder recibir informacion del usuario
            System.out.print("Ingrese un numero entero: "); //Se le realiza la prengunta al usuario
            int numero = scanner.nextInt(); //Se recoge el dato
            
            int suma = 0; // Se define suma como 0
            for (int i = numero + 1; i<= numero + 100; i++){ //Se recogen los 100 enteros existentes despues del dato ingresado
                suma+=i;//Se realiza la operacion
            }
            System.out.println(suma); //Muestra el resultado por pantalla
        }
}
       public static void main(String[] args) { //Se define la clase principal
            Scanner scanner = new Scanner(System.in); // Se crea un scanner para porder recibir informacion del usuario
            System.out.print("Ingrese la cantidad de euros: "); //Se le realiza la prengunta al usuario
            double euro = scanner.nextDouble(); //Se recoge el dato, se usa double para manejar decimales
            
            double tasa = 1.05; // Se define la tasa de cambio 1 Euro -> 1.05 Dolares
            double dolares = euro * tasa; //Se realiza la conversion      
            System.out.println(dolares); //Muestra el resultado por pantalla
        }

       public static void main(String[] args) { //Se define la clase principal
            Scanner scanner = new Scanner(System.in); // Se crea un scanner para porder recibir informacion del usuario
            System.out.print("Ingrese la altura del rectangulo: "); //Se le realiza la prengunta al usuario
            double altura = scanner.nextDouble(); //Se recoge el dato, se usa double para manejar decimales
            System.out.print("Ingrese el ancho del rectangulo: "); //Se le realiza la prengunta al usuario
            double ancho = scanner.nextDouble(); //Se recoge el dato, se usa double para manejar decimales
            
            double area = altura * ancho; // Se define la formula del area de un rectangulo b*h
            System.out.println(area); //Muestra el resultado por pantalla
        }
}
           public static void main(String[] args) { //Se define la clase principal
            Scanner scanner = new Scanner(System.in); // Se crea un scanner para porder recibir informacion del usuario
            System.out.print("Numero 1: "); //Se le realiza la prengunta al usuario
            double no1 = scanner.nextDouble(); //Se recoge el dato, se usa double para manejar decimales
            System.out.print("Numero 2: "); //Se le realiza la prengunta al usuario
            double no2 = scanner.nextDouble(); //Se recoge el dato, se usa double para manejar decimales
            if (no1 < no2){ //Se incia a condicionar los posibles resultados
                System.out.println(no1+" < "+no2); //Se aplica la sentencia
            }else if (no1 > no2){ //En caso que no se cumpla el condicional anterior se vuelve a poner otra condicion
                System.out.println(no1+" > "+ no2); //Se aplica la sentencia
            }else { //Si no cumple ninguna de las anteriores se asume que son iguales
                System.out.println(no1+ " = "+no2); //Se aplica la sentencia
            }
           }
}
               public static void main(String[] args) { //Se define la clase principal
            Scanner scanner = new Scanner(System.in); // Se crea un scanner para porder recibir informacion del usuario
            System.out.print("Numero: "); //Se le realiza la prengunta al usuario
            int numero = scanner.nextInt(); //Se recoge el dato entero
            for (int i=1; i<numero; i+=2){ //Se recopilan los numeros impares menores que este
                System.out.println(i); //Se muestra el resultado
            }
               }
}
        public static void main(String[] args) { //Se define la clase principal
            Scanner scanner = new Scanner(System.in); //Se llama scanner para solicitar informacion
            System.out.print("Ingrese el primer numero: "); //Se realiza la pregunta
            int no1 = scanner.nextInt(); //Se recoge el dato ingresado

            System.out.print("Ingrese el segundo numero: ");//Se realiza la pregunta
            int no2 = scanner.nextInt();//Se recoge el dato ingresado
            
            int MCD = calculoMCD(no1, no2); //Se define el calculo del MCD
            System.out.println(MCD); //Se muestra el resultado
        }
        public static int calculoMCD(int no1, int no2) { //Se define el algoritmo de Euclides para el maximo comun divisor
        while (no2 != 0) {
            int residuo = no1 % no2;
            no1 = no2;
            no2 = residuo;
        }
        return Math.abs(no1); // Aplica valor absoluto para que sea positivo
    }
}
        public static void main(String[] args) { //Se crea la clase principal
        Scanner scanner = new Scanner(System.in); //Se llama a scanner
        System.out.print("a: "); // Se realiza la pregunta
        double a = scanner.nextDouble(); //Se recoge el dato ingresado
        System.out.print("b: ");// Se realiza la pregunta
        double b = scanner.nextDouble();//Se recoge el dato ingresado
        System.out.print("c: ");// Se realiza la pregunta
        double c = scanner.nextDouble();//Se recoge el dato ingresado

        if (a == 0) { //Se define con un condicional que si a es 0 no aplica
            System.out.println("No es una ecuacion de segundo");
        } else {
            double discriminante = b * b - 4 * a * c; // Se determina el discriminante

            if (discriminante > 0) { //Si hay mas de 0 discriminantes hay 2 posibles soluciones
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("Soluciones:");
                System.out.printf("x1 = %.2f\n", x1);
                System.out.printf("x2 = %.2f\n", x2);
            } else if (discriminante == 0) { //Si no hay discriminantes solo hay 1 solucion posible

                double x = -b / (2 * a);
                System.out.println("Solucion:");
                System.out.printf("x = %.2f\n", x);
            } else { //Si nada de lo anterior se cumple no hay soluciones
                System.out.println("No tiene soluciones");
            }
        }
    }
}
        public static void main(String[] args) { //Se define la clase principal
        Scanner scanner = new Scanner(System.in); //Se llama a scanner
        System.out.print("x: "); // Se realiza la pregunta
        int x = scanner.nextInt();//Se recoje el dato ingresado
        System.out.print("y: ");// Se realiza la pregunta
        int y = scanner.nextInt();//Se recoje el dato ingresado

        long resultado = ackermann(x, y);//Se utiliza long para manejar datos grandes

        System.out.println(resultado); //Se imprime el resultado
    }

    public static long ackermann(long m, long n) { //Se define ackermann
        m =0;
        n= 0;
        if (m == 0) { // Caso con base 1
            return n + 1;
        } else if (n == 0) { // Caso con base 2
            return ackermann(m - 1, 1);
        } else { // Caso con recursividad
            return ackermann(m - 1, ackermann(m, n - 1));
        }
    }
}
    public static void main(String[] args) { //Se define la clase principal
        Scanner scanner = new Scanner(System.in); //Se llama a scanner
        System.out.print("Numero: "); //Se realiza la pregunta
        int n = scanner.nextInt();//Se recopila el dato
        if (n < 0) { //Se revisa que no sea negativo
            System.out.println("Debe ser positivo"); //Manda el error acorde
        } else { 
            long resultado = factorial(n);//Se define que factorial es long para manejar numeros grandes
            System.out.println(resultado);//Se imprime el resultado
        }
    }
    public static long factorial(int n) {//Se define factorial
        if (n == 0 || n == 1) {//Define que si es 0 o 1 el factorial es 1
            return 1; 
        } else { 
            return n * factorial(n - 1); //Sino realza la operacion y lo devuelve como resultado
        }
    }
}
  /*
    public static void main(String[] args) { //Se define la clase principal
        Scanner scanner = new Scanner(System.in); //Se llama a scanner
        System.out.print("Numero 1: "); //Se realiza la pregunta
        int no1 = scanner.nextInt(); //Se recoge el dato
        System.out.print("Numero 2: ");//Se realiza la pregunta
        int no2 = scanner.nextInt(); //Se recoge el dato
        System.out.print("Numero 3: ");//Se realiza la pregunta
        int no3 = scanner.nextInt(); //Se recoge el dato

        if (no1 <= 0 || no2 <= 0 || no3 <= 0) { //Se limitan los positivos solo
            System.out.println("Solo positivos"); //Muestra el error
        } else {
            int mayor = no1; //Se define el mayor provisional
            int menor = no1; //Se define el menor provisional
            if (no2 > mayor) mayor = no2; //Se define si numero 2 sera el mayor
            if (no2 < menor) menor = no2; //Se define si numero 2 sera el menor
            if (no3 > mayor) mayor = no3; //Se define si numero 3 es el mayor
            if (no3 < menor) menor = no3; //Se define si el numero 3 es el menor
            System.out.println("Mayor: " + mayor); //Imprime los resultados acordes
            System.out.println("Menor: " + menor);
        }
    }
}
        public static void main(String[] args) { //Se define la clase principal
        Scanner scanner = new Scanner(System.in); //Se llama a Scanner
        while (true) { 
            System.out.print("Grados Fahrenheit (999 para finalizar): "); //Se realiza la pregunta especificando como terminar
            double fahrenheit = scanner.nextDouble();
            if (fahrenheit == 999) { //Se verifica si el numero ingresado es 999 terminar con la operacion con un break
                System.out.println("Programa finalizado.");
                break;
            }
            double celsius = (5.0 / 9.0) * (fahrenheit - 32); //Si no se continua y se aplica la formula
            System.out.println(celsius);
        }
        
    }
}
        public static void main(String[] args) {//Se define la clase principal
        for (int i = 1; i <= 3; i++) { //Se recopilan datos del 1-3
            System.out.print("Caso " + i + ": ");
            switch (i) { //Se aplica el switch y sus sentencias
                case 1:
                    System.out.println("Hola caso 1");
                case 2:
                    System.out.println("Hola caso 2");
                case 3:
                    System.out.println("Hola caso 3");
            }
        }
    }
}
        public static void main(String[] args) { //Se define la clase principal
        Scanner scanner = new Scanner(System.in); //Se llama a scanner
        System.out.println("Ingrese datos. Para acabar operacion presione CTRL-Z y luego presione Enter."); //Se solicitan los datos y 
        //se muestra como terminar
        while (scanner.hasNext()) { //Se establece el bucle de lectura e impresion de datos
            String linea = scanner.nextLine();
            System.out.println("Usted ingresó: " + linea);
        }
        System.out.println("Fin de la entrada detectado. Programa finalizado.");//Se da una sentencia para cuando se use ctrl z
        
    }
}
        public static void main(String[] args) { //Se define la clase principal
        Scanner scanner = new Scanner(System.in); //Se llama a Scanner
        System.out.print("Ingrese el numero hasta el cual quiere buscar primos: "); //Se realiza la pregunta
        int limite = scanner.nextInt(); //Se recopila el dato
        for (int i = 2; i <= limite; i++) { //Se recogen los numeros menores o iguales al limite
            boolean esPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) { //Se intenta sacar raiz de los numeros recogidos
                if (i % j == 0) {
                    esPrimo = false; //Se define si son primos hasta que esto se deje de cumplir y se termina
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(i); //Muestra los primos
            }
        }
    }
}*/