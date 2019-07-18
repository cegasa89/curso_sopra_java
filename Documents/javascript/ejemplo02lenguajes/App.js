
console.log("mi primer log de nodejs");
variableGlobal = "mi variable global declarada";
var variableGlobal2 = "vairable global 2";

laFuncionDeIrAlVar();
laFuncionDeIrAlLet();

function laFuncionDeIrAlVar(){
    var variableLocal = "variable local";
    for (var i = 0; i < 10; i++){
        console.log("contenido de i "+i);
    }
    console.log("valor de i al final " + i);

}

function laFuncionDeIrAlLet(){
    var variableLocal = "otra variable local";
    variableSinVar = "soy una variable sin var";
    for (let i = 0; i < 10; i++){
        console.log("contenido de i "+i);
    }
    //console.log("valor de i al final " + i);

}

console.log("------------------------------------------------------------");
console.log("Evaluacion de los tipos de datos");
var tipoDeDatoNumerico = 8;
var tipoString = "blablalba";
var tipoFecha = new Date();
var referenciaAUnaFecha = tipoFecha;

console.log("fecha original" + tipoFecha);
cambiarFecha(tipoFecha);
console.log("fecha original" + tipoFecha);
console.log("fecha de la referencia" + referenciaAUnaFecha);

function cambiarFecha(fecha){
    fecha.setFullYear(1999);
    console.log("fecha cambiada a " + fecha);
}

console.log("Dime el tipo de la varaible con un numero" + typeof tipoDeDatoNumerico);
console.log("Dime el tipo de la varaible con un cadena" + typeof tipoString);
console.log("Dime el tipo de la varaible con un fecha" + typeof tipoFecha);


operacionesNumericas(1,2,3,4)
operacionesNumericas()


function operacionesNumericas(){
    let miNumero = new Number(3.141592);
    console.log("valor almacenado " + miNumero.valueOf());
    console.log("valor almacenado " + miNumero.toFixed());
    console.log("valor almacenado " + miNumero.toFixed(4));

}



troloco()
troloco(1)
troloco("mega","guay")
troloco(3,4,5,6,7,8,9,1)


function troloco(mega, guay){
    console.log("numero de parametros recibidos " + arguments.length);
    console.log("numero de argumentos esperados " + arguments.callee.length);
    if(arguments.length == arguments.callee.length){
        console.log(mega + " " + guay);
    }
    if(arguments.length == 1){
        console.log("con " + mega + " me conformo");
    }

}

comoMeGustanLasArrays()

function comoMeGustanLasArrays(){
    let unArray= new Array(); //
    unArray[0]=7
    unArray[1]= "mis atopopotaja"
    console.log("elo ultimo elemento es " + unArray[unArray.length-1])
    let otroArray = [0,"valor", new Date()];
    let persona = []
    persona.nombre = "toto"
    persona.apellido1 = "atawalpa"
    persona.funcioncilla = troloco
    persona.funcioncilla("soy", "guay")

}



function cubata(hielo, licor){
    this.loshielos=hielo
    this.licorcllo=licor
    this.echaruntrago = function(){
        return this.loshielos + " " + this.licor
    }
}

cubata.prototype.generameUnstring = function(){
    return this.loshielos + " " + this.licor
}


miCubata = new cubata("Dos yerlos", "roncillo")
console.log(miCubata.echaruntrago())






Array.prototype.calculardatos = function  (){
    console.log("Invocación recibida");
    var valor =0
    for (let x=0;x<arguments.length;x++){
        valor= valor+arguments[x]
    }
    console.log(valor);
  }


function prueba(){
  var nuevoarray = new Array.prototype()
  nuevoarray[0]=1
  nuevoarray[1]=2
  nuevoarray[2]=3
  nuevoarray[3]=4
  nuevoarray.calculardatos();
}

