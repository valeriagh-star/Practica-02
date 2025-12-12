# Practica-02

## ✅ Objetivo

El objetivo de esta práctica fue aprender a organizar la estructura de directorios para facilitar la comprensión, el mantenimiento y la escalabilidad de los programas, aplicando conceptos básicos de la programación orientada a objetos.

## ✍️ Descripción

A grandes rasgos, esta práctica consistió en diseñar y codificar una solución modular en Java que aplicó la encapsulación y los métodos de una clase (Usuario) bajo el control de una clase principal (Main) que se encargó de la validación interactiva de datos.
* Se utilizó la carpeta src/modulos para almacenar las clases creadas.
* La clase Usuario.java fue el núcleo de la POO, enfocándose en el principio de Encapsulamiento.
* La clase Main.java se ubicó en la raíz de src/, sirviendo como el punto de inicio de la aplicación. Así mismo, esta clase gestionó la interacción con el usuario y garantizó la validación de los datos solicitados.
* Se incluyó un archivo README.txt con el nombre completo del alumno en el directorio raíz del proyecto.

## ⚙️ Tecnologías utilizadas

* **Lenguaje:** JavaSE-24.
* **IDE:** Eclipse IDE.

## 📁 Estructura del Proyecto

El proyecto sigue la estructura jerárquica solicitada, separando la lógica de negocio (Clase `Usuario`) de la lógica de aplicación (Clase `Main`).

**Proyecto/**                   
**├── src/**                    
**│   ├── modulos/**            
**│   │   └── Usuario.java**    
**│   └── Main.java**           
**└── README.txt**              

## 📸 Evidencias (Capturas de pantalla)

A continuación se muestra la captura de pantalla de la ejecución en consola, donde se verifica el funcionamiento de las validaciones de Rol y Correo, y la correcta creación del objeto `Usuario`.

![Captura de la Ejecución de Main](practica02.png)

El código fuente de los directorios está organizado por paquetes y se puede revisar directamente en la carpeta [src/](https://github.com/valeriagh-star/Practica-02/tree/main/src).

| Carpetas | Ruta del Archivo .java |
| :--- | :--- |
| **Clase Usuario** | [src/modulos/Usuario.java](https://github.com/valeriagh-star/Practica-02/blob/main/src/modulos/Usuario.java) | 
| **Clase Main** | [src/Main/Main.java](https://github.com/valeriagh-star/Practica-02/blob/main/src/Main.java) |
| **README** | [Practica02/main/README.txt](https://github.com/valeriagh-star/Practica-02/blob/main/README.txt) |

## ▶️ Instrucciones de ejecución

1.  **Clonar el Repositorio**
2.  **Abrir en IDE:** Importar la carpeta clonada como un proyecto Java en Eclipse o IntelliJ.
3.  **Ejecutar:** Ir a `src/Main.java`, hacer clic derecho y seleccionar **"Run As"** -> **"Java Application"**.
4.  **Interacción:** Seguir las instrucciones de la consola e ingresar el Nombre, Correo y Rol. El programa manejará las validaciones automáticamente.
