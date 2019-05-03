
package exlambda;

public class Metodos {
    
    public void crearLambda(){
        // utilizando unha clase interna
        IOperable op = new IOperable(){
            @Override
            public double operacion(double n1, double n2) {
              return (n1+n2);
            }            
        };
        // utilizando unha expresión lambda
       IOperable op2= (double n1,double n2)->{return (n1+n2);}; 
        
        op2.amosar();
        System.out.println("operacion -> "+ op2.operacion(5,10));
        IOperable op3= ( n1,n2)->{return (n1*n2);};
        System.out.println("multiplicacion = "+ op3.operacion(3,-4));
    }
    
    
}
