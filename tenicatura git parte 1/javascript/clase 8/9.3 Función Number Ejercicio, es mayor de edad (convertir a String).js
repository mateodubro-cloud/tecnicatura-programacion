// Convertir String a Number
let miNumero = "21"; // Es una cadena

console.log(typeof miNumero);

let edad2 = Number(miNumero); // Esta es una función

console.log(typeof edad2);

if (edad2 >= 18) {
    console.log("Puede votar");
}
else {
    console.log("Muy joven para votar");
}

let resultado3 = edad2 >= 18 ? "Puede votar" : "es muy joven para votar"
console.log(resultado3)