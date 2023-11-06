import { useContext } from "react";
import { Link } from "react-router-dom";
import { userContext } from "./context/UserContext";

export default function Header() {
  const { userInfo, setUserInfo } = useContext(userContext);
  function handleLogout(e) {
    setUserInfo({});
  }
  return (
    <header>
      <Link className="logo" to="/">
        BelalSoft
      </Link>
      {userInfo && Object.keys(userInfo).length > 0 ? (
        <nav>
          <Link to="/post">Create new Post</Link>
          <Link to="" onClick={handleLogout}>
            Logout
          </Link>
        </nav>
      ) : (
        <nav>
          <Link to="/login">Login</Link>
          <Link to="/register">Register</Link>
        </nav>
      )}
    </header>
  );
}
