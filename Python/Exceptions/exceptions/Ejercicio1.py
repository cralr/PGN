'''
Realiza un programa que pida 6 números por teclado y nos diga cuál es el
máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
entero) el programa debe indicarlo y debe pedir de nuevo el número
 
@author: d18cralr
'''

print("Introduzca 6 números para saber el máximo de ellos.")

listaNumeros = []

for i in range(6):
    while True:
        try:
            listaNumeros.append(int(input("Introduzca el numero "+ str(i+1)+"\n")))
            break  
        except:
            print("No ha introducido un número entero, pruebe otra vez.")

print("El número maximo introducido es el " + str(max(listaNumeros)))