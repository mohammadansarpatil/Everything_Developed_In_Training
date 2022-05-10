import { useState ,useContext, createContext} from "react"



const empContext = createContext()
function ContextDemo(){

const [employee,setEmployee]=useState({id:101,name:'Ansar',location:'Bangalore',salary:12345})
    return(
        <div>
                <empContext.Provider value={employee}>
                <Employee/>
                </empContext.Provider>
        </div>
    )
}

function Employee(){

    let context=useContext(empContext)
    return(
        <div>
                Welcome to Employee
                <br/>
                Name: {context.name}
                <br/>
                Location:{context.location
                }
                <Salary/>
        </div>
    )
}


function Salary(){

    let context = useContext(empContext)
    return(
        <div>
            Welcome to Salary 
            <br/>
            Name: {context.name}
            <br/>
            Salary: {context.salary}
        </div>
    )
}
export default ContextDemo