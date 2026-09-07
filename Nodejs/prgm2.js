//callback:synchronous:server waits for other process to complete their execution line by line.
var fs=require("fs")
var data=fs.readFileSync("prgm2.txt")
console.log("Answer:"+data.toString())
console.log("Program end")