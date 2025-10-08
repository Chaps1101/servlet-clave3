**Autor:** Luis Ángel (Chaps1101)  
**Materia:** Programación Orientada a Objetos Avanzada  
**Universidad Bancaria de México (UBAM)**  

---

## 🚀 Descripción

Este proyecto es una aplicación **cliente-servidor** desarrollada con el framework **Spring Boot**, que implementa un **Servlet** encargado de generar una clave personalizada a partir de los datos ingresados por el usuario.

La clave se construye con:
- Las **2 primeras letras del nombre**
- La **primera letra del apellido**
- Los **2 últimos dígitos del año**
- El **número del mes**
- El **número del día**

**Ejemplo:**  
> Entrada: Luis Ángel, Álvarez, 2002-10-07  
> Resultado: `LuA021007`
>
> Intrucciones para visualizar bien el proyecto.
> IGNORAR CARPETA 1 Y 2.
> ├── servlet-clave3/ ← ✅ Proyecto correcto
│ ├── src/
│ │ ├── main/java/com/ubam/servletclave/
│ │ │ ├── MiServlet.java
│ │ │ └── ServletClaveApplication.java
│ │ └── main/resources/static/logo-ubam.png
│ ├── pom.xml
│ └── .gitignore
└── ...
