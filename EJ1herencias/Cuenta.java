
package EJ1herencias;


public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular, float cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad=0;
        
       
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

  

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
    
    
    public void ingresar(double ingreso){
      if(ingreso>0){
          
      }
        this.cantidad+=ingreso;
        
    }
    public void retirar(double retiro) {
        if (retiro > this.cantidad) {
            this.cantidad = 0;
        } else {
            this.cantidad -= retiro;

        }
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
    
}
