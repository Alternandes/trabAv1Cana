package br.com;

public class InsertionSort {

    int assistant;
    boolean control;

    void insertionSort(int vetor[]) {

        for (int right = 1; right < vetor.length; right++) {

            assistant = vetor[right];

            int left = right - 1;



            while ((left >= 0 && assistant < vetor[left])) {
                //trocar se for verdadeira do direito para esquerda
                vetor[left + 1] = vetor[left];
                left--;
            }

            vetor[left + 1] = assistant;
        }

        for (int right = 0; right < vetor.length; right++) {
            System.out.println(vetor[right]);
        }
    }

    public static void main(String[] args) {

        InsertionSort um = new InsertionSort();
        int vetor[] = {3, 5, 4, 6, 1, 2};
        um.insertionSort(vetor);
        int vetor2[] = {9, 11, 8, 12, 7, 10};
        um.insertionSort(vetor2);
    }
}