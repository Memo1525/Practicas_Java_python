# utilizando encadenamiento hacia atras
# el objeto no debe de preguntar lo que ya pregunto con anterioridad
# decidir el tipo de objeto con el que se empezara a agregar los datos en este caso un diccionario de listas
objetos = {
    '1': ['A', 'B', 'C'],
    '2': ['A', 'M', 'Y'],
    '3': ['A', 'B', 'D'],
    '4': ['D', 'X', 'C']
}

tiene = []
no_tiene = []


def lista_de_datos(diccionario):  # funcion para crear una lista con los datos
    l_objetos = []
    for i in range(1, len(objetos) + 1):
        temporal = objetos[str(i)]
        l_objetos.extend(temporal)
        return list(set(l_objetos))


'''
for i,j in enumerate(range(1,5)):
    print(i,j)

for contador,elemento in enumerate(objetos[str
        if input(f"Tiene {objetos.get([str(i)][i])}: ") == 'si':
                tiene.append(objetos[str(i)][i])
print(tiene)

'''

