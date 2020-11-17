import express from 'express';

const app = express();

app.get('/', (req, res) => res.send('Hello Node.js!'));

app.listen(8080, () => console.log('App listening on port 8080!'));
