'''
Created on 16 ene. 2019

1. Implementa en Python las clases GatoSimple, Cubo y Cuadrado vistas en el libro "Aprende Java con Ejercicios" y 
sus respectivos programas de prueba.

@author: Rafael Miguel Cruz Álvarez

'''

class Cuadrado:
    
    def __init__(self,l):#l = lado
        self.__lado=l
    
    @property #Se puede usar como un "getter"
    def lado(self):
        return self.__lado
    
    @lado.setter #setter de lado
    def lado(self, l):
        self.__lado=l
        
    def __str__(self):
        resultado =""
        
        for i in range (0,self.__lado,+1):
            resultado +="[]"
        resultado+="\n"
        
        for i in range (1,(self.__lado-1),+1):
            resultado += "[]"
            for espacios in range (1,(self.__lado-1),+1):
                resultado +="  "
            resultado +="[]\n"
        
        for i in range (0,self.__lado,+1):
            resultado +="[]"
        resultado +="\n"
        return resultado

if __name__=="__main__":
    miCuadradito = Cuadrado(5)
    miCuadradito2 = Cuadrado(10)
    print(miCuadradito)
    print(miCuadradito2)
    miCuadradito2.lado=12
    print("Mi cuadrado 2 con lado cambiado")
    print(miCuadradito2)
