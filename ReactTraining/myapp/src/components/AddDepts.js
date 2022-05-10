import { Component } from "react";


export default class AddDepts extends Component{
    addDept=(e)=>{
        e.preventDefault()
        const data1 = e.target.elements.dname.value
        this.props.adddpt(data1)
    }


   render(){
       return(
        <div>
            <h3>{this.props.adddeptmsg}</h3>
            <form onSubmit={this.addDept}>
               Dept Name: <input type='text' name='dname'></input>
               <button>Add Dept</button>
            </form>
        </div>
       )
    }
}