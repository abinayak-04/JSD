buf=new Buffer.from("CSE")
//from:allocate memory for only stred values
console.log(buf)
console.log(buf.toString())
buf.write("EEE",0)
console.log(buf.toString())