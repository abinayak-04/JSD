import React from 'react'
import axios from 'axios'
import { useState } from 'react'

export default function App() {
  const[city,setCity]=useState("")
  //const [result,setResult]=useState(null);
  const cityFun=(Event)=>{
    setCity(Event.target.value)
  }
  const show=()=>{
    const apiurl=`https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=31e42a3a3beb9f81fcd50d1ba50adf58`
    axios.get(apiurl).then((response)=>{
      //setResult(response.data)
      console.log(response.data)
    })
    //console.log(apiurl)
  }
  return (
    <div>
      <h1><center>Weather Report all over world</center></h1>
      <h2><center>by using city name</center></h2>
      <h2><center>Developed by K.Abinaya DCPE.,B.E.,</center></h2>
      <hr></hr>
      <center>
      <input type="text" value={city} onChange={(e)=>{cityFun(e)}} name="city" placeholder='Enter city name'></input><br></br>
      <input type="button" value="Find weather report" onClick={show}></input> 
      </center>
      <hr></hr>
    </div>
   
  )
}

/*import React from 'react'
function App() {
  let dis=()=>{
    var tags=document.getElementsByTagName("input");
    var size=tags.length;
    var sum=0;
    document.getElementById("res1").innerHTML="Textbox count:"+size;
    for(var i=0 ;i<size;i++){
      sum=sum+parseInt(tags[i].value);
    }
    document.getElementById("res").innerHTML="Total:"+sum;

   //var m1=parseInt(document.getElementById("t1").value);
    //var m2=parseInt(document.getElementById("t2").value);
    //var m3=parseInt(document.getElementById("t3").value);
    //var m4=parseInt(document.getElementById("t4").value);
    //var m5=parseInt(document.getElementById("t5").value);
    //var tot=m1+m2+m3+m4+m5;
    //document.getElementById("res").innerHTML="total"+tot;

  }
  return (
    <div>
      <h1>forms</h1>
      <input type="text" placeholder="mark1" id="t1"></input><br></br>
      <input type="text" placeholder="mark2" id="t2"></input><br></br>
      <input type="text" placeholder="mark3" id="t3"></input><br></br>
      <input type="text" placeholder="mark4" id="t4"></input><br></br>
      <input type="text" placeholder="mark5" id="t5"></input><br></br>
      <button onClick={dis}>Find total</button>
      <div id="res"></div>
      <div id="res1"></div>
    </div>
  )
}

export default App*/

/*import React from 'react'
function App() {
  const dis=(event)=>{
    document.getElementById("res").innerHTML="You are currently working on "+event.target.type;
  }
  return (
    <div>
      <input type='text' placeholder='text' onChange={dis}></input><br></br>
      <input type='password' placeholder='password' onChange={dis}></input><br></br>
      <input type='radio' name="ans" onChange={dis}></input>yes<br></br>
      <input type='radio' name="ans" onChange={dis}></input>No<br></br>
      <input type="checkbox" onChange={dis}></input>c
      <input type="checkbox" onChange={dis}></input>c++
      <input type="checkbox" onChange={dis}></input>c#<br></br>
      <div id="res"></div>
    </div>
  )
}
export default App*/

/*import React from 'react'
function App() {
  const dis=(event)=>{
    document.getElementById("res").innerHTML=event.target.id+"...typing";
  }
  return (
    <div>
      <input type='text' id="textbox 1" placeholder='textbox 1' onChange={dis}></input><br></br>
      <input type='text' id="textbox 2" placeholder='textbox 2'onChange={dis}></input><br></br>
      <input type='text' id="textbox 3" placeholder='textbox 3'onChange={dis}></input>
      <div id="res"></div>
    </div>
  )
}
export default App*/

