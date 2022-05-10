import { NavLink} from "react-router-dom"


function Header1(){
    return(
        <Header/>
    )
}
export default Header1


const Header=()=>{
    return(
        <nav class="navbar navbar-light bg-light">
  <div class="container-fluid">
            <NavLink to='/' exact={true}>LOGIN</NavLink>
            <NavLink to='/register'>REGISTER</NavLink>
            <NavLink to='/portfolio'>PORTFOLIO</NavLink>
            <NavLink to='/userdetails'>USERDETAILS</NavLink>
  </div>
</nav>

            
            )
}
