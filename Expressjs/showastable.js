const {MongoClient}=require("mongodb")
var exp=require("express")
var app=new exp()
//get method API
app.get("/show",async(req,res)=>{

    var client=new MongoClient("mongodb://127.0.0.1:27017/")
    client.connect()
    res.write("<h1>Show data from MangoDB</h1>")
    try{
        const result=await client.db("jsd").collection("login").find({}).toArray()
        console.log(result)
        var len=result.length;
        res.write("<font size='6'>Total records available:"+len+"</font>")
        res.write("<table border='2' align='center' cellpadding='20' bgcolor='pink'>")
        res.write("<tr><th>S.No</th><th>User Name</th><th>Password</th></tr>")
        for(i=0;i<len;i++){
            res.write("<tr><td>"+(i+1)+"</td><td>"+result[i].user+"</td><td>"+result[i].pwd+"</td>");
        }
    }
    catch{
        console.log("error")
        res.write("<font color='red' size='6'>Error</font>")

    }

    res.end()
}).listen(8992)
console.log("Port listening at 8992.........")