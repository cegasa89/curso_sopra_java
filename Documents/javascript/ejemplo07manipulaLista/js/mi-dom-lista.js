function initialize(){
    var lista = document.getElementById("lista")
    var li2 = document.createElement("li")
    var textl2 = document.createTextNode("2")
    li2.appendChild(textl2)
    lista.insertBefore(li2,lista.children[1])

}