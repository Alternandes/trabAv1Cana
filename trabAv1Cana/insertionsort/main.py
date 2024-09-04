def insertion_sort(arr):
    # Percorre todos os elementos da lista a partir do segundo (índice 1)
    for i in range(1, len(arr)): #n 
        # Armazena o valor do elemento atual
        key = arr[i]
        
        # Move os elementos da lista que são maiores que a 'key' uma posição para frente
        j = i - 1
        while j >= 0 and arr[j] > key: #n 
            arr[j + 1] = arr[j]
            j -= 1
        
        # Coloca a 'key' na posição correta
        arr[j + 1] = key

    return arr

# Exemplo de uso
lista = [12, 11, 13, 5, 6]
print("Lista original:", lista)
lista_ordenada = insertion_sort(lista)
print("Lista ordenada:", lista_ordenada)
