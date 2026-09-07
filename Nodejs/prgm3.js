//callback:asynchronous:server never waits for other process.
var fs=require("fs")
fs.readFile("prgm2.txt",(err,res)=>{
    if(err){
        console.log("Error"+err.toString())
    }
    else{
        console.log("Program end:"+res.toString())
    }
})