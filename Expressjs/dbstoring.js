const {MongoClient}=require("mongodb")
var exp=require("express")
var app=new exp()
var usr,pas;
//get method API
app.get("/testfun",async(req,res)=>{

    usr=req.query.un;
    pas=req.query.pwd;

    const data={"user":usr,"pwd":pas}
    var client=new MongoClient("mongodb://127.0.0.1:27017/")
    client.connect()
    res.write("<h1>Express and MongoDb connected Successfully...</h1>")
    try{
        const result=await client.db("jsd").collection("login").insertOne(data)
        console.log(result)
        res.write("<font color='green' size='6'>Data inserted successfully!</font>")
    }
    catch{
        console.log("error")
        res.write("<font  color='red' size='6'>Data not inserted</font>")

    }

    res.end()
}).listen(8991)
console.log("port listening at 8991.........")