//import events
var events=require("events")
//create object to event emitter
var eventEmitter=new events.EventEmitter();
//bind event(called)
eventEmitter.on("test",()=>{
    console.log("Events called")
})

//fire event(calling)
eventEmitter.emit("test")
eventEmitter.emit("test")
eventEmitter.emit("test")