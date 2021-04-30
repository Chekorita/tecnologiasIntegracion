var mensaje = ''
function ini(){
    mensaje = '<?xml version="1.0" encoding="utf-8"?>' +
    '<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">' +
    '<Body>' +
    '<ConsultarSucursalRequest xmlns="http://www.example.com/trabajadores">'+
    '<nombreEmpresa>UV</nombreEmpresa>'+
    '<numSucursal>'+ document.getElementById('a').value +'</numSucursal>'+
    '</ConsultarSucursalRequest>'+
    '</Body>' +
    '</Envelope>';
}
function soap(){
    ini();
    axios.post('http://localhost:8080/ws/trabajadores', mensaje, {
        headers: {
            'Content-Type': 'text/xml'
        }
    })
    .then(function(response){
        resultado(response.data)
    })
    .catch(err => console.log(err));
}
function resultado(rXml){
    var parser = new DOMParser();
    var xmlDoc = parser.parseFromString(rXml, "text/xml");
    var cantidadRecuperada = xmlDoc.getElementsByTagName("ns2:nombre").length;
    var body = document.getElementsByTagName("body")[0];
    var tabla   = document.createElement("table");
    var tblBody = document.createElement("tbody");
    var hilera1 = document.createElement("tr");

        var celda01 = document.createElement("td");
        var nombre = document.createTextNode("Nombre");
        celda01.appendChild(nombre);

        var celda02 = document.createElement("td");
        var apellido = document.createTextNode("Apellidos");
        celda02.appendChild(apellido);

        var celda03 = document.createElement("td");
        var celular = document.createTextNode("Celular");
        celda03.appendChild(celular);

        var celda04 = document.createElement("td");
        var calle = document.createTextNode("Calle");
        celda04.appendChild(calle);

        var celda05 = document.createElement("td");
        var numCasa = document.createTextNode("Numero de casa");
        celda05.appendChild(numCasa);

        var celda06 = document.createElement("td");
        var colonia = document.createTextNode("Colonia");
        celda06.appendChild(colonia);

        var celda07 = document.createElement("td");
        var ciudad = document.createTextNode("Ciudad");
        celda07.appendChild(ciudad);

        var celda08 = document.createElement("td");
        var estado = document.createTextNode("Estado");
        celda08.appendChild(estado);

        var celda09 = document.createElement("td");
        var pais = document.createTextNode("Pais");
        celda09.appendChild(pais);

        var celda010 = document.createElement("td");
        var puesto = document.createTextNode("Puesto");
        celda010.appendChild(puesto);

        var celda011 = document.createElement("td");
        var salario = document.createTextNode("Salario");
        celda011.appendChild(salario);

        var celda012 = document.createElement("td");
        var sucursal = document.createTextNode("Numero de Facultad");
        celda012.appendChild(sucursal);


    hilera1.appendChild(celda01);
    hilera1.appendChild(celda02);
    hilera1.appendChild(celda03);
    hilera1.appendChild(celda04);
    hilera1.appendChild(celda05);
    hilera1.appendChild(celda06);
    hilera1.appendChild(celda07);
    hilera1.appendChild(celda08);
    hilera1.appendChild(celda09);
    hilera1.appendChild(celda010);
    hilera1.appendChild(celda011);
    hilera1.appendChild(celda012);
    tblBody.appendChild(hilera1);
    tblBody.setAttribute("border", 2);

    for (var i = 0; i < cantidadRecuperada; i++) {
        // Crea las hileras de la tabla
        var hilera = document.createElement("tr");
        var celda1 = document.createElement("td");
        var recuNombre = xmlDoc.getElementsByTagName("ns2:nombre")[i].childNodes[0].nodeValue;
        var nombre = document.createTextNode(recuNombre);
        celda1.appendChild(nombre);

        var celda2 = document.createElement("td");
        var recuApellido = xmlDoc.getElementsByTagName("ns2:apellidos")[i].childNodes[0].nodeValue;
        var apellido = document.createTextNode(recuApellido);
        celda2.appendChild(apellido);

        var celda3 = document.createElement("td");
        var recuNumCelu = xmlDoc.getElementsByTagName("ns2:numCelular")[i].childNodes[0].nodeValue;
        var celular = document.createTextNode(recuNumCelu);
        celda3.appendChild(celular);

        var celda4 = document.createElement("td");
        var recuCalle = xmlDoc.getElementsByTagName("ns2:calle")[i].childNodes[0].nodeValue;
        var calle = document.createTextNode(recuCalle);
        celda4.appendChild(calle);

        var celda5 = document.createElement("td");
        var recuNumCasa = xmlDoc.getElementsByTagName("ns2:numCasa")[i].childNodes[0].nodeValue;
        var numCasa = document.createTextNode(recuNumCasa);
        celda5.appendChild(numCasa);

        var celda6 = document.createElement("td");
        var recuColonia = xmlDoc.getElementsByTagName("ns2:colonia")[i].childNodes[0].nodeValue;
        var colonia = document.createTextNode(recuColonia);
        celda6.appendChild(colonia);

        var celda7 = document.createElement("td");
        var recuCiudad = xmlDoc.getElementsByTagName("ns2:ciudad")[i].childNodes[0].nodeValue;
        var ciudad = document.createTextNode(recuCiudad);
        celda7.appendChild(ciudad);

        var celda8 = document.createElement("td");
        var recuEstado = xmlDoc.getElementsByTagName("ns2:estado")[i].childNodes[0].nodeValue;
        var estado = document.createTextNode(recuEstado);
        celda8.appendChild(estado);

        var celda9 = document.createElement("td");
        var recuPais = xmlDoc.getElementsByTagName("ns2:pais")[i].childNodes[0].nodeValue;
        var pais = document.createTextNode(recuPais);
        celda9.appendChild(pais);

        var celda10 = document.createElement("td");
        var recuPuesto = xmlDoc.getElementsByTagName("ns2:puesto")[i].childNodes[0].nodeValue;
        var puesto = document.createTextNode(recuPuesto);
        celda10.appendChild(puesto);

        var celda11 = document.createElement("td");
        var recuSalario = xmlDoc.getElementsByTagName("ns2:salario")[i].childNodes[0].nodeValue;
        var salario = document.createTextNode(recuSalario);
        celda11.appendChild(salario);

        var celda12 = document.createElement("td");
        var recuNumSucur = xmlDoc.getElementsByTagName("ns2:numSucursal")[i].childNodes[0].nodeValue;
        var sucursal = document.createTextNode(recuNumSucur);
        celda12.appendChild(sucursal);


        hilera.appendChild(celda1);
        hilera.appendChild(celda2);
        hilera.appendChild(celda3);
        hilera.appendChild(celda4);
        hilera.appendChild(celda5);
        hilera.appendChild(celda6);
        hilera.appendChild(celda7);
        hilera.appendChild(celda8);
        hilera.appendChild(celda9);
        hilera.appendChild(celda10);
        hilera.appendChild(celda11);
        hilera.appendChild(celda12);

        tblBody.appendChild(hilera);
    }
    // posiciona el <tbody> debajo del elemento <table>
    tabla.appendChild(tblBody);
    // appends <table> into <body>
    body.appendChild(tabla);
    // modifica el atributo "border" de la tabla y lo fija a "2";
    tabla.setAttribute("border", "5");
    tabla.setAttribute("border-collapse", "separate");
}
function limpiar(){
    document.getElementById("a").value="";
}