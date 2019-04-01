'''
Programa para probar ejercicio gato con excepciones.
@author: Rafael Miguel Cruz Álvares
'''

from exceptions.gato import Gato

garfield = Gato("macho")
tom = Gato("macho")
lisa = Gato("hembra")

try:
    garfield.apareaCon(lisa)
except:
    print("Los gatos no pueden aparearse entre machos")