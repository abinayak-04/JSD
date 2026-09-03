const {MongoClient}=require("mongodb")
var exp=require("express")
var app=new exp()
//get method API
app.get("/delfun",async(req,res)=>{

    var client=new MongoClient("mongodb://127.0.0.1:27017/")
    client.connect()
    const data={"user":req.query.un};
    res.write("<h1>Delete Record </h1>")
    try{
        const result=await client.db("jsd").collection("login").deleteOne(data)
        console.log(result)
        if(result.deletedCount===1){
            res.write("<h2>Deleted Successfully!</h2>")
        }
        else{
            res.write("<h2>Data not found</h2>")
        }
    }
    catch{
        console.log("error")
        res.write("<font color='red' size='6'>Error</font>")

    }

    res.end()
}).listen(8994)
console.log("Port listening at 8994.........")