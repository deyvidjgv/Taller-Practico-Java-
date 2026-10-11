# Sección 5: Debugging

Para cada fragmento puse un breakpoint en la primera línea del main, lo ejecuté con Debug (Shift + F9) y fui avanzando con F8 mirando la pestaña Variables.

## Fragmento 1: ErrorAsignacion
El error estaba en `if (cookieActiva = true)`. Con un solo `=` no estaba comparando, estaba asignando `true` a la variable. Por eso en el debugger `cookieActiva` pasaba de false a true y el programa siempre decía "Sesión activa". Lo corregí dejando `if (cookieActiva)`, que ya evalúa el booleano sin necesidad de comparar.

## Fragmento 2: ErrorComparacionString
Con `==` en dos Strings no se compara el texto, se compara si son el mismo objeto en memoria. `proveedor1` lo creé con `new String(...)` y `proveedor2` con un literal, entonces son dos objetos distintos aunque digan lo mismo "OneTrust". Lo arreglé usando `proveedor1.equals(proveedor2)`, que compara el contenido.

## Fragmento 3: ErrorFallThrough
Al no tener `break` en los case, cuando entraba al case 1 seguía ejecutando el case 2, el case 3 y el default. Con F8 se veía cómo la ejecución bajaba por todos los casos. Le puse `break;` al final de cada case y ahora solo imprime el que corresponde.

## Fragmento 4: ErrorPrecision
`tareasCompletadas / tareasTotales` son dos enteros, entonces Java hace división entera: 3 / 4 da 0 y se pierden los decimales. Con Evaluate Expression (Alt + F8) lo comprobé. Para arreglarlo convertí una de las variables a double con `(double) tareasCompletadas` antes de dividir y ahora da 0.75, o sea 75.0%.
