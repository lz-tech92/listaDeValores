# ListaDeValores

Proyecto en **Java** que permite manejar una lista de valores numéricos.  
El programa implementa operaciones básicas sobre la lista, como **agregar valores, mostrar el contenido, calcular el promedio y obtener el mayor y el menor valor**.

---

## Tabla de Contenidos

- [Descripción](#descripción)
- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Funcionamiento del Programa](#funcionamiento-del-programa)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Uso](#uso)
- [Contribuir](#contribuir)
- [Contacto](#contacto)

---

## Descripción

El programa está diseñado como un ejercicio de estructuras de datos simples en Java.  
Permite trabajar con una **lista dinámica** donde el usuario puede:

- Insertar valores en la lista.
- Visualizar todos los elementos almacenados.
- Calcular el **promedio** de los valores.
- Identificar el **valor máximo** y el **valor mínimo**.

---

## Requisitos

- Java 8 o superior.
- IDE de preferencia (NetBeans, IntelliJ, Eclipse).
- Git para clonar el repositorio.

---

## Instalación

1. Clonar el repositorio:  
   ```bash
   git clone https://github.com/lz-tech92/listaDeValores.git
   ```
2. Abrir la carpeta en tu IDE.
3. Compilar el proyecto.

---

## Funcionamiento del Programa

El proyecto contiene una clase principal donde se gestiona la lista de valores y un menú interactivo en consola.  

### Opciones del Menú:

1. **Agregar valor** → Permite al usuario añadir un número a la lista.  
2. **Mostrar lista** → Despliega todos los valores almacenados.  
3. **Calcular promedio** → Calcula la media aritmética de los valores.  
4. **Obtener valor máximo** → Muestra el número mayor de la lista.  
5. **Obtener valor mínimo** → Muestra el número menor de la lista.  
6. **Salir** → Finaliza la ejecución del programa.

### Ejemplo de Ejecución

```bash
------ MENÚ ------
1. Agregar valor
2. Mostrar lista
3. Calcular promedio
4. Valor máximo
5. Valor mínimo
6. Salir
Seleccione una opción: 1
Ingrese un valor: 25
Valor agregado correctamente.

Seleccione una opción: 2
Lista actual: [25]

Seleccione una opción: 1
Ingrese un valor: 40
Valor agregado correctamente.

Seleccione una opción: 2
Lista actual: [25, 40]

Seleccione una opción: 3
Promedio: 32.5

Seleccione una opción: 4
Valor máximo: 40

Seleccione una opción: 5
Valor mínimo: 25
```

---

## Estructura del Proyecto

```
listaDeValores/
├── src/
│   └── main/
│       └── java/
│           ├── ListaDeValores.java   # Clase principal con el menú
│           └── ...                   # Otras clases auxiliares
├── .gitignore
└── listaDeValores.iml
```

---

## Uso

Compilar y ejecutar desde consola:

```bash
javac ListaDeValores.java
java ListaDeValores
```

También puede ejecutarse directamente desde el **IDE**.

---

## Contribuir

Si deseas mejorar este proyecto:

1. Haz un fork del repositorio.
2. Crea una rama (`git checkout -b nueva-funcion`).
3. Realiza tus cambios y haz commit.
4. Sube tu rama (`git push origin nueva-funcion`).
5. Abre un Pull Request.

---

## Contacto

Autor: **lz-tech92**  
GitHub: [lz-tech92](https://github.com/lz-tech92)  
