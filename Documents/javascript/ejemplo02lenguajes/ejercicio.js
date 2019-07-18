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




console.log("ejercicio")
console.log("funcion que suema elementos de los atributos con minimo de dos elementos")
function sumar(a,b){
    if(arguments.length >=2){
        let resultado = 0
        for(let index = 0; index < arguments.length; index++){
            resultado += arguments[index];
        }
        return resultado
    }

}

console.log(sumar())
console.log(sumar(2))
console.log(sumar(2,4))
console.log(sumar(2,6,8))
console.log(sumar(2,6,8,2,6,8))


console.log("ejercicio2, agrega a un array la funcion construida")

Array.prototype.funcionquesuma= sumar
var miArray = new Array(9,8,7)
console.log(miArray.funcionquesuma(3,2,5))


console.log("ejercicio3, agrega a un array concatenar")
function  concatenarCotenido(){
    let concate = ""
        for(let index = 0; index < this.length; index++){
            concate += this[index];
        }
        return concate
}

Array.prototype.concatena = concatenarCotenido
var miArray2 = new Array(9,8,7)
console.log(miArray2.concatena(3,2,5))


let hombreObjeto={}
let cartaDeCubatas = [
    {
        hielos:2,
        licor: "JB"
    },    {
        hielos:3,
        licor: "larios"
    },    {
        hielos:4,
        licor: "calimoxo"
    },
]
console.log(cartaDeCubatas[2].licor)
