package clases;

public class ColeccionCanalRadio  implements  IFColeccion{

    CanalRadio[] lista = new CanalRadio[100];
    Integer numeroItems = 0;

    public ColeccionCanalRadio(){
        this.agregarItem(new CanalRadio("Radio Mágica","Espanol"));
        this.agregarItem(new CanalRadio("WKSC-FM - 103.5 KISS-FM - Chicago.","Ingles"));
        this.agregarItem(new CanalRadio("RPP","Espanol"));
        this.agregarItem(new CanalRadio("radio4","Frances"));
        this.agregarItem(new CanalRadio("Radio Felicidad","Espanol"));
        this.agregarItem(new CanalRadio("BMP-FM - 92.3 AMP Radio - New York.","Ingles"));
        this.agregarItem(new CanalRadio("ICN radio","Italiano"));
        this.agregarItem(new CanalRadio("Radio Italia","Italiano"));
        this.agregarItem(new CanalRadio("Radio popolare","Italiano"));
        this.agregarItem(new CanalRadio("KAMP-FM - AMP 97.1 - Los Angeles","Ingles"));
        this.agregarItem(new CanalRadio("Espace Group.","Frances"));
        this.agregarItem(new CanalRadio("NextRadioTV.","Frances"));

    }

    public void agregarItem(CanalRadio canalRadio){
        lista[numeroItems++] = canalRadio;
    }

    @Override
    public IFIterator getIterator() {
        return new Iterator();
    }

    public IFIterator createIteratorTipo(String tipo){
        return new IteratorTipo(tipo);
    }

    class Iterator implements IFIterator{

        int index = 0;

        @Override
        public Boolean hasNextItem() {
            return index < numeroItems ? true : false;
        }

        @Override
        public CanalRadio nextItem() {
            CanalRadio actual = lista[index++];
            return actual;
        }
    }

    class IteratorTipo implements IFIterator{
        String tipo;
        int index = 0;

        public IteratorTipo(String tipo){
            this.tipo = tipo;
        }

        @Override
        public Boolean hasNextItem() {
            int temp = index;
            while(temp < numeroItems){
                if(lista[temp].getTipo().equals(tipo)) {
                    index = temp;
                    return true;
                }
                temp++;
            }
            return false;
        }

        @Override
        public CanalRadio nextItem() {
            CanalRadio actual = lista[index++];
            return actual;
        }
    }
}
