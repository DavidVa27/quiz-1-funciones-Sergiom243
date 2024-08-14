package quiz1sistemasg2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Ingrese el tipo de vehículo (C: Carro, M: Moto, B: Bicicleta): ");
        char tipoDeVehiculo;

        System.out.print("Ingrese numero de horas estacionado: ");
        int horas = sc.nextInt();

        System.out.print("¿Es estudiante? (1: Sí, 2: No): ");
        int esEstudiante = sc.nextInt();
        boolean esEstudianteBoolean = (esEstudiante == 1);

        double valorHora = calcularValorHora(tipoDeVehiculo, horas);

        double valorSinDescuento = valorHora;

        double valorConDescuento = calcularDescuento(valorSinDescuento, horas, esEstudianteBoolean);

        
    }
    
 /*  Implemente una funcion llamada calcularValorHora que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa el tipo de vehiculo (C, M o B)
            - Un entero que representa la cantidad de horas de permanencia
        * Retorna:
            - Un entero representando el valor total de las boletas
        * Controlar errores retornando -1
    */
    //------------------------------------------------------------------
    
    public static double calcularValorHora(char tipoDeVehiculo, int horas) {
        try {
            double valorHora;
            switch (tipoDeVehiculo) {
                case 'C':
                    valorHora = 5000;
                    break;
                case 'M':
                    valorHora = 3000;
                    break;
                case 'B':
                    valorHora = 1000;
                    break;
        
     }

            double valorTotal;
            if (horas <= 3) {
                valorTotal = valorHora * horas;
            } else {
                valorTotal = (valorHora * 3) + ((horas - 3) * (valorHora + 2000));
            }

            return valorTotal;
        } catch (Exception e) {

            return -1;

        }
    }

    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularDescuento que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el valor total de las horas
            - Un entero representando la si es estudiante o no
            - Un entero represenatando la cantidad de horas
        * Retorna:
            - Un entero representando el valor del descuento
        * Controlar errores retornando -1
    */
    //------------------------------------------------------------------
    
    public static double calcularDescuento(double valorTotal, int horas, boolean esEstudiante){
        try {
            if (horas > 4) {
                valorTotal *= 0.3;  
            }
            if (esEstudiante) {
                valorTotal *= 0.05;  
            }
            return valorTotal;
            
        } catch (Exception e) {
        
        return -1;


        }
    }
}

    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularFactura que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el valor total de las horas
            - Un entero representando el valor del descuento
        * Retorna:
            - Un entero representando el valor del total de la factura incluyendo el iva
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------
