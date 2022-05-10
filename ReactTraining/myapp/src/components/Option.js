import { Component } from "react";


// export default class Option extends Component{
//     delUser=()=>{
//         this.props.deldata(this.props.mydata)
//     }
//     render(){
//         return(
//             <div>
//                 <div>
//                 { this.props.mydata}
//                     <button onClick={this.delUser}>Delete</button>
//                 </div>
//             <div>
//             { this.props.mydeptdata}

//             </div>
//             </div>
            
//         )
//     }
// }




function Option(props){
    const delUser=()=>{
        props.deldata(props.mydata)
    }
    return(
            <div>
                <div>
                {props.mydata}
                    <button onClick={delUser}>Delete</button>
                </div>
            <div>
            {props.mydeptdata}

            </div>
            </div>

    )
}
export default Option