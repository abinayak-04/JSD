const http=require("http")
http.createServer(function(req,res){
    res.end("<h1>Welcome to NodeJS</h1>")
}).listen(9090)
console.log("Port listening at 9090.........")