const { Pool } = require('pg');
const { nanoid } = require('nanoid');
const bcrpyt = require('bcrypt');
const jwt = require('jsonwebtoken');

class UserService {
  constructor() {
    this._pool = new Pool();
  }

  async getUsers() {
    const result = await this._pool.query('SELECT * FROM users');
    return result.rows;
  }

  async registerUser({ username, password, fullname }) {
    const isUserExist = await this.checkUserOnDatabase(username);
    if (isUserExist) {
      throw new Error('Username sudah digunakan');
    }
    const id = nanoid(16);
    const newPassword = await bcrpyt.hash(password, 10);
    const query = {
      text: 'INSERT INTO users VALUES($1, $2, $3, $4)',
      values: [id, username, newPassword, fullname],
    };
    const result = await this._pool.query(query);
    if (!result.rowCount) {
      throw new Error('Register gagal');
    }
    return id;
  }

  async checkUserOnDatabase(username) {
    const query = {
      text: 'SELECT * FROM users WHERE username = $1',
      values: [username],
    };
    const result = await this._pool.query(query);
    return result.rowCount;
  }

  async getUserByUsername(username) {
    const query = {
      text: 'SELECT * FROM users WHERE username = $1',
      values: [username],
    };
    const result = await this._pool.query(query);
    return result.rows[0];
  }

  async login({ username, password }) {
    const isUserExist = this.checkUserOnDatabase(username);
    const user = await this.getUserByUsername(username);
    if (!isUserExist) {
      throw new Error('user tidak ditemukan');
    }
    const isMatch = await bcrpyt.compare(password, user.password);
    if (!isMatch) {
      throw new Error('username atau password yang anda masukkan tidak sesuai');
    }
    const acessToken = jwt.sign({ id: user.id, username }, process.env.SECRET_REFRESH_TOKEN);
    return acessToken;
  }
}

module.exports = UserService;
