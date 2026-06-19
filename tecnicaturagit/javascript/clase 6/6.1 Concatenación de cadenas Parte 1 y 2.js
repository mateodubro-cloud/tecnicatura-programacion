var nombre = 'mateo';
var apellido = 'dubrowszczyk';
var nombreCompleto = nombre+' '+apellido; //Primera Concatenación
console.log(nombreCompleto); // mateo dubrowszczyk

var nombreCompleto2 = 'martin'+' '+'dubrowszczyk'; //Segunda Concatenación
console.log(nombreCompleto2); // martin dubrowszczyk

var juntos = nombre + 219; //Lee de izq a der siguiendo la cadena lee el número como str
console.log(juntos); // mateo219

juntos = nombre + 78 + 17;
console.log(juntos); // mateo7817

juntos = nombre + (78 + 17);
console.log(juntos);
juntos = 78 + 17 + nombre;
console.log(juntos)

