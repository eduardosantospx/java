import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {

       //arraylist
       ArrayList<String> lista = new ArrayList<>();//uma classe que representa uma estrutura de dados
       lista.add("eduardo");
       lista.add("maria");
       lista.add("roberto");
       lista.add("henrique");

       System.out.println(lista);
       System.out.println(lista.get(0));

        lista.remove(0);//voce pode remover por indice ou por o proprio nome ex "eduardo"

        System.out.println(lista);
    }
}
