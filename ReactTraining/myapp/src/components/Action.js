import { Component } from "react";


export default class Action extends Component{
    render(){
        return(
            <div>
                <h4>{this.props.actionmsg}</h4>
                <button disabled={!this.props.isData}>Show User Action</button>
                <button disabled={!this.props.isDepts}>Show Dept Action</button>

            </div>
        )
    }
}