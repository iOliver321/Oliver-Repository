import React from 'react';
import '../Design/index.css'; // Import your CSS file where you define styles
import N20 from '../../poze/02N20Twhitetrans.png';

function App() {

  const logoMare = {
    width: '500px', // Adjust width as needed
    height: 'auto', // Maintain aspect ratio
  };

  return (
    <div className="container">
      <div className="gradient-background">
        <div className="content">
          <img src={N20} alt="Your Description" style={logoMare} />
          <div className="textSubLogo">
            <p>RIDICA PERFORMANTELE MASINII TALE LA ALT NIVEL</p>
            <button className="button">VEZI SERVICIILE</button>
          </div>
        </div>
      </div>
    </div>
  );
  
  
}
  

export default App;