/*import React from 'react'
function App() {
  const dis=()=>{
    var n1=parseInt(document.getElementById("t1").value);
    var n2=parseInt(document.getElementById("t2").value);
    var tot=n1+n2;
    document.getElementById("res").innerHTML="Total:"+tot;
  }
  return (
    <div>
      <input type='text' id='t1' placeholder='enter no. 1'></input>
      <input type='text' id='t2' placeholder='enter no. 2'></input>
      <br></br>
      <button onClick={dis}>Find total</button>
      <div id="res"></div>
    </div>
  )
}
export default App*/

/*import React from 'react'
function App() {
  const dis=()=>{
    document.getElementById("res").innerHTML="Cursor outside textbox";
    document.getElementById("t1").style.backgroundColor="pink";
  }
  const dis1=()=>{
    document.getElementById("res").innerHTML="Cursor inside textbox";
    document.getElementById("t1").style.backgroundColor="gold"
  }
  return (
    <div>
      <input type='text' id='t1' onBlur={dis} onFocus={dis1} placeholder='Enter your text'></input>
      <div id='res'></div>
    </div>
  )
}
export default App*/

/*import React from 'react'
function App() {
  const dis=(event)=>{
    var data=event.target.value;
    document.getElementById("res").innerHTML=data+"....typing";
  }
  return (
    <div>
      <h1>React Events</h1>
      <input type="text" placeholder='enter text' onChange={dis}></input>
      <br></br>
      <div id="res"></div>
    </div>
  )
}

export default App*/

/*import React from 'react'
function App() {
  return (
    <form>
      <h2>React Forms</h2>
      <input type="text" id="t1" placeholder='Enter mark1'></input>
      <br></br>
      <input type="text" id="t2" placeholder='Enter mark2'></input>
      <br></br>
      <input type="text" id="t3" placeholder='Enter mark3'></input>
      <br></br>
      <input type="text" id="t4" placeholder='Enter mark4'></input>
      <br></br>
      <input type="text" id="t5" placeholder='Enter mark5'></input>
      <br></br>
      <input type="password" id="pwd" placeholder='enter password'></input>
      <br></br>
      <input type="number" id="no" placeholder='enter number'></input>
      <br></br>
      <label>Select Gender: </label>
      <input type="radio" id="g1" name="gen"></input>Female
      <input type="radio" id="g2" name="gen"></input>Male
      <input type="radio" id="g3" name="gen"></input>Others
      <br></br>
      <label>Select Course: </label>
      <input type="checkbox" id="c1"></input>java
      <input type="checkbox" id="c2" ></input>c
      <input type="checkbox" id="c3"></input>c#
      <br></br>
      <label>color:</label>
      <input type="color" id="col"></input>
      <br></br>
      <label>Date:</label>
      <input type="date" id="date"></input>
      <br></br>
      <label>Time:</label>
      <input type="time" id="time"></input>
      <br></br>
      <label>File:</label>
      <input type="file" id="file"></input>
      <br></br>
      <input type="button" value="click"></input>
      <input type="submit" value="submit"></input>
      <input type="reset" value="clear"></input>
      <button>login</button>

    </form>
  )
}

export default App*/

/*import React from 'react'
export default function App(props) {
  var arr=[];
for(var k in props.data){
  arr.push(k);
}
  return (
    <div>
      <h1>Student details</h1>
      <h2>Roll no:{props.data.rno}</h2>
      <h2>Name:{props.data.sname}</h2>
      <h2>Mark 1:{props.data.marks[0]}</h2>
      <h2>Mark 2:{props.data.marks[1]}</h2>
      <h2>Mark 3:{props.data.marks[2]}</h2>
      <h2>Result:{(props.data.marks[0]>34 && props.data.marks[1]>34 && props.data.marks[2]>34)?"Pass":"fail"}</h2> <br></br>
      <hr></hr>
      <h2>Another way of displaying results</h2>
      {arr.map((s)=><h2>{s} :{props.data[s] || ((props.data.marks[0]>34 && props.data.marks[1]>34 && props.data.marks[2]>34)?"Pass":"fail") || (s==="marks" && props.data[s].map((v,i)=><><br></br>Mark:{i+1} :{v}</>))|| props.data[s]}</h2>) }
      <hr></hr>
      {arr.map((s)=><><br></br>{s}  :{((s==="marks") && props.data[s].map((v,i)=><><br></br>Mark{i+1} :{v}</>))||(props.data[s]) || ((props.data.marks[0]>34 && props.data.marks[1]>34 && props.data.marks[2]>34)?"Pass":"fail")}</>)}
    </div>
  )
}*/

