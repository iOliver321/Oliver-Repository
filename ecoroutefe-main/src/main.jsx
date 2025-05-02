// index.jsx (or index.js)
import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';

import Index from "./Pages/index";
import Selectare_masina from "./Pages/selectare_masina";
import Oferte from "./Pages/oferte";
import Contact from "./Pages/contact";
import Despre from "./Pages/despre";
import Servicii from "./Pages/servicii";
import Stage from "./Pages/stage";

import N20 from '../poze/02N20Twhitetrans.png';
import './Design/navbar.css';

ReactDOM.createRoot(document.getElementById('root')).render(
  
  <Router>
    <nav className="navbar">
        <div className="container">
          <ul className="nav-links">
          <li><a href="/"><img src={N20} alt="Your Description" className="logo-nav" /></a></li>

            <li><a href="/marci">MARCI</a></li>
            <li><a href="/oferte">OFERTE</a></li>
            <li><a href="/despre">DESPRE N2O</a></li>
            <li><a href="/servicii">SERVICII</a></li>
            <li><a href="/stage">STAGE</a></li>
            <li><a href="/contact">CONTACT</a></li>
          </ul>
        </div>
      </nav>
    <div>
      <Routes>
        <Route path="/" element={<Index />} />
        <Route path="/marci" element={<Selectare_masina />} />
        <Route path="/oferte" element={<Oferte />} />
        <Route path="/despre" element={<Despre />} />
        <Route path="/servicii" element={<Servicii />} />
        <Route path="/stage" element={<Stage />} />
        <Route path="/contact" element={<Contact />} />
      </Routes>
    </div>
  </Router>
);

