# 🌐 MultiSiteTitleTest - Validación de Títulos Web con Selenium y JUnit 5

Este proyecto contiene una suite de pruebas automatizadas que valida los títulos de distintas páginas web utilizando **Selenium WebDriver**, **JUnit 5** y **WebDriverManager**. Es ideal para verificar la accesibilidad y consistencia de sitios clave como Google, GitHub, Stack Overflow y AWS.

## 📦 Estructura del Proyecto

```bash
src/
├── main/
│   ├── java/
│       └── cl.kibernumacademy/selenium
└── test/
    └── java/
        └── cl.kibernumacademy/selenium
            └── MultiSiteTitleTest.java
```

## 🧰 Tecnologías Utilizadas

- **Java 11+**
- **JUnit 5 (Jupiter)**
- **Selenium WebDriver**
- **WebDriverManager** (para gestión automática del driver de Chrome)

## 🚀 Cómo Ejecutar las Pruebas

1. Asegúrate de tener Chrome instalado.
2. Incluye las dependencias necesarias en tu `pom.xml` o `build.gradle`:
   - `selenium-java`
   - `webdrivermanager`
   - `junit-jupiter`

3. Ejecuta la clase `MultiSiteTitleTest` desde tu IDE o mediante Maven/Gradle.


## ✅ Pruebas Incluidas

| Método de prueba              | URL visitada                          | Validación del título                |
|------------------------------|---------------------------------------|--------------------------------------|
| `validarTituloGoogle`        | `https://www.google.com`              | Contiene `"Google"`                 |
| `validarTituloGitHub`        | `https://www.github.com`              | Contiene `"GitHub"`                 |
| `validarTituloStackOverflow` | `https://stackoverflow.com`          | Contiene `"Stack Overflow"`         |
| `validarTituloAWS`           | `https://aws.amazon.com/es/`         | Contiene `"Cloud Computing"`        |

## 🔄 Ciclo de Vida de Pruebas

- `@BeforeEach`: Configura el driver de Chrome antes de cada prueba.
- `@AfterEach`: Cierra el navegador para liberar recursos.

## 📌 Notas

- Las pruebas usan `assertTrue` para validar que el título contiene el texto esperado.
- WebDriverManager se encarga automáticamente de descargar y configurar el driver adecuado.
- Ideal para smoke testing de accesibilidad básica en múltiples sitios.

```

