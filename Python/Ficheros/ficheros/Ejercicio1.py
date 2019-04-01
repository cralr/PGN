'''
Escribe un programa que guarde en un escritura con
nombre primos.dat los números primos que hay entre 1 y 500.

@author: Rafael Miguel Cruz Álvarez
'''

#Se crea el archivo y se abre en modo escritura
fichero = open("primos.dat","w")

def esPrimo(num):
    if num <= 1:
        return False
    elif num == 2:
        return True
    else:
        for i in range(2, num):
            if num % i == 0:
                return False
        return True

for x in range(501):
    if(esPrimo(x) == True):
        fichero.writelines(str(x)+" ")

#Se cierra el fichero
fichero.close()