/*import React from 'react'
export default function App(props) {
  var arr=[]
  for(var k in props.data){
    arr.push(k)
  }
  return (
    <div>
      <h1>props with json</h1>
      <h2>Student Roll no: {props.data.rno}</h2>
      <h2>Student Name: {props.data.sname}</h2>
      <h2>Student Mark: {props.data.mark}</h2>
      <h2>Student Result: {props.data.mark>=35?"Pass":"Fail"}</h2>
      <h2>Student eligiblibity: {props.data.iseligible?"yes eligible to study":"no not eligible"}</h2><br></br>
    <h2>--------------------------------------------------------</h2>
    <h2>printing using for loop</h2>
    {arr.map((s)=><h2>{s}--------&gt;{props.data[s]===true?"eligible":props.data[s]}</h2>)}
    <h2>-----------------------------task---------------------------</h2>
    <h2>printing using for loop</h2>
    {arr.map((s)=><h2>{s}---------&gt;{props.data[s]===true &&"eligible"||props.data[s]===false &&"not eligible"||props.data[s]}</h2>)}
    </div>
  )
}*/

/*import React from 'react'
function App(props) {
  return (
    <div>
      <h1>props using array</h1><br></br>
      {props.data.map((m,n)=><>Mark {n+1}:{m}<br></br></>)}
    </div>
  )
}
export default App*/

/*import React from 'react'
function App(props) {
  return (
    <div>
      <h1>props:properties</h1>
      <h1>share data from one component to another component</h1>
      <h2>Your name:{props.data}</h2>
    </div>
  )
}

export default App*/

/*import React from 'react'

function App() {
  var stud={
    sno:1001,
    sname:"Abinaya",
    marks:{
      tamil:100,
      english:90,
      maths:98,
      science:85
    },
    rank:1,
    result:"Pass"
  }
  return (
    <div>
      <h1>Json Basics</h1>
      <h2>Student Number:{stud.sno}</h2>
      <h2>Student Name:{stud.sname}</h2>
      <h2>Student Marks:</h2>
      <h2>Tamil:{stud.marks.tamil}</h2>
      <h2>English:{stud.marks['english']}</h2>
      <h2>Maths:{stud.marks.maths}</h2>
      <h2>Science:{stud.marks['science']}</h2>
      <h2>Student Rank:{stud.rank}</h2>
      <h2>Student Result:{stud.result}</h2>
    </div>
  )
}

export default App*/

/*import React from 'react'
function App() {
  var arr=[11,22,33,44,55,66,77,88,99];
  var big=arr[0];
  return (
    <div>
      <h1>Array Demo</h1>
      {arr.map((item)=>item)}
      <br></br>
      {arr.map((item)=><> {item}</>)}
      <br></br>
      {arr.map((item)=><><br></br>{item}</>)}
      <ol type="I">
        {arr.map((i)=><li>{i}</li>)}
      </ol>
      <br></br>
      <h1>Find highest number</h1>
      <div style={{display:"none"}}>
        {arr.map((v)=><>{big<v &&<>{big=v}</>}</>)}
      </div>
        <h1>Biggest Number:{big}</h1>

    </div>
  )
}

export default App*/

