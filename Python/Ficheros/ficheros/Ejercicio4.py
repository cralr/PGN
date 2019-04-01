'''
Realiza un programa que sea capaz de ordenar alfabéticamente las palabras contenidas en un escritura de texto. 
El nombre del escritura que contiene las palabras se debe pasar como argumento en la línea de comandos.
El nombre del escritura resultado debe ser el mismo que el original añadiendo la coletilla sort,
por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una línea.

@author: Rafael Miguel Cruz Álvarez
'''

fichero = input("Introduzca el nombre del fichero.")

lecturaFichero = open(fichero+".txt","r")
escrituraFichero = open(fichero+"_sort.txt", "w")

lista = []

for x in lecturaFichero:
    lista.append(x)
    
lista.sort()

for x in lista:
    escrituraFichero.writelines(str(x))
    
lecturaFichero.close()
escrituraFichero.close()
