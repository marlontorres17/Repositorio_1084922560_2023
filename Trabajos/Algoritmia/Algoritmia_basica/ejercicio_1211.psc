Proceso ejercicio_1211
	Definir cambio,soles,opcion Como Real;
	Escribir "Escribir la cantidad de dinero en soles."; 
	Leer soles;
	Escribir "1. Cambiar de soles a d�lares.";
	Escribir "2. Cambiar de soles a bol�vares.";
	Escribir "3. Cambiar de soles a pesos.";
	Escribir "4. Cambiar de soles a francos.";
	Leer opcion;
	Segun opcion Hacer
		1:
			cambio<-soles*0.26;
			Escribir "El valor en d�lares es: $",cambio;
		2:
			cambio<-soles*2698001.96 ;
			Escribir "El valor en bol�vares es: $",cambio;
		3:
			cambio<-soles*5043.48 ;
			Escribir "El valor en pesos es: $",cambio;
		4:
			cambio<-soles*0.24;
			Escribir "El valor en francos es: $",cambio;
		De Otro Modo:
			Escribir "Cambio no valido.";
	FinSegun
	
FinProceso
