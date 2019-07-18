function setValue(resultado){
    document.getElementById("pantalla").value = resultado;
}

function getValue(){
    return document.getElementById("pantalla").value
}


function calculo() {
    var resultado = eval(getValue()); 
    setValue(resultado);
}


