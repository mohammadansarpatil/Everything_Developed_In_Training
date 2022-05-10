import AuthReducer from "./authReducer";

const { combineReducers} = require("redux")
const {default : counterReducer} = require("./counterReducer");



const appReducer = combineReducers({
    cntr : counterReducer ,
    auth : AuthReducer
})
export default appReducer