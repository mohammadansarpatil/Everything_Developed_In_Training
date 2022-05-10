import React , {Component} from "react"
import axios from 'axios'


class DisplayData extends Component{
    state={users:[]};
  async componentDidMount(){
    let result= await axios.get("http://localhost:8090/loadall");
    console.log(result)

 //     let result= await axios.get("https://jsonplaceholder.typicode.com/users");
      this.setState({users:result.data})
  }
    render(){
        return(
            <div className="container">
           
              <div>
                <table className="table">
                <thead>
                        <tr>
                            <th scope="col">WmpId</th>
                            <th scope="col">FirstName</th>
                            <th scope="col">LastName</th>
                            <th scope="col">Email</th> 
                        </tr>
                    </thead>
                  <tbody>  
                    {this.state.users.map(user=>(
                      <tr>
                          <td>{user.empId} </td>
                          <td> {user.firstName} </td>
                          <td>{user.lastName}</td>
                          <td>{user.email}</td>   
                      </tr>
                )
                
             )}
             </tbody>
            </table>
            </div> 
           
            )
            
          </div>
        )
    }
}

export default DisplayData;