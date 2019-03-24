'''
Crea una lista con un tamaño aleatorio entre 10 y 20 que te calcules la media, la suma, el maximo y minimo de los elementos
aleatorios del 0 al 100.

@author: d18cralr
'''

from random import randint

lista = []

for x in range(randint(10, 20)):
    lista.append(randint(0, 100))

print(lista)
print ("Suma "+str(sum(lista)))
print ("Maximo "+str(max(lista)))
print ("Minimo "+str(min(lista)))
print ("Media "+str(sum(lista)//len(lista)))
