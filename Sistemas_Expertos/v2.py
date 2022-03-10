
objetos = {
    '1': ['A', 'B', 'C'],
    '2': ['A', 'M', 'Y'],
    '3': ['A', 'B', 'D'],
    '4': ['D', 'X', 'C']
}
tiene = []
def sistema_experto_ver2(objetos,tiene): #diccionario , lista vacia
    for i in range(len(objetos)):
        for j in range(len(objetos[str(i+1)])):
            if objetos[str(i+1)][j] not in tiene :
                if input(f'Tiene {objetos[str(i+1)][j]} : ') =='si':
                    tiene.append(objetos[str(i+1)][j])
        if tiene == objetos[str(i+1)]:
            return ( f'tu objeto es el objeto {i+1}')
print(sistema_experto_ver2(objetos,tiene))
