import { Component } from "react";
import Action from "./Action";
import AddOption from "./AddOption";
import Counter from "./Counter";
import FooterApp from "./FooterApp";
import HeaderApp from "./HeaderApp";
import Options from "./Options";
import AddDepts from "./AddDepts"


export default class MainApp extends Component{

    state ={
        userdata:[],
        departments:[]
        }

    emptyUserArray=()=>{
        this.setState(()=>{
            return{
                userdata:[]

            }
            
        })
    }

    addUser=(data)=>{
        this.setState((prevState)=>{
            return{
              userdata:prevState.userdata.concat(data)
            }
        })
    }

    deleteUser=(data)=>{
        this.setState((prevState)=>{
            return{
                userdata:prevState.userdata.filter((input)=>data!==input)
            }
        })
    }


    emptyDeptArray=()=>{
        this.setState(()=>{
            return{
               departments:[]
            }
        })
    }

    addDept=(data)=>{
        this.setState((prevState)=>{
            return{
                departments:prevState.departments.concat(data)
            }
        })
    }

    render(){
         
        return(
            <div>
                <HeaderApp headermsg="HEADER"/> 
                <h3>Welcome to MainApp</h3>
                <Options udata={this.state.userdata} eu={this.emptyUserArray} du={this.deleteUser} depts={this.state.departments} ed={this.emptyDeptArray}/>
                <Action isData={this.state.userdata.length>0} isDepts={this.state.departments.length>0}/>
                <AddOption addoptionmsg="Add Option  Message" addusr={this.addUser}/>
                <AddDepts adddeptmsg="Add Dept  Message" adddpt={this.addDept}/>
                <Counter/>
                <FooterApp footermsg="Footer Message"/>
            </div>
        )
    }
}

