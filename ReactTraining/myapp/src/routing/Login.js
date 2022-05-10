





function Login(){

    return(
        <div class='container'>
            <h3>LOGIN</h3>
            <form>
                <div class="mb-3">
                <label for="username" class="form-label">USER NAME</label>
                <input type="text" class="form-control" id="username" ></input>
                </div>

                <div>
                <label for="exampleInputPassword1" class="form-label">PASSWORD</label>
                <input type="password" class="form-control" id="exampleInputPassword1"></input>
                </div>
                <button type="submit" class="btn btn-primary">SUBMIT</button>
            </form>
            
        </div>
    )
}

export default Login

