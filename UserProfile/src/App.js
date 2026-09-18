import React, { useState } from 'react';
import UserProfile from './UserProfile';
import './App.css';

function App() {
  // Task 3: useState Hook initialized with 'Raja'
  const [name, setName] = useState('Raja');

  // Task 3: handleChange Function updates state on input change
  const handleChange = (e) => {
    setName(e.target.value);
  };

  return (
    <div className="App">
      <div className="container">
        <h1>User Profile Management</h1>
        
        {/* UserProfile Component receiving name state as prop */}
        <UserProfile name={name} />

        {/* Input Field bound to name state with onChange handler */}
        <div className="input-group">
          <label htmlFor="name-input">Update Name: </label>
          <input
            id="name-input"
            type="text"
            value={name}
            onChange={handleChange}
            placeholder="Enter name..."
          />
        </div>
      </div>
    </div>
  );
}

export default App;
