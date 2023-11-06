import { useContext, useState } from "react";
import { userContext } from "../context/UserContext";
import { useNavigate } from "react-router";

export default function LoginPage() {
  var navigate = useNavigate();
  const { setUserInfo } = useContext(userContext);

  const [user, setUser] = useState({
    email: "",
    password: "",
  });
  function handleChange(e) {
    var name = e.target.name;
    var value = e.target.value;
    setUser((prev) => ({ ...prev, [name]: value }));
  }
  async function handleSubmit(e) {
    e.preventDefault();
    var response = await fetch("http://localhost:8082/api/login", {
      method: "POST",
      body: JSON.stringify(user),
      headers: {
        "Content-Type": "application/json",
        "Access-Control-Allow-Origin": "*",
      },
    });
    var data = await response.json();
    console.log(data);
    if ("error" in data) {
    } else {
      setUserInfo(data);
      navigate("/");
    }
  }
  return (
    <form onSubmit={handleSubmit} className="login">
      <h1>Login page</h1>
      <input
        value={user.email}
        type="email"
        placeholder="username"
        onChange={handleChange}
        name="email"
      />
      <input
        value={user.password}
        type="password"
        placeholder="password"
        name="password"
        onChange={handleChange}
      />
      <button type="submit">Login</button>
    </form>
  );
}
