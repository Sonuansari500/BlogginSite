import { useState } from "react";
import { useNavigate } from "react-router";

export default function RegisterPage() {
  const navigate = useNavigate();
  const [user, setUser] = useState({
    email: "",
    password: "",
  });
  function handleChange(e) {
    var name = e.target.name;
    var value = e.target.value;
    setUser((prev) => ({ ...prev, [name]: value }));
  }
  async function handleFormsubmit(e) {
    e.preventDefault();
    var response = await fetch("http://localhost:8082/api/signup", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
        "Access-Control-Allow-Origin": "*",
      },
      body: JSON.stringify(user),
    });

    const data = await response.json();

    if (!data.error) {
      setUser({
        email: "",
        password: "",
      });
      return navigate("/login");
    } else {
      alert(data.errorMsg);
    }
  }
  return (
    <form onSubmit={handleFormsubmit} className="register">
      <h1>Register page</h1>
      <input
        value={user.email}
        type="email"
        placeholder="username"
        name="email"
        onChange={handleChange}
      />
      <input
        type="password"
        placeholder="password"
        name="password"
        value={user.password}
        onChange={handleChange}
      />
      <button type="submit">Register</button>
    </form>
  );
}
