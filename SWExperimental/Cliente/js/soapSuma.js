var mensaje = ''
//inicia el mensaje con lo que hay en el formualrio en a y b
function ini(){
    mensaje = '<?xml version="1.0" encoding="utf-8"?>' +
    '<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">' +
    '<Body>' +
    '<SumarRequest xmlns="http://www.example.org/calculadoraP">' +
    '<a>' + document.getElementById('a').value + '</a>' +
    '<b>' + document.getElementById('b').value + '</b>' +
    '</SumarRequest>' +
    '</Body>' +
    '</Envelope>';
}
//lo que pasa al presionar boton, inicia mensaje, hace llamado 
//al servicio web, e imprime el resultado en el txt del resultado
function soap(){
    ini();
    axios.post('http://18.206.127.244:8080/ws/calculadoraP', mensaje, {
        headers: {
            'Content-Type': 'text/xml'
        }
    })
    .then(function(response){
        //=> console.log(response.data)
        document.getElementById('r').value = resultado(response.data)
    })
    .catch(err => console.log(err));
}
//con esto logramos imprimir el resultado en nuestro formulario
function resultado(rXml){
    var parser = new DOMParser();
    var xmlDoc = parser.parseFromString(rXml, "text/xml");
    //aqui es con poner la etiqueta xml en donde se pone el resultado
    var resul = xmlDoc.getElementsByTagName("ns2:resultado")[0].childNodes[0].nodeValue;
    return resul;
}
function limpiar(){
    document.getElementById("a").value="";
    document.getElementById("b").value="";
    document.getElementById("r").value="";
}