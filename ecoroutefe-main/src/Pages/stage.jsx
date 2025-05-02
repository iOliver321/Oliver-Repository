import React, { useState } from 'react';
import '../Design/index.css'; // Import your CSS file where you define styles
import '../Design/stage.css';
import N20 from '../../poze/02N20Twhitetrans.png';

function App() {
  const [selectedBrand, setSelectedBrand] = useState(null);

  const handleBrandChange = (event) => {
    setSelectedBrand(event.target.value);
  };

  return (
    <div className="container">
      <div className="gradient-background">
        <div className="content">
          <div className="textSubLogo">
            <p>o lista cu preturi la stage-uri</p>
            <button className="button">UN BUTON RANDOM CARE NU FACE NIMIC</button>
          </div>
          <div className="stage-box">
            <h2>Stage 1</h2>
            <p>Description of Stage 1</p>
          </div>
          <div className="stage-box">
            <h2>Stage 2</h2>
            <p>Description of Stage 2</p>
          </div>
          <div className="stage-box">
            <h2>Stage 3</h2>
            <p>Description of Stage 3</p>
          </div>
        </div>
      </div>
      </div>
  );
}

export default App;
