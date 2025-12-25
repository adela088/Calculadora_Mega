# 🧮 Calculadora Mega

![Java](https://img.shields.io/badge/Java-23-orange?style=for-the-badge&logo=java)
![Swing](https://img.shields.io/badge/GUI-Java%20Swing-blue?style=for-the-badge)
![Estado](https://img.shields.io/badge/Estado-Finalizado-brightgreen?style=for-the-badge)
![Plataforma](https://img.shields.io/badge/Plataforma-Desktop-lightgrey?style=for-the-badge)

## 📖 Descripción

> **Calculadora Mega** es una aplicación de escritorio desarrollada en **Java (Swing)** que implementa una **calculadora científica moderna**, permitiendo evaluar **expresiones matemáticas completas** y comparar **implementaciones iterativas y recursivas**, junto con métricas de **tiempo de ejecución** y **uso de memoria**.

---

## ✨ Características principales

- 🔢 Operaciones matemáticas básicas y científicas
- 🧮 Evaluación de **expresiones completas** con precedencia
- 🧩 Soporte de **paréntesis anidados**
- ✖️ **Multiplicación implícita** (ej. `8(9-3)`, `(2+3)(4+1)`)
- 🔁 Doble implementación: **Iterativa y Recursiva**
- ⏱️ Medición de **tiempo de ejecución**
- 🧠 Cálculo de **memoria utilizada**
- 🎨 Interfaz gráfica intuitiva con **Swing**
- 🌗 **Modo Claro / Modo Oscuro**
- 🎧 **Sonidos integrados** para acciones
- ⌨️ Uso completo mediante **teclado y teclado numérico**

---

## 🧠 Operaciones disponibles

### ➕ Operaciones básicas
- Suma  
- Resta  
- Multiplicación  
- División  
- Módulo  
- División entera  

### 📐 Operaciones científicas
- Potencia (`^`)  
- Raíz cuadrada (`sqrt`)  
- Factorial (`!`)  
- Combinatoria (**nCr**)  

### 📊 Trigonometría
- Seno  
- Coseno  
- Tangente  

---

## 🧮 Evaluación de expresiones

La calculadora permite ingresar expresiones matemáticas completas como:
- 8 * (9 - 3)
- (2 + 3)(4 + 1)
- sqrt(16 + 4)
- 5 + 3 * 2


Características:
- ✔ Precedencia correcta de operadores
- ✔ Paréntesis balanceados automáticamente
- ✔ Validación de errores antes de evaluar
- ✔ Cierre automático de paréntesis pendientes

---

## 🔁 ANS implícito (resultado anterior)

La calculadora **no requiere un botón ANS**.

- El último resultado se conserva internamente
- Al presionar un operador tras obtener un resultado, este se reutiliza automáticamente

Ejemplo:
5 + 3 = → 8

* 2 = → 16


Este comportamiento simula el funcionamiento de calculadoras modernas como **Samsung** o **Windows Calculator**.

---

## ⌨️ Soporte de teclado

- Números (teclado normal y numérico)
- Operadores `+ - * /`
- Paréntesis:
  - `Shift + 8` → `(`
  - `Shift + 9` → `)`
- `Enter` → calcular resultado
- `Backspace` → borrar último carácter

---

## 🔁 Comparación Iterativa vs Recursiva

La calculadora permite ejecutar cada operación usando:

- 🔂 **Implementación iterativa**
- 🔁 **Implementación recursiva**

Mostrando al usuario:

- ⏱️ Tiempo exacto de ejecución
- 🧠 Consumo de memoria
- ⚖️ Diferencias de rendimiento entre enfoques

---

## 👀 Vista previa

### 📩 Menú principal
![Menú](https://raw.githubusercontent.com/adela088/Calculadora_Mega/master/assets/menu.gif)

### ⛅ Modo Claro
![Modo Claro](https://raw.githubusercontent.com/adela088/Calculadora_Mega/master/assets/light.gif)

### 🌒 Modo Oscuro
![Modo Oscuro](https://raw.githubusercontent.com/adela088/Calculadora_Mega/master/assets/dark.gif)

---

## 🖥️ Tecnologías utilizadas

- **Java SE**
- **Java Swing**
- **Apache NetBeans**
- **Eventos y Listeners**
- **System.nanoTime()**
- **Runtime.getRuntime()**
- **Arquitectura Iterativa y Recursiva**

---

## ▶️ Cómo ejecutar el proyecto

### 🔹 Opción 1 – Ejecutar desde NetBeans

#### ✅ Requisitos
- **JDK 17 o superior**
- **Apache NetBeans 15 o superior**

#### 📁 Importar el proyecto
1. Abre NetBeans  
2. `File → Open Project`  
3. Selecciona la carpeta **Calculadora_Mega**  
4. Presiona **Open Project**

#### ▶️ Ejecutar
- Clic derecho sobre el proyecto → **Run**
- O presiona **F6**

---

## 📥 Descarga

Puedes descargar la versión ejecutable para Windows desde GitHub Releases:

👉 **[Descargar Calculadora Mega v1.0.0 (.exe)](https://github.com/adela088/Calculadora_Mega/releases/latest)**

### 🖥️ Requisitos
- Windows 10 o superior
- No requiere Java instalado (exe empaquetado)

> Si tu antivirus muestra una advertencia, es normal en ejecutables Java no firmados.


## 📌 Objetivo del proyecto

Este proyecto tiene como finalidad **explorar y comparar** dos paradigmas fundamentales de la programación:

- 🔁 **Recursividad**
- 🔂 **Iteración**

Permitindo analizar diferencias en:

- ⚡ Velocidad de ejecución  
- 🧠 Uso de memoria  
- 🧩 Complejidad de implementación  

---

## 👩‍💻 Autora

**Andrea De la Ossa**  
🎓 Estudiante de Ingeniería de Sistemas  
💻 Desarrollo en Java  
🎯 Interés en interfaces gráficas y análisis de rendimiento  

📍 Proyecto académico / personal  


