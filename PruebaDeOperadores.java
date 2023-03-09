package pruebadeoperadores;

//Código ejecutado por YORNE SANTOS
//Del grupo SC
public class PruebaDeOperadores {
    int x, y = 2;
    double z = 3.3;
    
    public void operacion() {
        x = 1;
        System.out.println("x + y + z = " + (x + y + z));
        x += y;
        System.out.println(x);
        y++;
        System.out.println(y);
        z--;
        System.out.println(z);
        z *= x;
        System.out.println(z);
        System.out.println("x + y + z = " + (x + y + z));
    }

    public static void main(String[] args) {
       PruebaDeOperadores result = new PruebaDeOperadores();
       result.operacion();
        
    }

}
