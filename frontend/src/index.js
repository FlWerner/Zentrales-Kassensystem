import React from 'react';
import './index.css';
import reportWebVitals from './reportWebVitals';
import WareList from "./Sites/WareManagement/WareList";
import GuthabenRevision from "./Sites/GuthabenRevision/GuthabenRevision";
import GuthabenAuftrag from "./Sites/GuthabenManagement/GuthabenAuftragList";
import KaeufeList from "./Sites/Kaeufe/KaeufeList";
import Dashboard from "./Sites/Dashboard";
import {BrowserRouter, Routes, Route} from "react-router-dom";
import BenutzerListe from "./Sites/BenutzerManagement/BenutzerList";
import { createRoot } from 'react-dom/client';

//Festlegung des React-Routers, dass die SUB-Websites aufrufbar sind
//Jede Route legt einen Pfad für eine SUB-Website dar


const root = createRoot(document.getElementById("root"));

root.render(
    <BrowserRouter basename={"/app"}>
        <Routes>
            <Route path="/" element={<Dashboard/>}/>
            <Route path="/ware" element={<WareList /> }/>
            <Route path="/guthabenauftraege" element={<GuthabenAuftrag />}/>
            <Route path="/guthabenrevision" element={<GuthabenRevision />}/>
            <Route path="/kaeufe" element={<KaeufeList />}/>
        </Routes>
    </BrowserRouter>

);
reportWebVitals();



