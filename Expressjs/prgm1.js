var exp=require("express")
var app=new exp()

//get method API
app.get("/testfun",(req,res)=>{

    usr=req.query.un;
    pas=req.query.pwd;

    //res.send("<h1>Welcome to ExpressJs</h1>")
    res.write("<h1>User name: "+usr+"</h1>");
    res.write("<h1>Password: "+pas+"</h1>");
    if(usr==="admin" && pas==="admin@123"){
        res.write("<font color='green' size='7'>Valid User!</font>")
    }
    else{
        res.write("<font color='red' size='7'>Invalid User!!</font>")
    }
    res.end()
}).listen(8991)
console.log("port listening at 8991.........")