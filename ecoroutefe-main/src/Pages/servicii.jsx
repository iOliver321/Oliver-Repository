import React from 'react';
import '../Design/index.css'; // Import your CSS file where you define styles
import '../Design/servicii.css';
import N20 from '../../poze/02N20Twhitetrans.png';

function App() {


  return (
    <div className="container">
      <div className="gradient-background">
        <div className="content">
          <div className="textSubLogo">
            <p>serviciile N20</p>
            <button className="button">UN BUTON RANDOM CARE NU FACE NIMIC</button>
          </div>
          <div class="stage-box">
            <h2>DPF Off</h2>
            <p>Description of Stage 1</p>
          </div>
          <div class="stage-box">
            <h2>Remediere Ad-Blue</h2>
            <p>Description of Stage 2</p>
          </div>
          <div class="stage-box">
            <h2>Ce o mai fi</h2>
            <p>Description of Stage 3</p>
          </div>
        </div>
      </div>
    </div>
  );
  
  
}
  

export default App;


