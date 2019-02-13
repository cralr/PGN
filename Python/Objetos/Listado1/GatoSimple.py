'''
Created on 11 ene. 2019

1. Implementa en Python las clases GatoSimple, Cubo y Cuadrado vistas en el libro "Aprende Java con Ejercicios" y 
sus respectivos programas de prueba.

@author: Rafael Miguel Cruz Álvarez
'''


class GatoSimple:
    
    '''
    Constructor de la clase GatoSimple
    '''
    
    def __init__(self,s):
        self.__sexo=s
        self.color=""
        self.raza=""
        self.edad=0
        self.peso=0
    
    '''
    Método getter
    @return sexo
    '''
    def getSexo(self):
        return self.__sexo
    
    '''
    Método que muestra por pantalla el mensaje maulla
    '''
    def maulla(self):
        print("Miau")
    
    '''
    Método que muestra por pantalla el mensaje mrrr
    '''
    def ronronea(self):
        print("mrrrrr")
    
    '''
    Método que muestra por pantalla si la cómida pasada por parametro gusta o no.
    @param comida String con el nombre de una comida
    '''
    def come(self,comida):
        if (comida == "pescado"):
            print("Hmm, gracias.")
        else:
            print("Lo siento, solo como pescado.")
    
    '''
    Método que muestra por pantalla si los gatos se pelean teniendo en cuenta el sexo
    @param contrincante String con el nombre del gato con el que se peleará
    '''
    def peleaCon(self, contrincante) :
        if (self.__sexo == "hembra") :
            print ("no me gusta pelear");
        else :
            if (contrincante.getSexo()==("hembra")) :
                print ("no peleo contra gatitas")
            else :
                print("ven aquí que te vas a enterar")
      
if __name__=="__main__": #Esto se usa para importar la clase en otro fichero, para importar from (Clase) import (Clase)
     
    garfield=GatoSimple("macho")
    print("Hola Gatito.")
    garfield.maulla()
    print("Toma tarta.")
    garfield.come("tarta") 
    print("Toma pescado.")
    garfield.come("pescado")
    
    tom=GatoSimple("macho")
    print("Tom, toma sopita de verduras.")
    tom.come("sopa de verduras")
    
    lisa=GatoSimple("hembra")
    
    print("Gatitos, a ver como maulláis.")
    garfield.maulla()
    tom.maulla()
    lisa.maulla() 
    
    print("Pelea!")
    tom.peleaCon(lisa)
    tom.peleaCon(garfield)   
        