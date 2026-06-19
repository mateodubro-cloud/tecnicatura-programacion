//Estructura switch(la sintaxis es igual a Java)
let fecha = new Date();
let mes = fecha.getMonth() + 1; // Enero = 1, Diciembre = 12

let estacion;

if (mes === 12 || mes === 1 || mes === 2) {
    estacion = "Verano";
}
else if (mes >= 3 && mes <= 5) {
    estacion = "Otoño";
}
else if (mes >= 6 && mes <= 8) {
    estacion = "Invierno";
}
else {
    estacion = "Primavera";
}

console.log(estacion);
switch (mes) { //No solo se pueden utilizar número, también cadenas

    case 1:
    case 2:
    case 12:
        estacion = "Verano";
        break;

    case 3:
    case 4:
    case 5:
        estacion = "Otoño";
        break;

    case 6:
    case 7:
    case 8:
        estacion = "Invierno";
        break;

    case 9:
    case 10:
    case 11:
        estacion = "Primavera";
        break;

    default:
        estacion = "Valor incorrecto";
}

console.log("Bienvenido a la estación de: " + estacion);