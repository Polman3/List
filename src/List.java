import java.util.ArrayList;


public class List {
    public static void main(String[] args) {
        //tworzymy listę
        java.util.List<String> lista = new ArrayList<String>();
        //dodajemy elementy typu Object czyli dowolne
        lista.add("Arek");
        lista.add("Adam");
        lista.add("Andrzej");
        lista.add("Agata");
        lista.add("Agnieszka");

        //sprawdzamy rozmiar listy
        System.out.println("Rozmiar listy to: " + lista.size());

        //usuwamy obiekt Arek i sprawdzamy rozmiar listy
        lista.remove("Arek");
        System.out.println("Rozmiar listy to: " + lista.size());

        //usuwamy obiekt o indeksie 1
        lista.remove(1);
        System.out.println("Rozmiar listy to: " + lista.size());

        //wyswietlamy pierwszy element listy
        String imie = (String)lista.get(0);
        System.out.println("Pierwszy element listy to " + imie);

        //usuwamy ostatni element listy
        //lista.remove(lista.size()-1);

        for(int i=0; i<lista.size(); i++){
            imie = lista.get(i);
            System.out.println(i+1 + ". " + imie);
        }
    }
}
