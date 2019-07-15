package clases;

public class test {
    public static void main(String[] ard){
        ColeccionCanalRadio c = new ColeccionCanalRadio();
//        clases.IFIterator iterador = c.getIterator();
        IFIterator iterador = c.createIteratorTipo("sudo");
        while(iterador.hasNextItem()){
            System.out.println(iterador.nextItem());
        }

    }
}
