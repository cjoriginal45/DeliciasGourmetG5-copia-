from Sorted_Table_Map import SortedTableMap

print(f"{'':*^60}")
print(f"{' SortedTableMap ':*^60}")
print(f"{'':*^60}")

map = SortedTableMap()

lorem_ipsum = """lorem ipsum dolor sit amet, consectetur adipiscing elit. duis nec ligula dapibus, malesuada nibh in, porta massa. donec eget sodales tellus, non venenatis nisi. praesent at lacinia ligula. praesent tristique, arcu nec suscipit facilisis, justo tellus laoreet ex, sit amet pellentesque sem nisi nec ex. phasellus congue dapibus erat, vitae vulputate nulla accumsan eget. praesent mi nisi, pellentesque ut ante sed, rutrum malesuada mauris. aenean sed lacinia orci. sed et diam quis libero pulvinar facilisis. etiam varius eu velit id mattis. sed consequat ex erat. quisque tincidunt malesuada mauris sed faucibus."""

for texto in lorem_ipsum.split():
    palabra = ''.join(c for c in texto if c.isalpha())
    if palabra:
        map[palabra] = 1 + map.get(palabra, 0)
        
print(map)
print("\n")

max_palabra = ''
max_cantidad = 0
for (p, c) in map.items():
    if c > max_cantidad:
        max_palabra = p
        max_cantidad = c
        
print('La palabra más frecuente es:', max_palabra)
print('El número de ocurrencias es:', max_cantidad)
print("\n")

#--------------------METODOS-----------------------

print("Longitud".center(26, "*"))
print(len(map),"\n")

print("Valor de la clave".center(26, "*"))
print(map.__getitem__("sed"),"\n")


print("Nueva clave-valor asignada".center(50, "*")) 
map.__setitem__("accumsan","hola") # Asigno valor en la primera clave
print(map,"\n")

print("Eliminacion de la clave".center(50, "*"))
map.__delitem__("vulputate") # Borro el ultimo item
print("Mapeo luego del pop".center(26, "*"))
print(map,"\n")


print("Claves del map".center(26, "*"))

var = map.__iter__()
for i in var:
    print(i)

print("\n")

print("Items del map".center(26, "*"))

var2 = map.iter_items()
for i in var2:
    print(i)