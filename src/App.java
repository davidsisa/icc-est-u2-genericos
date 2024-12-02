import models.Personas;
import models.genericos.Caja;
import models.genericos.Par;
public class App {
    public static void main(String[] args) throws Exception {
        //EJEMPLOS
        Caja<String> cajaString = new Caja<>();
        Caja<Integer> cajaInteger = new Caja<>();
        Caja<Personas> cajaPersonas = new Caja<>();
        Par<Integer,String> par1 = new Par<>();
        Par<String,Integer> par2 = new Par<>();
        par1.setClave(10);
        par1.setValor("valor");
        par2.setClave("valor2");
        par2.setValor(20);
        Personas persona = new Personas();
        persona.setNombre("David");

        cajaString.setObjeto("Guardado un String ");
        cajaInteger.setObjeto(10);
        cajaPersonas.setObjeto(persona);
        System.out.println(cajaString.getObjeto());
        System.out.println(cajaInteger.getObjeto());
        System.out.println(cajaPersonas.getObjeto());
        System.out.println(cajaPersonas.getObjeto().getNombre());
        System.out.println(par1.getClave());
        System.out.println(par1.getValor());
        System.out.println(par2.getClave());
        System.out.println(par2.getValor());
        //PRACTICA--------------------------
        Personas[] personas = new Personas[10];
        personas[0] = new Personas("David",10); 
        personas[1] = new Personas("Summer",80); 
        personas[2] = new Personas("Chris",1); 
        personas[3] = new Personas("Maria",9); 
        personas[4] = new Personas("Uvi",22); 
        personas[5] = new Personas("Daniel",11); 
        personas[6] = new Personas("Carlos",2); 
        personas[7] = new Personas("Goliath",45); 
        personas[8] = new Personas("Jonnathan",32); 
        personas[9] = new Personas("Carla",21); 
        
        for (Personas vari : personas) {
            vari.mostrar();
        }
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getEdad()>= 18) {
                Par<String,Integer> nombreYEdad = new Par<>();
            } else {
                Par<Integer,String> edadYNombre = new Par<>();
            }
        }
        



    }
}
