import Header from "./common/Header";
import Navbar from "./common/Navbar";
import Footer from "./common/Footer";
import Home from "./component/Home";
import logo from "./Images/islamic-logo.png";
import Carousel from "./component/Carousel";

function App() {
  return (
    <div className="main">
      <Header />
      <Navbar logo="logo" />
      <Carousel/>
      <Home />
      <Footer />
    </div>
  );
}

export default App;
