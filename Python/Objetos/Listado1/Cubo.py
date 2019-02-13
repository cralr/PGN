'''
Created on 15 ene. 2019

1. Implementa en Python las clases GatoSimple, Cubo y Cuadrado vistas en el libro "Aprende Java con Ejercicios" y 
sus respectivos programas de prueba.

@author: Rafael Miguel Cruz Álvarez

'''
class Cubo:
    
    '''
    Constructor
    '''
    def __init__(self,c): #C = capacidad
        self.__capacidad=c
        self.__contenido=0
    
    '''  
    Método getter que devuelve el valor de la capacidad
    @return capacidad
    '''
    def getCapacidad(self):
        return self.__capacidad
    
    '''
    Método setter del contenido
    @param litros
    '''
    def setContenido(self,litros):
        self.__contenido =litros
    
    '''  
    Método getter que devuelve el valor del contenido
    @return contenido
    '''
    def getContenido(self):
        return self.__contenido
      
    '''
    Método vacia al que contenido le asigna 0
    '''  
    def vacia(self):
        self.__contenido=0
    
    '''
    Método llena al que contenido le asigna el valor de capacidad
    '''
    def llena(self):
        self.__contenido=self.__capacidad
    
    '''
    Método para pintar el cubo
    '''
    def pinta(self):
        for nivel in range (self.__capacidad,0,-1):
            if(self.__contenido>=nivel):
                print("#~~~#")
            else:
                print("#   #")
        print("#####")
    
    '''
    Método para volcar el contenido de un cubo en otro
    '''
    def vuelcaEn(self,destino):
        libres=destino.getCapacidad()- destino.getContenido()
        if(libres>0):
            if(self.__contenido<=libres):
                destino.setContenido(destino.getContenido()+self.__contenido)
                self.vacia();
            else:
                self.__contenido -=libres
                destino.llena()

if __name__=="__main__":
    cubito = Cubo(2)
    cubote = Cubo(7)
    
    print("Cubito: ")
    cubito.pinta()
    print("Cubote: ")
    cubote.pinta()
    print("Lleno el cubito: ")
    cubito.llena()
    cubito.pinta()
    print("El cubote sigue vacío: ")
    cubote.pinta()
    print("Ahora vuelco lo que tiene el cubito en el cubote.");
    cubito.vuelcaEn(cubote);
    print("Cubito: ");
    cubito.pinta();
    print("Cubote: ");
    cubote.pinta();
    print("Ahora vuelco lo que tiene el cubote en el cubito.");
    cubote.vuelcaEn(cubito);
    print("Cubito: ");
    cubito.pinta();
    print("Cubote: ");
    cubote.pinta();
