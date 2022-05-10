import { Component } from "react";


export default class Counter extends Component{

    state={
        count:10
    }
    add=()=>{
        this.setState((prevState)=>{
            return{
                count: prevState.count+1
            }
        })
       // alert("Inc called")
    }
    sub=()=>{
        this.setState((prevState)=>{
            return{
                count: prevState.count-1
            }
        })
       // alert("Dec called")

    }
    reset=()=>{
        this.setState(()=>{
            return{
                count:10
            }
        })
        //alert("reset called")
    }
    render(){
        const userdata=['admin','manager','QA']
        const departments=['HR','Finance','Security']
        return(
            <div>
            <p>The current count is {this.state.count}</p>
               <button onClick={this.add}>ADD</button>
               <button onClick={this.sub}>SUB</button>
               <button onClick={this.reset}>RESET</button>
            </div>
        )
    }
}