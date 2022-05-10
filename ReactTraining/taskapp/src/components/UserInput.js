import { useEffect, useState } from "react";


function UserInput(){

    useEffect(()=>{
        const detailsdata= JSON.parse(localStorage.getItem('details'))
        setDetails(detailsdata)
     },[])
 

   
    const[details,setDetails]=useState([])
    const[title,setTitle]=useState('')
    const[email,setEmail]=useState('')
    const[city,setCity]=useState('')
    const[department,setDepartment]=useState('')

    useEffect(()=>{
        localStorage.setItem('details',JSON.stringify(details))
    })

 
    const addDetails=(e)=>{
        e.preventDefault()
        setDetails([
            ...details,{title,email,city,department}
        ])
        setTitle('')
        setEmail('')
        setCity('')
        setDepartment('')
    }

    const removeDetails=(title)=>{
        
            setDetails(details.filter((detail)=> detail.title !==title))
        
    }
    return(
        <div>
            <h3>User Details...</h3><br/>
            {details.map((detail)=>(
                <div>
                <h3>{detail.title} {detail.email} {detail.city} {detail.department}</h3>
                <button class="btn btn-primary" onClick={()=>removeDetails(detail.title)}>Remove</button>
                </div>
            ))}
            <p>Add Details</p>
            <form onSubmit={addDetails}>
                
            <div class="mb-3">
                Name:<input class="form-control" type="text" value={title} onChange={(e)=>setTitle(e.target.value)}/>
            </div>
            <div class="mb-3">
                Email:<input class="form-control" type="email" value={email} onChange={(el)=>setEmail(el.target.value)}/>
            </div>
            <div class="mb-3">
                City:<input class="form-control" type="text" value={city} onChange={(e)=>setCity(e.target.value)}/>
            </div>
            <div class="mb-3">
                Department:<input class="form-control" type="text" value={department} onChange={(e)=>setDepartment(e.target.value)}/>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    )
}

export default UserInput
