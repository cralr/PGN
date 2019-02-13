'''
Created on 5 feb. 2019

@author: d18cralr
'''

class Vehiculo:
    
    '''
    atributos de clase
    '''
    vehiculosCreados=0
    kilometrosTotales=0
    
    def getKilometrosTotal(self):
        return Vehiculo.kilometrosTotales
    
    '''
    Constructor de la clase vehiculo.
    '''
    def __init__(self):
        self.__kilometrosRecorridos=0
    
        '''
    Método getter
    @return kilometros recorridos
    '''
    def getKilometrosRecorridos(self):
        return self.__kilometrosRecorridos
    
    def recorrer(self,kilometros):
        self.__kilometrosRecorridos+=kilometros
        Vehiculo.kilometrosTotales+=kilometros
    
class Coche(Vehiculo):
    
    def quemarRueda(self):
        print("brrrr")  

class Bicicleta(Vehiculo):
    
    def hacerCaballito(self):
        print("Mira como levanto la bicicleta")


def mostrarMenu():
    print("Menú de opciones")
    print("----------------")
    print("1. Introducir KM Bicicleta")
    print("2. Hacer Caballito.")
    print("3. Introducir KM Coche.")
    print("4. Quemar Rueda")
    print("5. Km total con la Bicicleta")
    print("6. Km total con el Coche.")
    print("7. Km total con los Vehiculos.")
    print("8. Terminar.")

    
if __name__=="__main__":
    
    skoda=Coche()
    bici1=Bicicleta()
    
    while True:
        mostrarMenu()
        opc=input("Indica la opción: ")
    
        if opc=="1":
            km=int(input("Introduce los KM recorridos con la bicicleta: \n"))
            bici1.recorrer(km)
        elif opc=="2": 
            bici1.hacerCaballito()
        elif opc=="3":
            km=int(input("Introduce los KM recorridos con su coche: \n"))
            skoda.recorrer(km)
        elif opc=="4": 
            skoda.quemarRueda()
        elif opc=="5":
            print("Ha recorrido ",bici1.getKilometrosRecorridos()," kms con su bicicleta.")
        elif opc=="6":
            print("Ha recorrido ",skoda.getKilometrosRecorridos()," kms con su coche.")    
        elif opc=="7":
            print("Ha recorrido ",Vehiculo.getKilometrosTotal(km)," kms en total.") 
        elif opc=="8":
            print("Saliendo")
            break
            
    