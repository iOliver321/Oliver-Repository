import axios from "axios";
import TokenManager from "./TokenManager";

const SignUpAPI = {
  signup: async (username, password, postalcode) => {
    try {
      const response = await axios.post('http://localhost:8080/signup', { username, password, postalcode });
      return response.data;
    } catch (error) {
      throw error;
    }
  },
};

export default SignUpAPI;