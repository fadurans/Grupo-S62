
/** Planteamiento de la situación Reto semana 1
La empresa en la que trabajas  ha regalado a sus empleados una tarjeta bono con $500.000 y como haces parte del equipo de sistemas de la empresa 
te piden realizar la implementación de un método/función para calcular un valor porcentual que se entregará de forma adicional a los empleados 
según su antigüedad en la empresa.  

 * @fadurans 
 * @2julio
 * 
 codigo principal, separado del otro método
 */
public class CodeRunner
{
    // instance variables - replace the example below with your own
    public static void main(String [] args)
    {
        int anios=5;
        double porcentaje;
        float bono=500000; 
        
        System.out.println(DemoRetos.calcularPorcentajeBono(anios,bono));
    }
}
