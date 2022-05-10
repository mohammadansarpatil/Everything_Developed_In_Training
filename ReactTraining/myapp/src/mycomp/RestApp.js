import { Component } from "react";
import axios from 'axios'


//const API_URL = "https://jsonplaceholder.typicode.com/users";
const API_URL = "http://localhost:5000/api/customer"

export default class RestApp extends Component{

    state={
        users:[]
    }

    componentDidMount(){
        axios.get(API_URL).then(res => res.data) 
        .then((data)=>{ 
            this.setState({users:data})   
            console.log("Initial Loading")
            
        }) 
    }

    componentDidUpdate(){
        console.log("State Updated")
    }

    render(){
        return(
            <div className='container'>
            <div className='col-xs-8'>
                <h1>Users</h1>
                {this.state.users.map((user)=>(
                    <div className="card">
                        <div classname="card-body">
                            <h5 className='card-title'>{user.firstName}</h5>
                            <h6 className='card-title'>{user.email}</h6>
                            </div>
                        </div>
                ))}
                </div>
            </div>
        )
    }
}