Proceso ejercicio_128
	Definir cambio,bolivares,opcion Como Real;
	Escribir "Escribir la cantidad de dinero en bol�vares."; 
	Leer bolivares;
	Escribir "1. Cambiar de bol�vares a francos.";
	Escribir "2. Cambiar de bol�vares a d�lares.";
	Escribir "3. Cambiar de bol�vares a pesos.";
	Escribir "4. Cambiar de bol�vares a sucres.";
	Leer opcion;
	Segun opcion Hacer
		1:
			cambio<-bolivares*0.000046;
			Escribir "El valor en francos es: $",cambio;
		2:
			cambio<-bolivares*0.00000040930121;
			Escribir "El valor en d�lares es: $",cambio;
		3:
			cambio<-bolivares*0.0018699656 ;
			Escribir "El valor en pesos es: $",cambio;
		4:
			cambio<-bolivares*0.1006;
			Escribir "El valor en sucres es: $",cambio;
		De Otro Modo:
			Escribir "Cambio no valido.";
	FinSegun
	
FinProceso
