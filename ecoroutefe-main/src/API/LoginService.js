import axios from 'axios';

const baseURL = "http://localhost:8080";

class LoginService {
  static async login(username, password) {
    try {
      const response = await axios.post(`${baseURL}/tokens`, {
        username: username,
        password: password,
      });

      // Assuming your server returns a token or user information upon successful login
      return response.data;
    } catch (error) {
      // Handle errors, such as invalid credentials
      throw error;
    }
  }
}

export default LoginService;
