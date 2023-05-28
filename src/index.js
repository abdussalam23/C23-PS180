const express = require('express');
const multer = require('multer');
const userRoute = require('./routes/userRoute');
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

app.use(userRoute);
app.post('/', upload.single('test'), (req, res) => {
  console.log(req.file);
  res.send(req.file);
});

app.listen(3000, () => {
  console.log('Server running on PORT 3000');
});
