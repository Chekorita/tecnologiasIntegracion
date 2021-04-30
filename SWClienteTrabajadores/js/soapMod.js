var mensaje1 = ''
var mensaje2 = ''
//inicia el mensaje con lo que hay en el formualrio en a y b
function ini(){
    mensaje1 = '<?xml version="1.0" encoding="utf-8"?>' +
    '<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">' +
    '<Body>' +
    '<ModificarRequest xmlns="http://www.example.com/trabajadores">'+
    '<nombre>'+document.getElementById('Nombre').value+'</nombre>'+
    '<apellidos>'+document.getElementById('Apellido').value +'</apellidos>'+
    '<nombreEmpresa>UV</nombreEmpresa>'+
    '<numCelular>'+ parseInt(document.getElementById('Telefono').value) +'</numCelular>'+
    '<calle>'+document.getElementById('Calle').value +'</calle>'+
    '<numCasa>'+parseInt(document.getElementById('numCasa').value) +'</numCasa>'+
    '<colonia>'+document.getElementById('Colonia').value +'</colonia>'+
    '<ciudad>'+document.getElementById('Ciudad').value +'</ciudad>'+
    '<estado>'+document.getElementById('Estado').value +'</estado>'+
    '<pais>'+document.getElementById('Pais').value +'</pais>'+
    '<puesto>'+ document.getElementById('puesto').value +'</puesto>'+
    '<salario>'+ parseFloat(document.getElementById('salario').value) +'</salario>'+
    '<numSucursal>'+ parseInt(document.getElementById('Facultad').value) +'</numSucursal>'+
    '</ModificarRequest>'+
    '</Body>' +
    '</Envelope>';
}

function ini2(){
    mensaje2 = '<?xml version="1.0" encoding="utf-8"?>' +
    '<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">' +
    '<Body>' +
    '<ConsultarRequest xmlns="http://www.example.com/trabajadores">' +
    '<nombreEmpresa>UV</nombreEmpresa>'+
    '</ConsultarRequest>'+
    '</Body>' +
    '</Envelope>';
}
//lo que pasa al presionar boton, inicia mensaje, hace llamado 
//al servicio web, e imprime el resultado en el txt del resultado
function soap(){
    ini();
    axios.post('http://localhost:8080/ws/trabajadores', mensaje1, {
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

function soap2(){
    ini2();
    axios.post('http://localhost:8080/ws/trabajadores', mensaje2, {
        headers: {
            'Content-Type': 'text/xml'
        }
    })
    .then(function(response){
        //=> console.log(response.data)
        resultado2(response.data)
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
function resultado2(rXml){
    var parser = new DOMParser();
    var xmlDoc = parser.parseFromString(rXml, "text/xml");
    //aqui es con poner la etiqueta xml en donde se pone el resultado
    var cantidadRecuperada = xmlDoc.getElementsByTagName("ns2:nombre").length;
    var nombre = document.getElementById('Nombre').value;
    var apellido = document.getElementById('Apellido').value;
    var empresa = 'UV';
    for (var i = 0; i < cantidadRecuperada; i++){
        if(apellido == xmlDoc.getElementsByTagName("ns2:apellidos")[i].childNodes[0].nodeValue && nombre == xmlDoc.getElementsByTagName("ns2:nombre")[i].childNodes[0].nodeValue){
            document.getElementById('Telefono').value=xmlDoc.getElementsByTagName("ns2:numCelular")[i].childNodes[0].nodeValue;
            document.getElementById('Calle').value=xmlDoc.getElementsByTagName("ns2:calle")[i].childNodes[0].nodeValue;
            document.getElementById('numCasa').value=xmlDoc.getElementsByTagName("ns2:numCasa")[i].childNodes[0].nodeValue;
            document.getElementById('Colonia').value=xmlDoc.getElementsByTagName("ns2:colonia")[i].childNodes[0].nodeValue;
            document.getElementById('Ciudad').value=xmlDoc.getElementsByTagName("ns2:ciudad")[i].childNodes[0].nodeValue;
            document.getElementById('Estado').value=xmlDoc.getElementsByTagName("ns2:estado")[i].childNodes[0].nodeValue;
            document.getElementById('Pais').value=xmlDoc.getElementsByTagName("ns2:pais")[i].childNodes[0].nodeValue;
            document.getElementById('puesto').value=xmlDoc.getElementsByTagName("ns2:puesto")[i].childNodes[0].nodeValue;
            document.getElementById('salario').value=xmlDoc.getElementsByTagName("ns2:salario")[i].childNodes[0].nodeValue;
            document.getElementById('Facultad').value=xmlDoc.getElementsByTagName("ns2:numSucursal")[i].childNodes[0].nodeValue;
        }
    }
}
function limpiar(){
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