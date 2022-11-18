from Sorted_Table_Map_Abstract import SortedTableMapAbstract
from typing import Any, Generator


class SortedTableMap(SortedTableMapAbstract):

    def __len__(self) -> int:
        return len(self._table)

    def __repr__(self) -> str:
        return self.__str__()

    def __str__(self) -> str:
        res = ", ".join([str(x) for x in self.iter_items()])
        return f"SortedTableMap({res})"

    def __getitem__(self, k: Any) -> Any:
        for item in self._table:
            if k == item._key:                  #Si k pasado por parametro es igual a la clave del item
                return item._value              #Retorna el valor del item encontrado
        raise KeyError('Key Error: ' + repr(k))


    def __setitem__(self, k: Any, v: Any) -> None:
        j = self._find_index(k, 0, len(self._table) - 1)
        if j < len(self._table) and self._table[j]._key == k:
            self._table[j]._value = v                           # Reasigna el valor
        else:
            self._table.insert(j, self._Item(k, v))             # Agrega el item

    def __delitem__(self, k: Any) -> None:
        j = self._find_index(k, 0, len(self._table) - 1)
        if j == len(self._table) or self._table[j]._key != k:          #Busca si la clave no se encuentra en el mapeo
            raise KeyError('Key Error: ' + repr(k))
        self._table.pop(j)                                      # Borra el item

    def __iter__(self) -> Generator[Any, None, None]:
        for item in self._table:                            #Recorre la lista
            yield item._key                                 #Devuelve la clave del item

    def iter_items(self) -> Generator[Any, None, None]:
        for item in self._table:
            yield item


    #----------------------------------------------
    #             Metodo privado                    
    #------------------------------------------------

    def _find_index(self, k, bajo, alto):
        """Retorna el índice del elemento más a la izquierda con 
        clave mayor o igual que k.
        """
        if alto < bajo:
            return alto + 1 
        else:
            medio = (bajo + alto) // 2
            if k == self._table[medio]._key:
                return medio  
            elif k < self._table[medio]._key:
                return self._find_index(k, bajo, medio - 1) 
            else:
                return self._find_index(k, medio + 1, alto)
