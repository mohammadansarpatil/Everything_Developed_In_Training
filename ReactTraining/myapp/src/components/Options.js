import { Component } from "react";
import Option from "./Option";



// export default class Options extends Component{
//     render(){
//         return(
//             <div> 
//                 <div>
//                 <h5>User Data</h5>
//                 {
//                 this.props.udata.map((data)=> <Option mydata={data} deldata={this.props.du}/>)
//                 }
                
//                 <button onClick={this.props.eu}>Remove Users</button>
//                 </div>
//               <div>
//                 <h5> Department Data</h5>
//               {
//                 this.props.depts.map((deptdata)=> <Option mydeptdata={deptdata}/>)
//                }
//                 <button onClick={this.props.ed}>Remove Depts</button>

//               </div>
               
//             </div>
//         )
//     }
// }


function Options(props){
  return(

    <div> 
                <div>
                <h5>User Data</h5>
                {
                props.udata.map((data)=> <Option mydata={data} deldata={props.du}/>)
                }
                
                <button onClick={props.eu}>Remove Users</button>
                </div>
              <div>
                <h5> Department Data</h5>
              {
                props.depts.map((deptdata)=> <Option mydeptdata={deptdata}/>)
               }
                <button onClick={props.ed}>Remove Depts</button>

              </div>
               
            </div>

  )
}
export default Options