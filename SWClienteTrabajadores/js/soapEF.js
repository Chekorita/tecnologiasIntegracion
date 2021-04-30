var mensaje = ''
//inicia el mensaje con lo que hay en el formualrio en a y b
function ini(){
    mensaje = '<?xml version="1.0" encoding="utf-8"?>' +
    '<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">' +
    '<Body>' +
    '<EliminarQuiebraRequest xmlns="http://www.example.com/trabajadores">'+
    '<nombreEmpresa>UV</nombreEmpresa>'+
    '<numSucursal>'+ parseInt(document.getElementById('NumFacultad').value) +'</numSucursal>'+
    '</EliminarQuiebraRequest>'+
    '</Body>' +
    '</Envelope>';
}
//lo que pasa al presionar boton, inicia mensaje, hace llamado 
//al servicio web, e imprime el resultado en el txt del resultado
function soap(){
    ini();
    axios.post('http://localhost:8080/ws/trabajadores', mensaje, {
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
    var resul = xmlDoc.getElementsByTagName("ns2:mensaje")[0].childNodes[0].nodeValue;
    return resul;
}
function limpiar(){
    document.getElementById('NumFacultad').value="";
}