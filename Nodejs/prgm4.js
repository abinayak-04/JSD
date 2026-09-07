//import events
var events=require("events")
//create object to event emitter
var eventEmitter=new events.EventEmitter();
//bind event(called)
const dis=()=>{
    console.log("Events called")
}
eventEmitter.on("test",dis)

//fire event(calling)
eventEmitter.emit("test")
eventEmitter.emit("test")
eventEmitter.emit("test")