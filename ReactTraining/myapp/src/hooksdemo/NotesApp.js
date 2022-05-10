import { useEffect, useState } from "react";


function NotesApp(){

    const[notes,setNotes]=useState([])
    const [title, setTitle]=useState('')
    const[email, setEmail]=useState('')


    useEffect(()=>{
        const notesdata = JSON.parse(localStorage.getItem('notes'))
        setNotes(notesdata)
    },[])

        useEffect(()=>{
            localStorage.setItem('notes',JSON.stringify(notes))
        })

    
    const addNote=(e)=>{
        e.preventDefault()
        setNotes([
            ...notes,{title,email}
        ])
        setTitle('')
        setEmail('')

    }

    function removeNote(title){
        setNotes(notes.filter((note)=>note.title!==title))

    }

    return(
        <div>
            <h3> Notes List ... </h3>
            {notes.map((note)=>(
                <div>
                <h2>{note.title} </h2>
                <h2>{note.email}</h2>
                <button onClick={()=>removeNote(note.title)}>Delete</button>
                </div>
               


                
            ))}
            <p>Add Note</p>
            <form onSubmit={addNote}>
                Title: <input type='text' value={title} onChange={(e)=>setTitle(e.target.value)}/>
                Email: <input type='email' value={email} onChange={(e)=>setEmail(e.target.value)}/>

                <button>Add</button>
            </form>
           
        </div>
    )
}
export default NotesApp