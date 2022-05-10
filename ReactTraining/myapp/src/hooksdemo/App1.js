const {useState} = require ("react")


function HooksDemo(props){

    const [count,setCount] = useState(props.count)

    const increment=()=>{
        setCount(count+1)
    }


    return(
        <div>
            <p>
                Current state is {count}
            </p>
            <button onClick={increment}>INC</button>
            <button onClick={()=>setCount(count-1)}>DEC</button>
            <button onClick={()=>setCount(0)}>RESET</button>

        </div>
    )

}

HooksDemo.defaultProps={
    count:0
}
export default HooksDemo