/*import React from 'react'
export default function App() {
  var arr=[11,22,33,44,55,66,77];
  return (
    <div>
      <h1>Array Demo</h1>
      <h2>Array value index 0:{arr[0]}</h2>
      <h2>Array value index 1:{arr[1]}</h2>
      <h2>Array value index 2:{arr[2]}</h2>
      <h2>Array value index 3:{arr[3]}</h2>
      <h2>Array value index 4:{arr[4]}</h2>
      <h2>Array value index 5:{arr[5]}</h2>
      <h2>Array value index 6:{arr[6]}</h2>
    </div>
  )
}*/
/*import React from 'react'
function App() {
  var mark=30;
  //var res="pass"
  var res="fail"
  return (
    <div>
      <h1>if elseif else ladder(nested if)</h1>
      <h1>Grading based on mark</h1>
      <h2>Mark:{mark}</h2>
      <h2>The grade for mark {mark} is {(res==="pass" && ((mark>=85 && "Outstanding") || (mark>=75 && "Excellent")||(mark>=65 && "Very good")||(mark>=55 && "Good")||"Fair"))|| "No grade"}</h2>
    </div>
  )
}
export default App*/
/*import React from 'react'
function App() {
  var n=-20;
  return (
    <div>
      <h1>if elseif else ladder</h1>
      <h1>Find positive or negative or zero of a number</h1>
      <h2>Number:{n}</h2>
      <h2>The number {n} is {(n>0 && "Positive") || (n<0 && "Negative")||"zero"}</h2>
    </div>
  )
}
export default App*/
/*import React from 'react'
function App() {
  var y=2026;
  return (
    <div>
      <h1>Leap Year or not</h1>
      <h2>Year:{y}</h2>
      <h2>The year {y} is {(y%4===0 && "a leap year") || "not a leap year"}</h2>
    </div>
  )
}
export default App*/
/*import React from 'react'
function App() {
  var n=31;
  return (
    <div>
      <h1>Check even or odd</h1>
      <h2>Number:{n}</h2>
      <h2>The number {n} is {(n%2===0 && "Even") || "Odd"}</h2>
    </div>
  )
}
export default App*/
/*import React from 'react'
function App() {
  var n1=30;
  var n2=90;
  return (
    <div>
      <h1>Find Greatest number</h1>
      <h2>Number 1:{n1}</h2>
       <h2>Number 2:{n2}</h2>
      <h2>The greatest number is: {(n1>n2 && n1) || n2}</h2>
    </div>
  )
}
export default App*/
/*import React from 'react'
function App() {
  var mark=30;
  return (
    <div>
      <h1>if else statement</h1>
      <h2>Mark:{mark}</h2>
      <h2>Result</h2>
      <h2>{(mark>34 && "Pass") || "Fail"}</h2>
    </div>
  )
}
export default App*/
/*import React from 'react'
function App() {
  var mark=40;
  return (
    <div>
      <h1>Simple if</h1>
      <h2>Mark:{mark}</h2>
      <h2>Result</h2>
      <h2>{mark>34 && "Pass"}</h2>
      <h2>{mark<=34 && "Fail"}</h2>
    </div>
  )
}
export default App */


/*import './App.css'
import React from 'react'
import myimg from './Images/waterfalls.jpg'
function App() {
  return (
    <div align="center">
      <img src={myimg} width="50%" alt="not found"></img>
    </div>
  )
}
export default App;*/

/*var App=()=>{
  var a=10
  var b=20
  var c=30
  return(
  <>
  <h1>Adition of three numbers</h1>
  <h2>Value of A:{a}</h2>
  <h2>Value of B:{b}</h2>
  <h2>Value of C:{c}</h2>
  <h2>Total:{a+b+c}</h2>
  </>
  )
}
export default App;*/
/*import React from "react";
class App extends React.Component
{
  render(){
  return(
    <>
  <h1>Welcome to react js of class component</h1>
   <h1>Welcome to react js of class component</h1>
   <h1>Welcome to react js of class component</h1>
   </> 
)
}
}
export default App;*/

/*function App(){
  return(
    <>
  <h1>Welcome to react js</h1>
   <h1>Welcome to react js</h1>
   <h1>Welcome to react js</h1>
   </> 
)
}
export default App;*/

/*
import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
*/