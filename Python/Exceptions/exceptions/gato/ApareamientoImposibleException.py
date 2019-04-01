'''
Excepción que salta cuando se da un apareamientos no posible
@author: Rafael Miguel Cruz Álvarez
'''

class ApareamientoImposibleException(Exception):
    def __init__(self): 
        Exception.__init__(self)
print("No pueden aparearse dos gatos de mismo sexo")