function initialize(){
    var parrafo1 = document.getElementById("parrafo1")
    console.log(parrafo1)
    var parrafo2 = document.querySelector("body p")
    console.log(parrafo2)
    var parrafo3 = document.getElementsByClassName("titulo")
    console.log(parrafo3)
    var parrafo4 = document.getElementsByTagName("li")
    console.log(parrafo4)
    var parrafo5 = document.getElementsByName("input")
    console.log(parrafo5)
    var parrafo6 = document.querySelectorAll("body p")
    console.log("primer elemento" + parrafo6[0])
    console.log("segdundo elemento" + parrafo6[1])
    for(let index = 0; index < parrafo6.length; index++){
        console.log(parrafo6[index].firstChild.textContent)
    }



}