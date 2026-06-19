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