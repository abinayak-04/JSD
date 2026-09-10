const {MongoClient}=require("mongodb")
var exp=require("express")
var app=new exp()
var usr,pwd;
app.post("/curd",async(req,res)=>{
    usr=req.query.un;
    pwd=req.query.pwd;

    const data={"user":usr,"pwd":pas}
    var client=new MongoClient("mongodb://127.0.0.1:27017/")
    client.connect()
    
    
})
