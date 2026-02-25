const express = require('express');

const app = express();
const PORT = 3000;

// Middleware to parse JSON
app.use(express.json());

// GET route
app.get('/hello', (req,res)=>{
    res.send('Hello Rutuj 🚀');
});

// POST route
app.post('/data', (req,res)=>{
    //log entire request body
    console.log("Recieved Data:",req.body);

    //send response back
    res.json({
        message: "Data recieved sucessfully!",
        recievedData: req.body
    });
});

app.listen(PORT,()=>{
    console.log(`Server running on http://localhost:${PORT}`);
});