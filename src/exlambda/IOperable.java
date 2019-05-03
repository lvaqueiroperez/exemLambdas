
package exlambda;

@FunctionalInterface
public interface IOperable {
    
    public abstract double operacion(double n1,double n2);
    
    default public void amosar(){
        System.out.println("****mensaxe ***");
    }
    
}
