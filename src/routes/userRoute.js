const express = require('express');
const { getUserHandler, registerUserHandler, loginUserHandler } = require('../controller/UserController');

const spiceRoutes = express.Router();

spiceRoutes.get('/users', getUserHandler);
spiceRoutes.post('/user/register', registerUserHandler);
spiceRoutes.post('/user/login', loginUserHandler);

module.exports = spiceRoutes;
