Proceso ejercicio_129
	Definir dolares,cambio,opcion Como Real;
	Escribir "Escribir la cantidad de dinero en d�lares."; 
	Leer dolares;
	Escribir "1. Cambiar de d�lares a francos.";
	Escribir "2. Cambiar de d�lares a bol�vares.";
	Escribir "3. Cambiar de d�lares a pesos.";
	Escribir "4. Cambiar de d�lares a sucres.";
	Leer opcion;
	Segun opcion Hacer
		1:
			cambio<-dolares*0.91;
			Escribir "El valor en francos es: $",cambio;
		2:
			cambio<-dolares*2443189.75 ;
			Escribir "El valor en bol�vares es: $",cambio;
		3:
			cambio<-dolares*4568.38;
			Escribir "El valor en pesos es: $",cambio;
		4:
			cambio<-dolares*25801.03;
			Escribir "El valor en sucres es: $",cambio;
		De Otro Modo:
			Escribir "Cambio no valido.";
	FinSegun
	
FinProceso
