'''
Diccionario Español a Ingles.

@author: d18cralr
'''

diccionario={'gato':'cat', 'perro':'dog', 'casa':'house','carta':'card','arbol':'tree',
             'rojo':'red','amarillo':'yellow','verde':'green','mesa':'table','montaña':'mountain','coche':'car'}

respuesta = (input("Introduzca la palabra que desea traducir al ingles: "))

if(respuesta in diccionario):
    print(diccionario.get(respuesta))
else:
    print("La palabra no se encuentra en el diccionario")