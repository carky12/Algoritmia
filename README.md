# Algoritmia

En este repositorio encontrarás código para algorítmos de búsqueda, ordenación y cosas cuirosas de algorítmia.
Además en ciertos proyectos se analizará el coste algorítmo.

La algorítmia es fundamental para optimizar costes tanto de tiempo de ejecución como en cantidad de memoria. Además es una disciplina
de las ciencias de la computación que me apasiona.

#### Creado por carky12

## Índice

- [Búsqueda Binaria](#búsqueda-binaria).
- [Búsqueda Brackets](#búsqueda-brackets)
- [Búsqueda Texto](#búsqueda-texto)
- [Convertir Números Romanos](#convertir-números-romanos)
- [Dance Game](#dance-game)
- [Recursividad](#recursividad)
- [SonarQube - Complejidad Algorítmica](#sonarqube-complejidad-algorítmica)
- [Proyectos Pendientes](#proyectos-pendientes)

## Búsqueda Binaria

En este proyecto vemos el poder de la optimización en algorímos de búsqueda utilizando la búsqueda binaria de forma iterativa
para comparar con una búsqueda lineal o secuencial. 
Se itera un array y se fuerza que el el valor buscado sea el último elemento del array (esto se puede cambiar en el valor de la variable
correspondiente, o pedir el valor buscado al usuario).
En la búsqueda lineal se necesita recorrer todo el array para encontrar el valor buscado. En la búsqueda binaria se va pivotando el array
desde el punto intermedio y se comprueba en que lado del array cae el valor buscado. Es fundamental para que este algorítmo funcione
que los valores del array estén ordenados.

A nivel de complejidad la búsqueda lineal es proporcional al número de elementos del array, es decir a "N" y la búsqueda binaria es proporcional a
logarítmo de "N".

## Búsqueda Brackets

Este proyecto es un algorítmo de búsqueda de los caracteres de corchetes, llaves o paréntesis y sus correspondientes cierres. La utilidad es saber
si un texto con estos caracteres está bien formado, es decir, que cada caracter tenga su correspondiente cierre.

Es una solución a un problema propuesto por el canal BettaTech.

Para la solución he propuesto guardar el útlimo valor de apertura que se lee en una pila y si no es un símbolo de cierre comprobar que es del mismo tipo
que el del último elemento de la pila.

La complejidad del algorítmo es O(N), es decir, es lineal con respecto al número de caracteres del texto.

## Búsqueda Texto

Este proyecto es una solución a una prueba técnica propuesta en una entrevista de trabajo. 

De entrada nos dan un texto y nos piden que contemos el número de palabras y sus repeticiones. 

Para empezar spliteo el texto de entrada por espacios y guardo cada caracter en un array. Después recorro el array preformateando cada palabra, 
por ejemplo si es un punto, coma, caracter de interrogación o de admiración lo trato como un símbolo vacío. Utilizo un Mapa de Hash para evaluar
la repetición de cada palabra.

Se puede refinar haciendo un análisis exhaustivo del tipo de caracteres que no deseamos que se evalúen.

Los mapas de Hash son la estructura de datos correcta que se puede utilizar para resolver un problema que trata de buscar y contar.

## Convertir Números Romanos

En este documento se explica el 

## Dance Game

En este documento se explica el 

## Recursividad

En este documento se explica el 

## SonarQube - Complejidad Algorítmica

En este documento se explica el 

## Proyectos Pendientes

En este documento se explica el 

