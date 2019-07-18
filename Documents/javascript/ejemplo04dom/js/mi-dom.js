function initialize(){
    var miH1 = document.createElement("h1") //<h1>
    var miTxt = document.createTextNode("Un texto muy mono")
    miH1.appendChild(miTxt)
    var miBody = document.body
    miBody.appendChild(miH1)
}