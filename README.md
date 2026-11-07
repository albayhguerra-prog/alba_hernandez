# Segundo Parcial Práctico – Programación I

## Versión A

**Lenguaje:** Java  
**Modalidad:** Individual  
**Duración:** 60 minutos  
**Valor:** 100 puntos  
**Temas:** funciones, parámetros, retornos, arreglos unidimensionales, ciclos, condicionales, validaciones, contadores y acumuladores.

---

## Indicaciones generales

1. Lea completamente el problema antes de comenzar a programar.
2. Desarrolle la solución en una única clase de Java llamada `CentroReciclaje`.
3. Utilice un arreglo unidimensional para almacenar los datos.
4. Divida la solución en funciones o métodos `static` con responsabilidades concretas.
5. El método `main` debe coordinar las llamadas; no debe contener toda la lógica del programa.
6. Utilice parámetros y valores de retorno cuando corresponda.
7. No se permite utilizar:
   - `ArrayList` ni otras colecciones.
   - `Stream`.
   - Variables globales.
   - Métodos automáticos para sumar, ordenar, obtener máximos o resolver los cálculos solicitados.
8. El programa debe validar los datos indicados en el enunciado.
9. La solución debe compilar y ejecutarse correctamente desde consola.

---

# Ejercicio – Control de material reciclable

Un centro de reciclaje recibe durante una jornada una cantidad variable de cargas de material. El peso de cada carga se registra en kilogramos y debe encontrarse entre **5 y 200 kg**.

La cantidad de cargas que se registrará debe estar entre **3 y 20**.

Construya un programa que almacene los pesos en un arreglo y permita obtener la siguiente información:

1. Cantidad de cargas con peso entre **5 y 80 kg**, incluidos ambos límites.
2. Cantidad de cargas con peso superior a **80 kg**.
3. Peso total recibido durante la jornada.
4. Promedio de peso por carga.
5. Mayor peso registrado.
6. Cantidad de cargas cuyo peso fue superior al promedio.
7. Número de la primera carga en la que apareció el mayor peso.
8. Listado numerado de todos los pesos registrados.

---

## Validaciones obligatorias

- La cantidad de cargas debe estar entre 3 y 20.
- Cada peso debe estar entre 5 y 200 kg.
- Cuando un dato sea inválido, el programa debe mostrar un mensaje y solicitarlo nuevamente.
- Las cargas deben mostrarse numeradas desde 1, aunque las posiciones del arreglo comiencen en 0.

---

## Funciones mínimas requeridas

El programa debe tener, como mínimo, funciones independientes para:

1. Leer y validar la cantidad de cargas.
2. Verificar si un peso pertenece al rango permitido.
3. Cargar los pesos en el arreglo.
4. Calcular la suma de los pesos.
5. Contar valores que pertenezcan a un rango.
6. Contar valores mayores que un límite.
7. Calcular el promedio.
8. Buscar el mayor peso.
9. Buscar la primera posición del mayor peso.
10. Mostrar el resumen final.

Los nombres de las funciones quedan a criterio del estudiante, pero deben ser comprensibles. También deberá decidir:

- Qué parámetros recibe cada función.
- Qué tipo de dato retorna.
- Cuáles funciones deben ser `void`.

> Una función debe resolver una responsabilidad concreta. Crear una función que realice todo el ejercicio no se considera modularización.

---

## Caso de prueba

Puede utilizar los siguientes datos para comprobar parcialmente el programa:

```text
Cantidad de cargas: 5
Pesos: 40, 100, 60, 150, 50
```

Para este caso:

- Existen 3 cargas entre 5 y 80 kg.
- Existen 2 cargas superiores a 80 kg.
- El peso total es 400 kg.
- El promedio es 80 kg.
- El mayor peso es 150 kg.
- Existen 2 cargas por encima del promedio.
- El mayor peso apareció por primera vez en la carga 4.

El programa también será probado con otros valores, incluyendo datos inválidos y valores repetidos.

---

PROGRAMA MIO

   Inicializamos el Scanner sc, lo usamos para leercantidad que dentro de esto usamos un dowhile y if para que no se pueda ingresar valores menores que cero y la cantidad la utilizamos para el arreglo de cargasKg, luego se utiliza un metodo como boolean para definir las cargas validas, otro metodo para pedir los pesos de las cargas utilizando scanner, y dowhile, if, y utilizamos el metodo de pesos validos....

   no me dejo terminar mi explicación