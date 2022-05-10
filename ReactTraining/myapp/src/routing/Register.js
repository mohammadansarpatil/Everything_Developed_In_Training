


function Register(){

    return(
        <div class='container'>
        <h3>REGISTER</h3>
        <form>
            <div class="mb-3">
            <label for="username" class="form-label">USER NAME</label>
            <input type="text" class="form-control" id="username" ></input>
            </div>

            <div>
            <label for="exampleInputPassword1" class="form-label">PASSWORD</label>
            <input type="password" class="form-control" id="exampleInputPassword1"></input>
            </div>

            <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">EMAIL PASSWORD</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"></input>
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>

            <div class="mb-3">
            <label for="city" class="form-label">CITY</label>
            <input type="text" class="form-control" id="city" ></input>
            </div>

            <button type="submit" class="btn btn-primary">SUBMIT</button>
        </form>
        
    </div>
    )
}

export default Register