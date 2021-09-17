
//** Planteamiento de la situación Reto semana 1
/*
 La empresa en la que trabajas  ha regalado a sus empleados una tarjeta bono con $500.000 y como haces parte del equipo de sistemas de la empresa 
te piden realizar la implementación de un método/función para calcular un valor porcentual que se entregará de forma adicional a los empleados 
según su antigüedad en la empresa.  

  @fadurans 
  @2julio
  
 codigo principal, separado del otro método
 */
/**
 * Organización de los datos correspondientes a los diferentes retos
 * Reto de la semana uno en un solo documento
 */
public class DemoRetoUnico
{
    public static void main(String [] args)
    {
        int bono=500000;
        int anio=23;
        System.out.println(DemoRetos.calcularPorcentajeBono(anio,bono));
    }
   
    public static double calcularPorcentajeBono(int anios, double bono)
    {
        double porcentaje=0;
        
        //tu codigo aca
        if (anios<3)
        {
            porcentaje=0.05;
        }
        else if ((3<=anios) && (anios<5))
        {
            porcentaje=0.10;
        }
        else if ((5<=anios) && (anios<10))
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
