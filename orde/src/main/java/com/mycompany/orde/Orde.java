
public static void main(String[] args) {
    int[] numeros = new int[100];
    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = (int) (Math.random() * 100 + 1);
    }
    System.out.println("Arreglo desordenado");
    System.out.println(Arrays.toString(numeros));
    quicksort(numeros, 0, numeros.length - 1);
    System.out.println("Arreglo ordenado");
    System.out.println(Arrays.toString(numeros));
}

private static void quicksort(int[] numeros, int izquierda, int derecha) {
    if (izquierda < derecha) {
        int indiceParticion = particion(numeros, izquierda, derecha);
        quicksort(numeros, izquierda, indiceParticion);
        quicksort(numeros, indiceParticion + 1, derecha);
    }
}

private static int particion(int[] numeros, int izquierda, int derecha) {
    int pivote = numeros[izquierda];
    while (true) {
        while (numeros[izquierda] < pivote) {
            izquierda++;
        }
        while (numeros[derecha] > pivote) {
            derecha--;
        }
        if (izquierda >= derecha) {
            return derecha;
        } else {
            int temporal = numeros[izquierda];
            numeros[izquierda] = numeros[derecha];
            numeros[derecha] = temporal;
            izquierda++;
            derecha--;
        }
    }
}
