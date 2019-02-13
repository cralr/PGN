'''
Created on 17 ene. 2019

 * Contruir un objeto Fraccion pas�ndole al constructor el numerador y el denominador. 
 * Obtener la fracciónn. 
 * Obtener y modificar numerador y denominador. No se puede dividir por cero. 
 * Obtener resultado de la fracción(número real). 
 * Multiplicar la fracción por un número. 
 * Multiplicar, sumar y restar fracciones. 
 * Simplificar la fracción.

@author: Rafael Miguel Cruz Álvarez
'''

class Fraccion:
    
    def __init__(self,numerador,denominador):
        self.__numerador=numerador
        self.__denominador=denominador
    
    def getNumerador(self):
        return self.__numerador
    
    def setNumerador(self,numerador):
        self.__numerador=numerador
    
    def getDenominador(self):
        return self.__denominador
    
    def setDenominador(self,denominador):
        self.__denominador=denominador
        if (denominador==0):
            print("El denominador no puede ser 0, se le asigna 1.")
            self.__denominador=1
    
    def obtenerReal(self):
        return self.__numerador/self.__denominador
    
    def multiplicarPorEntero(self,num):
        self.__numerador*=num
        self.__denominador*=1
        resultado= print(self.__numerador,"/",self.__denominador)
        return resultado
    
    def multiplicarFracciones(self,numerador,denominador):
        self.__numerador*=numerador
        self.__denominador*=denominador
        resultado = print(self.__numerador,"/",self.__denominador) 
        return resultado
    
    def sumarFracciones(self,numerador,denominador):
        auxNum= self.__numerador*denominador;
        auxDen=self.__denominador*numerador;
        denominadorFinal= self.__denominador*denominador;
        sumaNumeradores = auxNum + auxDen;
        resultado = print(sumaNumeradores,"/",denominadorFinal) 
        return resultado
    
    def restarFracciones(self,numerador,denominador):
        auxNum= self.__numerador*denominador;
        auxDen=self.__denominador*numerador;
        denominadorFinal= self.__denominador*denominador;
        restaNumeradores = auxNum - auxDen;
        resultado = print(restaNumeradores,"/",denominadorFinal) 
        return resultado
    
    def hallarMcd(self):
        dividendo= self.__numerador
        divisor=self.__denominador
        while(dividendo%divisor!=0) :
            resto = dividendo%divisor
            dividendo=divisor
            divisor=resto
        return divisor
    
    def simplificarFraccion(self):
        mcd=self.hallarMcd()
        self.__numerador/=mcd
        self.__denominador/=mcd
        return f"{self.__numerador}/{self.__denominador}"
    
    def __str__(self):
        return f"{self.__numerador}/{self.__denominador}"
    
if __name__=="__main__":    
    fraccion1 = Fraccion(1,2)
    fraccion2 = Fraccion(3,2)
    fraccion3 = Fraccion(4,5)
    fraccion4 = Fraccion(3,6)
    print(fraccion1)
    print(fraccion1.obtenerReal())
    fraccion1.multiplicarPorEntero(5)
    fraccion2.sumarFracciones(2,2)
    fraccion3.restarFracciones(3,2)
    fraccion1.multiplicarFracciones(1, 2)
    print(fraccion4.simplificarFraccion())