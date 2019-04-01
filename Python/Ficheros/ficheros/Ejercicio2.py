'''
Realiza un programa que lea el escritura creado en el ejercicio anterior y que muestre los números por pantalla.

@author: Rafael Miguel Cruz Álvarez
'''

#El fichero primos.dat se abre en modo lectura
fichero = open("primos.dat","r")

#Se muestra por pantalla lo que hay en primos.dat
print (fichero.read())

#Se cierra el fichero
fichero.close()
