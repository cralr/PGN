'''
Created on 6 feb. 2019

@author: d18cralr
'''

class Terminal:
    
    
    '''
    Constructor
    '''
    def __init__(self,numero):
        self.__numeroTelefono=numero
        self.__tiempoLlamada=0
    
    @property #Se puede usar como un "getter"
    def numeroTelefono(self):
        return self.__numeroTelefono
    
    @numeroTelefono.setter #setter de lado
    def numeroTelefono(self):
        self.__numeroTelefono
        
    @property #Se puede usar como un "getter"
    def tiempoLlamada(self):
        return self.__tiempoLlamada
    
    @tiempoLlamada.setter #setter de lado
    def tiempoLlamada(self,tiempo):
        self.__tiempoLlamada=tiempo
    
    '''
    Método llamar
    @param t numero de teléfono
    @param tiempo tiempo de la conversación
    '''    
    def llamar(self,t,tiempo):
        self.__tiempoLlamada += tiempo #Acumular el tiempo total que ha hablado con un terminal
        t.tiempoLlamada+=tiempo #Acumular el tiempo que se le pasa a un terminal como parametro
    
    '''
    Método toString 
    '''
    def __str__(self):
        return f"nº:{self.__numeroTelefono}-{self.__tiempoLlamada} s."
 
 
 
      
if __name__=="__main__":
    
    t1=Terminal("111 111 111")
    t2=Terminal("222 222 222")
    t3=Terminal("333 333 333")
    
    print(t1)
    print(t2,"\n")
    print("Tiempo tras llamada: ")
    t1.llamar(t2,20)
    t1.llamar(t3,50)
    print(t1)
    print(t2)
    print(t3)
   
    