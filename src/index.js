const express = require('express');
const multer = require('multer');
require('dotenv').config();

const storage = multer.diskStorage({
  destination: (req, file, cb) => {
    cb(null, './upload');
  },
  filename: (req, file, cb) => {
    const uniqueName = `${+new Date()}}`;
    cb(null, `image-${uniqueName}.${file.originalname}`);
  },
});

const upload = multer({
  storage,
});

const app = express();
app.use(express.urlencoded({ extended: false }));
app.use(express.json());
app.use('/image', express.static('./upload'));
app.get('/', (req, res) => {
  res.send('test');
})

app.post('/', upload.single('test'), (req, res) => {
  console.log(req.file);
  res.send(req.file);
});

const port = process.env.SERVER_PORT || 8080;

app.listen(port, () => {
    console.log(`server running on ${port}`);
})
