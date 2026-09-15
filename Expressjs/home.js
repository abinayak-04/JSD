const {MongoClient}=require("mongodb")
var exp=require("express")
var app=new exp()
var usr,pwd;
app.get("/curd",async(req,res)=>{
    usr=req.query.usr;
    pwd=req.query.pwd;

    const data={"user":usr,"pwd":pwd}
    var client=new MongoClient("mongodb://127.0.0.1:27017/")
    client.connect()
    try{
        const result=await client.db("jsd").collection("login").insertOne(data)
        console.log(result)
        res.write("<font color='green' size='6'>Data inserted successfully!</font>")
    }
    catch{
        console.log("error")
        res.write("<font  color='red' size='6'>Data not inserted</font>")

    }
    res.end();
    
}).listen(9999)
console.log("port listening at 9999.........");

