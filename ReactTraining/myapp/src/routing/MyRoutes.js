import {BrowserRouter , Route , Switch} from "react-router-dom"
import Login from './Login'
import Register from './Register'
import UserDetails from './UserDetails'
import Portfolio from './Portfolio'
import NotFound from './404'
import Header1 from './Header'


function MyRoutes(){
   
    return(
    <div>
    {routes}    
       </div>
    
    )

}
export default MyRoutes


const routes=(
    <BrowserRouter>
<Header1/>
<Switch>
<Route path='/' component={Login} exact={true}/>
<Route path='/register' component={Register}/>
<Route path='/portfolio' component={Portfolio}/>
<Route path='/userdetails/:id' component={UserDetails}/>
<Route component={NotFound}/>
</Switch>
</BrowserRouter>

)