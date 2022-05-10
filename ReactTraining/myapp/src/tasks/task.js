import { useState } from "react";


function Task(){

    const[users, setUser]=useState([])
    const[uname, setUname]=useState('')

    function addUser(e){
        e.preventDefault()
        setUser([
            ...users,{uname}
        ])
        setUname('')

    }

    function removeUser(uname){
        setUser(users.filter((user)=>user.uname!==uname))

    }

    function emptyUsers(){
        setUser([])
    }

   
    return(
        <div>
        <div>
            <header>HEADER </header>
                <h3>USERS</h3>
                {users.map((user)=>(
            <div>
                <h2>{user.uname} </h2>
                <button onClick={()=>removeUser(user.uname)}>Delete</button>
            </div>
            ))}
        </div>
             
            <form onSubmit={addUser}> 
                <input type="text" value={uname} onChange={(e)=>setUname(e.target.value)}></input>
                <button>ADD USER</button>
            </form>

                <button onClick={emptyUsers}>EMPTY USERS</button>
        </div>
    )
}

export default Task