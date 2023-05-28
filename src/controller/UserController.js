const UserService = require('../services/UserService');

const userService = new UserService();
const getUserHandler = async (req, res) => {
  try {
    const users = await userService.getUsers();
    res.send(users);
  } catch (e) {
    res.send(e.message);
  }
};

const registerUserHandler = async (req, res) => {
  try {
    const { username, password, fullname } = req.body;
    const id = await userService.registerUser({ username, password, fullname });
    res.status(201).json({
      message: 'User berhasil dibuat',
      data: {
        id,
      },
    });
  } catch (e) {
    res.status(400).json({
      status: 'fail',
      message: e.message,
    });
  }
};

const loginUserHandler = async (req, res) => {
  try {
    const { username, password } = req.body;
    const accessToken = await userService.login({ username, password });
    res.status(200).json({
      status: 'success',
      message: 'Login berhasil',
      data: {
        accessToken,
      },
    });
  } catch (e) {
    res.status(400).json({
      status: 'fail',
      message: e.message,
    });
  }
};

module.exports = {
  getUserHandler,
  registerUserHandler,
  loginUserHandler,
};
