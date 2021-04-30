var mensaje = ''
//inicia el mensaje con lo que hay en el formualrio en a y b
function ini(){
    mensaje = '<?xml version="1.0" encoding="utf-8"?>' +
    '<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">' +
    '<Body>' +
    '<RegistrarRequest xmlns="http://www.example.com/trabajadores">'+
    '<nombre>'+document.getElementById('Nombre').value+'</nombre>'+
    '<apellidos>'+document.getElementById('Apellido').value +'</apellidos>'+
    '<numCelular>'+ parseInt(document.getElementById('Telefono').value) +'</numCelular>'+
    '<calle>'+document.getElementById('Calle').value +'</calle>'+
    '<numCasa>'+parseInt(document.getElementById('numCasa').value) +'</numCasa>'+
    '<colonia>'+document.getElementById('Colonia').value +'</colonia>'+
    '<ciudad>'+document.getElementById('Ciudad').value +'</ciudad>'+
    '<estado>'+document.getElementById('Estado').value +'</estado>'+
    '<pais>'+document.getElementById('Pais').value +'</pais>'+
    '<nombreEmpresa>UV</nombreEmpresa>'+
    '<puesto>'+ document.getElementById('puesto').value +'</puesto>'+
    '<salario>'+ parseFloat(document.getElementById('salario').value) +'</salario>'+
    '<numSucursal>'+ parseInt(document.getElementById('Facultad').value) +'</numSucursal>'+
    '</RegistrarRequest>'+
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
    document.getElementById('Nombre').value="";
    document.getElementById('Apellido').value="";
    document.getElementById('Telefono').value="";
    document.getElementById('Calle').value="";
    document.getElementById('numCasa').value="";
    document.getElementById('Colonia').value="";
    document.getElementById('Ciudad').value="";
    document.getElementById('Estado').value="";
    document.getElementById('Pais').value="";
    document.getElementById('puesto').value="";
    document.getElementById('salario').value="";
    document.getElementById('Facultad').value="";
}