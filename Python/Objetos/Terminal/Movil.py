'''
Created on 7 feb. 2019

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
 
class Movil(Terminal):
    
    tarifa=""
    totalTarifa=0
 
    def __init__(self,numero,tarifa):
        super().__init__(numero)
        self.__tarifa=tarifa
        self.__totalTarifa=0
    
    def llamar(self, t, tiempo):
        Terminal.llamar(self, t, tiempo)
        minutos=tiempo/60
        
        if (self.__tarifa=="rata"):
            self.__totalTarifa += minutos*0.06
        
        elif self.__tarifa=="mono":
            self.__totalTarifa+=minutos*0.12
            
        elif self.__tarifa=="bisonte":
            self.__totalTarifa+=minutos*0.30
            
        
    def __str__(self):
        return str(super().__str__())+f"-tarificados {self.__totalTarifa} euros."
        
        
      
if __name__=="__main__":
    
    m1=Movil("111 111 111","rata")
    m2=Movil("222 222 222","mono")
    m3=Movil("333 333 333","bisonte")
    
    print(m1)
    print(m2)
    print("Tiempo tras llamada: ")
    m1.llamar(m2,320)
    m1.llamar(m3,200)
    m2.llamar(m3, 550)
    print(m1)
    print(m2)
    print(m3)
   
    