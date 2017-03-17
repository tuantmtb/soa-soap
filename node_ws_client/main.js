var soap = require('soap');
var url = 'http://localhost:9999/ws/calculator?wsdl';
var args = {
    a: 1,
    b: 2
};

soap.createClient(url, function (err, client) {
    client.getHelloWorldAsString(args, function (err, result) {
        console.log(result);
    });
});