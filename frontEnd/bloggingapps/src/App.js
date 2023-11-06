import { Route, Routes } from "react-router-dom";
import "./app.css";
import Layout from "./Layout";
import IndexPage from "./pages/IndexPage";
import LoginPage from "./pages/LoginPage";
import CreatePost from "./pages/CreatePost";
import RegisterPage from "./pages/RegisterPage";
import { UserContextProvideer } from "./context/UserContext";
function App() {
  return (
    <UserContextProvideer>
      <Routes>
        <Route path="/" element={<Layout />}>
          <Route index element={<IndexPage />} />
          <Route path="/login" element={<LoginPage />} />
          <Route path="/register" element={<RegisterPage />} />
          <Route path="/post" element={<CreatePost />} />
        </Route>
      </Routes>
    </UserContextProvideer>
  );
}

export default App;
