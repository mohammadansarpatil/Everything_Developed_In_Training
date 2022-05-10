import { Component } from "react";


export default class FooterApp extends Component{
    state={
        filter:'',
        data:[
            {country: 'India', capital:'Delhi', population:'2000'},
            {country:'Nepal', capital:'Khatmandu',population:'1000'},
            {country:'New Zealand', capital:'Wellington',population:'500'},
        ]
    }


    searchData(e){
        this.setState({
            filter:e.target.value
        })
    }
    render(){
        let {filter,data}=this.state
        let dataSearch=data.filter(item=>{
            return Object.keys(item).some(key=> 
                item[key].toLowerCase().includes(filter.toLowerCase()))
        })
        return(
            <div>
                <div>
                    <h3>SEARCH APP</h3>
                    <input type="text" placeholder="Enter data to search" value={filter} onChange={this.searchData.bind(this)}></input>
                    <table border="2px">
                        <tr>
                        <th>Country</th>
                        <th>Capital</th>
                        <th>Population</th>
                        </tr>
                            {
                            (dataSearch.map(item=>
                                <tr>
                                    <td>{item.country}</td>
                                    <td>{item.capital}</td>
                                    <td>{item.population}</td>

                                </tr>
                                ))
                            }
                        
                        
                    </table>

                </div>
                <footer>
                {this.props.footermsg}
                 </footer>
            </div>
        )
    }
}

// filter = ''
// data:[
//                 {country: 'India', capital:'Delhi', population:'2000'},
//                 {country:'Nepal', capital:'Khatmandu',population:'1000'},
//                 {country:'New Zealand', capital:'Wellington',population:'500'},
//             ]

// function FooterApp(props){
//     return(
//         let (filter,data)=(filter,data)

//         let dataSearch=data.filter(item=>{
//             return Object.keys(item).some(key=> 
//                 item[key].toLowerCase().includes(filter.toLowerCase()))
//         })
//         return(
//             <div>
//                 <div>
//                     <h3>SEARCH APP</h3>
//                     <input type="text" placeholder="Enter data to search" value={filter} onChange={searchData.bind()}></input>
//                     <table border="2px">
//                         <tr>
//                         <th>Country</th>
//                         <th>Capital</th>
//                         <th>Population</th>
//                         </tr>
//                             {
//                             (dataSearch.map(item=>
//                                 <tr>
//                                     <td>{item.country}</td>
//                                     <td>{item.capital}</td>
//                                     <td>{item.population}</td>

//                                 </tr>
//                                 ))
//                             }
                        
                        
//                     </table>

//                 </div>
//                 <footer>
//                 {props.footermsg}
//                  </footer>
//             </div>

//     )
// }