import React, { useState } from 'react';
import '../Design/selectare_masina.css'; // Import your CSS file where you define styles
import N20 from '../../poze/02N20Twhitetrans.png';
import carData from '../components/carData.js'

function App() {
  const [selectedMarca, setSelectedMarca] = useState('');
  const [selectedModel, setSelectedModel] = useState('');
  const [selectedYear, setSelectedYear] = useState('no year');
  const [selectedEngine, setSelectedEngine] = useState('');
  const [stockHorsepower, setStockHorsepower] = useState('');
  const [stockTorque, setStockTorque] = useState('');
  const [stage1Horsepower, setStage1Horsepower] = useState('');
  const [stage1Torque, setStage1Torque] = useState('');
  const [step, setStep] = useState(1); // Include step state

  const handleMarcaChange = (event) => {
    setSelectedMarca(event.target.value);
    resetSelections(); // Reset other selections
    setStep(2); // Proceed to step 2
  };

  const handleModelChange = (event) => {
    setSelectedModel(event.target.value);
    resetSelections(); // Reset other selections
    setStep(3); // Proceed to step 3
  };

  const handleYearChange = (event) => {
    setSelectedYear(event.target.value);
    resetSelections(); // Reset other selections
    console.log(selectedModel, selectedYear);
    setStep(4); // Proceed to step 4
  };
  
  const handleEngineChange = (event) => {
    setSelectedEngine(event.target.value);
    const engineData =
      carData[selectedMarca][selectedModel][selectedYear]['Engines'][
        event.target.value
      ];
    setStockHorsepower(engineData.StockHorsepower);
    setStockTorque(engineData.StockTorque);
    setStage1Horsepower(engineData.Stage1Horsepower);
    setStage1Torque(engineData.Stage1Torque);
    resetSelections(); // Reset other selections
    setStep(5); // Proceed to step 5
  };

  const resetSelections = () => {
    //setSelectedYear('');
    //setSelectedEngine('');
  };

  const handleSummarySubmit = () => {
    console.log('Summarized Details:');
    console.log('Marca:', selectedMarca);
    console.log('Model:', selectedModel);
    console.log('An:', selectedYear);
    console.log('Motorizare:', selectedEngine);
    console.log('Stock Horsepower:', stockHorsepower);
    console.log('Stock Torque:', stockTorque);
    console.log('Stage 1 Horsepower:', stage1Horsepower);
    console.log('Stage 1 Torque:', stage1Torque);
  };

  return (
    <div className="container">
      <div className="gradient-background">
        <div className="content">
          {step === 1 && (
            <div className="textSubLogo">
              <p>CE MASINA AI?</p>
              <select
                className="textInput"
                value={selectedMarca}
                onChange={handleMarcaChange}
              >
                <option value="">Selectează marca...</option>
                {Object.keys(carData).map((marca, index) => (
                  <option key={index} value={marca}>
                    {marca}
                  </option>
                ))}
              </select>
            </div>
          )}
          {step === 2 && (
            <div className="textSubLogo">
              <p>CE MODEL AI?</p>
              <select
                className="textInput"
                value={selectedModel}
                onChange={handleModelChange}
              >
                <option value="">Selectează model...</option>
                {Object.keys(carData[selectedMarca]).map((model, index) => (
                  <option key={index} value={model}>
                    {model}
                  </option>
                ))}
              </select>
            </div>
          )}
          {step === 3 && selectedMarca && selectedModel && (
            <div className="textSubLogo">
              <p>CE AN ESTE MASINA TA?</p>
              <select
                className="textInput"
                value={selectedYear}
                onChange={handleYearChange}
              >
                <option value="">Selectează an...</option>
                {Object.keys(carData[selectedMarca][selectedModel]).map((year, index) => (
                  <option key={index} value={year}>
                    {year}
                  </option>
                ))}
              </select>
            </div>
          )}


          {step === 4 && selectedMarca && selectedModel &&  (
            <div className="textSubLogo">
              <p>CE MOTOR ARE MASINA TA?</p>
              <select
                className="textInput"
                value={selectedEngine}
                onChange={handleEngineChange}
              >
                <option value="">Selectează motor...</option>
                {Object.keys(
                  carData[selectedMarca][selectedModel][selectedYear]['Engines']).map((engine, index) => (
                  <option key={index} value={engine}>
                    {engine}
                  </option>
                ))}
              </select>
            </div>
          )}

          {step === 5 && (
            <div className="summary">
              <h2>Detalii Selecție:</h2>
              <p>
                <strong>Marca:</strong> {selectedMarca}
              </p>
              <p>
                <strong>Model:</strong> {selectedModel}
              </p>
              <p>
                <strong>An:</strong> {selectedYear}
              </p>
              <p>
                <strong>Motorizare:</strong> {selectedEngine}
              </p>
              <p>
                <strong>Stock Horsepower:</strong> {stockHorsepower}
              </p>
              <p>
                <strong>Stock Torque:</strong> {stockTorque}
              </p>
              <p>
                <strong>Stage 1 Horsepower:</strong> {stage1Horsepower}
              </p>
              <p>
                <strong>Stage 1 Torque:</strong> {stage1Torque}
              </p>
              <button onClick={handleSummarySubmit}>Trimite Detalii</button>
            </div>
          )}
        </div>
      </div>
    </div>
  );
}

export default App;
