import React from 'react';
import Home from './components/Home'; // Import the Home component
import './App.css';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import LoginPage from './components/LoginPage';
import RegistrationPage from './components/RegistrationPage';
import FAQ from './components/Faq';


function App() {
  return (
    <BrowserRouter>   

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/basic info" element={<BasicInfo />} />
        <Route path="/faq" element={<FAQ />} />
        <Route path="/enquiry" element={<Enquiry />} />
        <Route path="/login" element={<LoginPage />} />
        <Route path="/register" element={<RegistrationPage />} />
      </Routes>
    </BrowserRouter>
  );
}

 App;
export default App;
