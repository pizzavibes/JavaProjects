Algoritmo numero_primo
	definir a Como Entero
	definir n como entero
	Escribir "ingrese un numbero"
	Leer n
	Para a<-1 Hasta n-1 con paso 1 Hacer
		Si n  es divisible por a 
			escribir "no es primo"
			n<-a
		Fin Si
		Si n no es divisible por a
			escribir "es primo"
		FinSi
	Fin Para
FinAlgoritmo
