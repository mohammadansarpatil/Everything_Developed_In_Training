import { Component } from "react";


// export default class HeaderApp extends Component{
//     render(){
//         return(
//             <div>
//                 <header>
//                     {this.props.headermsg}
//                 </header>
//             </div>
//         )
//     }
// }

function HeaderApp(props){
    return(
        <div>
            <h6>
            {props.headermsg}

            </h6>
        </div>
    )
}
export default HeaderApp