// Clase SelectionSort
public class SelectionSort {

    public static void main(String[] args) {
        String[] strings = {"toyota", "mazda", "jeep", "porsche", "volkswagen"};
        System.out.println("Lista original:");
        Counting.show(strings);

        Counting.sort(strings);

        System.out.println("Lista ordenada:");
        Counting.show(strings);

        // Verificar si el array está ordenado
        System.out.println(" La lista esta ordenada? " + Counting.isSorted(strings));
    }
}

    




