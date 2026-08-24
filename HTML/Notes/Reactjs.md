### Axios
- To maintain restfull API
- It is a third party library.

#### What is the purpose of using useState Hook?
- Runtime data management
- automatically update DOM when state changes.

*Notes*

**Step 1**
- header file:
    - import {useState} from 'react'

**Step 2**
- declaration
    - const [var, setVar] = useState("default value")
        - *Example*
```js 
const [city, setCity] = useState("karur")
```
        
**Step 3**
```js
<input type="text" value={city} onChange={(e) => dis(e)} />
```
**Step 4**
- change the state! (important)
```js
setCity("your value")
```

*Example*
```js 
const dis = (Event) => {
  setCity(Event.target.value)
}
```