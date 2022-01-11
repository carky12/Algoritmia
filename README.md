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

En este proyecto vemos el poder de la optimización en algorítmos de búsqueda utilizando la búsqueda binaria de forma iterativa
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

En este proyecto se construye un conversor de números decimales a números romanos. El algorítmo se basa en recorrer cada cifra individualmente y según
la posición de la cifra establecer un límite inferior, medio y uno superior (0, 5 y 10). Situal la cifra tratada entre los intervalos 0-5 o 6-10 y 
si la diferencia es menor que 3 se aplica un signo inferior predefinido. Lo mejor es verlo con un ejemplo:

Signos utilizados para según que cifra estamos tratando:
- I: para las cifras en primera posición desde la izquierda
- X: para las cifras en segunda posición desde la izquierda
- C: para las cifras en tercera posición desde la izquierda
- M: para las cifras en cuarta posición desde la izquierda (primera cifra desde la derecha)

Por ejemplo el número 526:
- Para el 5 utilizaremos el signo "I"
- Para el 2 utilizaremos el signo "X"
- Para el 6 utilizaremos el signo "C"

En función del caso que estemos tratando definimos unos límites inferior y superior. Siempre 

Para el caso I:
	
	Si el número es mayor que 5:
		- Límite inferior: V
		- Límite superior: X
	Si el número es menor que 5:
		- Límite inferior: ""
		- Límite superior: V

De tal forma que si el número es el 7, se situará entre el (5-10) y los límites serán V-X. Después se evalúa la distancia con el límite inferior, y si es mayor que 3
se agregan tantos signos "I" como diferencia haya con el límite superior. En este caso 7-5 = 2 que es menor que 3, por tanto quedará signoInferior (V) mas tantos "I" como 
diferencia exista.

Y así para cada caso de cifra I, X, C o M.

Es complejo de explicar pero no es complejo de seguir en código. Por lo que creo que lo mejor es ver el código.

![Algoritmia](https://github.com/carky12/Algoritmia/blob/master/Imagenes/codigoConversorRomanos.png) 

## Dance Game

Este proyecto es el resultado de una prueba técnica para una entrevista de trabajo. La prueba se dividía en 4 secciones (Git, Java, Sql y Algorítmia). El problema de algorítmia
decía lo siguiente:

La prueba se llamaba "Dance Game" y consistía en un robot que salta posiciones en el eje X. En la posición cero el robot está en el punto 0, en la posición 1 el robot está en el
punto 1 y en la posición 2 el robto está en el punto -1. Te pedían en qué punto estará el robot en la posición 5 del juego.

El algoritmo es relativamente fácil, ya que con un bucle y una serie de asignaciones a variables para guardar valores anteriores se soluciona. El problema de esta prueba
era el tiempo, ya que sólo me dejaban 10 minutos....y sí una vez solucionado parece trivial, pero entre que planteas la algorítmia, tecleas el código y haces unas mínimas
pruebas se van los 10 minutos.

Yo lo pensé de la siguiente manera:

En cada posición del juego (del robot) hay un valor para el punto y otro valor que nos da lo que avanzó desde el punto anterior. Ejemplo para las primeras posiciones, que son
los datos de entrada:

- 0: punto 0, avance 0
- 1: punto 1, avance 1
- 2: punto -1, avance -2

Para calcular el siguiente punto hay que calcular el avance restando el avance en la posición n-2 al avance en posición n-1. Por tanto para la posición 3 tendríamos 
que el avance es (-2-1=-3). Por tanto el punto enla posición 3 sería el punto en el que estaba en la posición dos más el avance calculado, es decir -1-3=-4. 
Por tanto el punto en la posición 3 sería -4. 

- 0: punto 0, avance 0
- 1: punto 1, avance 1
- 2: punto -1, avance -2
- 3: avance = -2-1 = -3, punto = -1-3=-4
- 4: avance = -3-(-2)=-1, punto = -4-1=-5
- 5: avance = -1-(-3)=2, punto = -5+2=-3

y así sucesivamente.

La complejidad del algorítmo es proporcional al número de entradas, ya que en cada operación del bucle no hay operaciones que aumenten
la complejidad (sólo operaciones aritméticas básicas y re-asiganciones de variables). Por tanto la complejidad es proporcional a O(N).

## Recursividad

En este proyecto se aplican los distintos tipos de recursividad a ejemplos de cálculo. El proyecto se divide en:

- RECURSIVIDAD DIRECTA LINEAL NO FINAL: Es la recursividad en la que en cada ejecución recursiva se trabaja con datos locales diferentes y el 
resultado final depende de dichos datos intermedios. El coste de este algorítmo es lineal O(n) ya que realizará n llamadas al caso recursivo.	 

- RECURSIVIDAD DIRECTA LINEAL FINAL: Cuando el resultado de los casos recursivos es el correspondiente al valor de la última ejecución de la llamada recursiva.
El coste de este algorítmo es lineal proporcinal y proporcinal al número de llamadas recursivas que se realicen.
	 
- RECURSIVIDAD DIRECTA MÚLTIPLE: Cuando una ejecución recursiva da lugar a múltiples llamadas recursivas. En este caso se repiten muchos cálculos de términos 
de la serie de Fibonacci. El coste de este algorítmo es O(K^n) es decir exponencial. Es tremendamente ineficiente. 
Se podría mejorar aplicando técnicas de programación dinámica en la que se podrían ir guardando los términos ya calculados, y consultar si ya se
han calculado no proceder a calcularlos. Con esto el coste podría pasar a ser lineal.
	
- RECURSIVIDAD INDIRECTA: Se produce cuando dos funciones se llaman mutuamente. El coste de este algorítmo es lineal O(n) ya que por cada número
introducido se recorre la función restando uno al número hasta llegar a cero.
	 
## SonarQube - Complejidad Algorítmica

Documentación paso a paso para la instalación del servidor de SonarQube junto con los parámetros de configuración necesaria para Eclipse, JDK y SonarLint para Eclipse.

Las métricas de SonarQube te facilitan la información objetiva de la calidad actual de tu proyecto. SonarQube divide las métricas en las siguientes categorías:

- Evidencias
- Duplicados
- Complejidad
- Tamaño
- Pruebas
- Fiabilidad
- Seguridad
- Mantenibilidad
- Evidencias / Issues

Se habla sobre que tipos de complejidad se usan para medir el rendimiento de un programa, explicando las diferencias y características de las complejidades 
ciclomática, cognitiva y algorítmica.

## Proyectos Pendientes

- Diferentes estructuras de datos (árboles, grafos, maps, etc...)
- Algorítmos de Ordenación.
- Algorímos de vuelta atrás.
- Algorítmos de divide y vencerás.


