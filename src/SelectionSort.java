public class SelectionSort {

    // intercambia dos elementos del arraylist
    private static <T extends Comparable<T>> void exch(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // verifica si el arraylist esta ordenado
    private static <T extends Comparable<T>> boolean isSorted(T[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(array[i - 1]) < 0) {
                return false;
            }
        }
        return true;
    }

    //ordena el arraylist
    public static <T extends Comparable<T>> void sort(T[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            //encuentra el indice del minimo elemento del arraylist
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            //intercambia el minimo elemento con el primer elemento del arraylist desordenado
            exch(array, i, minIndex);
        }
    }

    //limpia el arraylist
    private static <T> void show(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        
        String[] strings = {" toyota ", " mazda ", " jeep ", " porsche ", " volkswagen "};
        System.out.println(" lista original: ");
        show(strings);

        sort(strings);

        System.out.println(" lista ordenado: ");
        show(strings);

        // Verificar si el array está ordenado
        System.out.println(" la lista esta ordenado? " + isSorted(strings));
    }
}
