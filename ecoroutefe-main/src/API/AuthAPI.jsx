import axios from "axios";
import TokenManager from "./TokenManager";

const AuthAPI = {
    login: (username, password) => axios.post('http://localhost:8080/tokens', { username, password })
        .then(response => response.data.accessToken)
        .then(accessToken => TokenManager.setAccessToken(accessToken)),

    isAuthenticated: () => {
        const storedToken = TokenManager.getAccessToken();
        return !!storedToken; // Returns true if token exists, false otherwise
    },
    
    // Function to get the stored token
    getStoredToken: () => TokenManager.getAccessToken(),

    // Function to clear the stored token (logout)
    logout: () => {
        TokenManager.clear();
    }
}

export default AuthAPI;
