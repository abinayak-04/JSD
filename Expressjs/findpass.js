const {MongoClient}=require("mongodb")
var exp=require("express")
var app=new exp()
//get method API
app.get("/findpassfun",async(req,res)=>{

    var client=new MongoClient("mongodb://127.0.0.1:27017/")
    client.connect()
    const data={"user":req.query.un};
    res.write("<h1>Your password is: </h1>")
    try{
        const result=await client.db("jsd").collection("login").find(data).toArray()
        console.log(result)
        var len=result.length;
        if(len===1){
            res.write("<h2>"+result[0].pwd+"</h2>")
        }
        else{
            res.write("<h2>No data found</h2>")
        }
    }
    catch{
        console.log("error")
        res.write("<font color='red' size='6'>Error</font>")

    }

    res.end()
}).listen(8993)
console.log("Port listening at 8993.........")