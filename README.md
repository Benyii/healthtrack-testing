# 🧪 HealthTrack - Evaluación Módulo 4

Proyecto orientado al desarrollo y ejecución de pruebas automatizadas sobre una clase base defectuosa (`Usuario.java`). Se busca aplicar buenas prácticas de testing unitaria, detectar errores funcionales, y automatizar la validación mediante integración continua con GitHub Actions.

*Proyecto desarrollado como parte de un bootcamp de formación en herramientas DevOps, orientado a la práctica de integración continua y automatización de procesos con tecnologías estándar.*

---

## ⚙️ Pasos principales realizados

- Creación del proyecto Java con estructura estándar de Maven.
- Implementación de clase `Usuario.java` con lógica incorrecta deliberada.
- Desarrollo de pruebas unitarias con JUnit 5 para validar el comportamiento esperado.
- Detección del error funcional en el método `actualizarPeso()`.
- Implementación de CI para los tests con pipeline mediante GitHub Actions.

---

## 🧪 Pruebas implementadas

- ✔️ Validación del nombre del usuario (`getNombre()`).
- ❌ Detección del error al intentar actualizar el peso (`actualizarPeso()` no asigna correctamente el nuevo valor).
- ✔️ Validación de ejecución segura del método `mostrarInformacion()`.

---

## 🛠️ Herramientas utilizadas

- **Java 11**  
- **JUnit 5**  
- **Apache Maven**  
- **GitHub Actions**  
- **JMeter** y **Selenium** para pruebas avanzadas no incluidas en esta etapa.

---

## 📁 Estructura del proyecto

```bash
healthtrack-testing/
├── .github/
│ └── workflows/
│ └── maven-tests.yml
├── src/
│ ├── main/java/com/healthtrack/Usuario.java
│ └── test/java/com/healthtrack/UsuarioTest.java
├── .gitignore
├── pom.xml
└── README.md
```

