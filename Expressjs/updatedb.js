const {MongoClient}=require("mongodb")
var exp=require("express")
var app=new exp()
//get method API
app.get("/updatefun",async(req,res)=>{

    var client=new MongoClient("mongodb://127.0.0.1:27017/")
    client.connect()
    const data={"user":req.query.un};
    res.write("<h1>Update password by username </h1>")
    try{
        const result=await client.db("jsd").collection("login").updateOne(data,{$set:{"pwd":req.query.pwd}})
        console.log(result)
        if(result.modifiedCount===1){
            res.write("<h1>Updated successfully</h1>")
        }
        else{
            res.write("<h1>No data found</h1>")
        }
       
    }
    catch{
        console.log("error")
        res.write("<font color='red' size='6'>Error</font>")

    }

    res.end()
}).listen(8995)
console.log("Port listening at 8995.........")