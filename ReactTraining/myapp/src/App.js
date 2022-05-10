import MainApp from "./components/MainApp";
import RestApp from "./mycomp/RestApp";
import HooksDemo from "./hooksdemo/App1";
import NotesApp from "./hooksdemo/NotesApp";
import Task from "./tasks/task";
import ContextDemo from "./contextapp/ContextDemo";
import LandingPage from "./routing/LandingPage"
import { useSelector , useDispatch} from "react-redux";
import { increment , decrement , reset , login , logout} from "./reactredux/actions/useractions";





function App(){
  const counter = useSelector((state)=>state.cntr)
  const auth = useSelector((state)=>state.auth)

  const dispatch = useDispatch()
  return(
    <div>
      <p>The Auth is {auth}</p>
      <button onClick={()=>dispatch(increment())}>INC</button>
      <button onClick={()=>dispatch(decrement())}>DEC</button>
      <button onClick={()=>dispatch(reset())}>RST</button>
      <hr/>

      <div>
        <h2>For auth user only</h2>
        <button onClick={()=>dispatch(login())}>LOG IN</button>
        <button onClick={()=>dispatch(logout())}>LOG OUT</button>
        {
          auth ?(
            <div>
              <p>Welcome to Application as you have Logged In</p>
              </div>
          ):(
            "NOT A VALID USER"
          )
        }

      </div>

    </div>
  )
}
export default App