# Javascript (js)
- In 1995 first introduced by Brendan Eich
- Initial name : LiveScript
- Developed ECMAScript-262 (Organization approved by ISO)
- Only netscape navigator 2.0 first worked
- All browsers worked from 1996.
- JavaScript is a case sensitive language.
- JavaScript extension: .js
- Main use : directly interact with html codes
- Java and JavaScript are different
- Joining/contatination operator: +
- Javascript is a interpreter (line by line error check)
- Javascript is a loosely type checked language
    - Ex:
        - var a = 10; --> integer
        - var b = 10.20; --> float
        - var c = "text@123"; -->string
- console.log(" ") is used to identify the errors
- document.write(" ") prints in the webpage and you can apply html tags into it
- General format
```html
<html>
<head>
    <script type="text/javascript>
    ------------------
    ------------------
    </script>
</head>
<body>
    ------------------
</body>
</html>
```

## Nested loop with js

**Example**
```js
for (var i = 1; i <= 5; i++)
{
    for (var j = 1; j <= 5; j++)
    {
        document.write(" " + i + j);
    }
    document.write("<br>");
}
```

```bash
11 12 13 14 15 
21 22 23 24 25 
31 32 33 34 35 
41 42 43 44 45 
51 52 53 54 55
```
## Arrow function
- It is an another way to use function without using the function keyword.

*Syntax*
```js
var/let/const function_name=()=>{
    -------------------
    -------------------
}
```

**Example**
```js
var rowwisesum=()=>{
            var arr=[[11,22,33],[44,55,66],[77,88,99]];
            var sum=0;
            for(var i=0;i<3;i++){
                for(var j=0;j<3;j++){
                    sum=sum+arr[i][j];
                    document.write(" "+arr[i][j]);
                }
                document.write("="+sum+"<br>");
                sum=0;
            }
```
## Arrow function with parameters or with arguments
**Example**
```js
var add=(a,b,c)=>{
    var tot=a+b+c;
    alert(tot);
}
```
## Regular expression
**Declaration**
```js
var re=/^-----$/;

```
**Example**
```js
var re=/^[0-9]{10}$/;
```