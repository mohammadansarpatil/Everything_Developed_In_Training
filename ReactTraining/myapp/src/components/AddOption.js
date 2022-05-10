import { Component } from "react";


// export default class AddOption extends Component{

// addUser=(e)=>
// {
    
//     e.preventDefault()
//   const data1 = e.target.elements.uname.value
//   this.props.addusr(data1)

// }

//     render(){
//         return(
//             <div>
//                 <form onSubmit={this.addUser}>
//                 User Name: <input type='text' name='uname' />
//                 <button >Call me</button>
//             </form>
              
//             </div>
//         )
//     }
// }





function AddOption(props){

    const addUser=(e)=>
    {
        e.preventDefault()
      const data1 = e.target.elements.uname.value
        props.addusr(data1)
    
    }

    return(
        <div>
        <form onSubmit={addUser}>
        User Name: <input type='text' name='uname' />
        <button >Call me</button>
    </form>
      
    </div>
    )
}
export default AddOption