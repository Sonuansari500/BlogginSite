import React from "react";
import { navbar } from "../css/navbar.css";
import logo from "../Images/logo.png";

export default function Navbar() {
  return (
    <div className="navbar">
      <div className="logo">
        <h1>
          Islamic <span>Blogs</span>
        </h1>
      </div>

      <div className="menus">
        <ul className="menu-items">
          <li>
            <a>Home</a>
          </li>
          <li>
            <a>FAQs</a>
          </li>
          <li>
            <a>Imams</a>
          </li>
          <li>
            <a>Blogs</a>
          </li>
          <li>
            <a>Contact</a>
          </li>
        </ul>
      </div>

      <div className="donate">
        <span>Donate now</span>
      </div>
    </div>
  );
}
