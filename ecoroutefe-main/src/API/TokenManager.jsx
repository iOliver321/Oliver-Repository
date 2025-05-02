import jwt_decode from "jwt-decode";

const storageKey = "accessToken";

const userData = {
    accessToken: sessionStorage.getItem(storageKey),
    claims: undefined,
};

const TokenManager = {
    getAccessToken: () => userData.accessToken,
    getClaims: () => userData.claims,
    setAccessToken: (token) => {
        userData.accessToken = token;
        sessionStorage.setItem(storageKey, token);

        const claims = jwt_decode(token);
        userData.claims = claims;
        // Store claims in session storage or local storage
        sessionStorage.setItem("claims", JSON.stringify(claims));
        // Alternatively, you can use localStorage.setItem("claims", JSON.stringify(claims));
        return claims;
    },
    clear: () => {
        userData.accessToken = undefined;
        userData.claims = undefined;
        sessionStorage.removeItem(storageKey);
        sessionStorage.removeItem("claims");
        // Alternatively, you can use localStorage.removeItem("claims");
    },
};

export default TokenManager;
