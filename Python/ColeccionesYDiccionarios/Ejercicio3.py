'''
Escribe un programa que ordene 10 numeros enteros introducidos por teclado y almacenados en un objeto de la clase ArrayList

@author: d18cralr
'''

lista = []
for x in range(10):
    lista.append(int(input("Introduzca un numero en la lista: ")))

print("Lista sin ordenar: "+str(lista))
lista.sort()
print("Lista ordenada: "+str( lista))