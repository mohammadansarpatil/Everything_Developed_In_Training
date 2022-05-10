const express = require('express')
const cors = require('cors')

const app=express()

app.get('/api/customer',cors(),(req,res)=>{
    const customers=[
        {id:101,firstName:'john',email:'john@email.com'},
        {id:102,firstName:'brad',email:'brad@email.com'},
        {id:103,firstName:'mark',email:'mark@email.com'},
    ]
    res.json(customers)
})
app.listen(5000,()=>{
    console.log('Server is Ready')
})