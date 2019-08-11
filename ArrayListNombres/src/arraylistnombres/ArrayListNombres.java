package arraylistnombres;

import java.util.ArrayList;
import java.util.List;

public class ArrayListNombres {

    public static void main(String[] args) {
        List<String> listado = new ArrayList<String>();
        listado.add("Alex");
        listado.add("Julieta");
        listado.add("Omar");
        listado.add("Liliana");
        listado.add("Romina");
        listado.add("Paula");
        listado.add("Mauricio");
        listado.add("José");
        listado.add("Gianfranco");
        listado.add("Daniel");
        
    System.out.println("Cantidad: " + listado.size());
        
        for (String nombres : listado) {
            System.out.println(nombres);
        }
        
    }
    
}
