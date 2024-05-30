Identifique TODAS las clases presentes en el dominio problema.  
Las clases presentes identificadas en el dominio problema sería la clase Dado, clase Calculadora y clase JuegodeDados.  

Establezca los atributos y métodos para c/CLASE.  
Clase Dado atributos: caraSuperior 
Metodos: getCaraSuperior(), lanzar()  

Clase Calculadora atributos: No necesita ya que solo realiza operaciones.  
Metodos: int sumar(a, b).  

Clase JuegodeDados atributos: Dado dado1, Dado dado2 y Calculadora calculadora.  
Metodos: __init__() y jugar().  

Identifique y defina las relaciones entre clases presentes en este caso.  
La relación entre JuegoDeDados y Dado es una composición, ya que JuegoDeDados está compuesto por dos objetos Dado.  
La relación entre JuegoDeDados y Calculadora es una agregación, ya que JuegoDeDados utiliza un objeto Calculadora.  

Modele el caso usando diagrama de casos UML y VP.  
![image](https://github.com/carljav4/Juego-de-Dados/assets/163133151/82ed0b02-e79c-40a5-9fc6-973c69847f18)  

Codifique su solución, considerando el número mínimo de clases y test necesarios para su implementación y pruebas mínimas de funcionamiento.  
![image](https://github.com/carljav4/Juego-de-Dados/assets/163133151/a3b9e5e6-ff0d-4437-8ac9-16d689b0a513)  
![image](https://github.com/carljav4/Juego-de-Dados/assets/163133151/66874e73-25d7-4bef-8777-1117b363268c)  

Test necesario en el metodo Calculadora para el buen funcionamiento:  
![image](https://github.com/carljav4/Juego-de-Dados/assets/163133151/c46326dd-0c07-4e71-b07c-d84f134a4071)








