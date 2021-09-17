
/** Planteamiento de la situación Reto semana 1
La empresa en la que trabajas  ha regalado a sus empleados una tarjeta bono con $500.000 y como haces parte del equipo de sistemas de la empresa 
te piden realizar la implementación de un método/función para calcular un valor porcentual que se entregará de forma adicional a los empleados 
según su antigüedad en la empresa.  

 * @fadurans 
 * @2julio
 */
public class DemoRetos
{
        /**
    Código propuesto por el reto 
     */
    /*
    public static void main(String [] args)
    {
        int anios=5;
        double porcentaje;
        float bono=500000; 
        
        System.out.println(DemoRetos.calcularPorcentajeBono(anios,bono));
    }
    */
    
    public static double calcularPorcentajeBono(int anios,float bono) 
    {
         
        double porcentaje=0;    
                              
        if (anios<3)
        {
            porcentaje=0.05;
        }
        else if ((3<=anios)&& (anios<5))
        {
            porcentaje=0.10;
        }
        else if ((5<=anios)&&(anios<10))
        {
            porcentaje=0.20;
        }
        else 
        {
            porcentaje=0.30;
        }
        return porcentaje*bono;
        

    }
}
