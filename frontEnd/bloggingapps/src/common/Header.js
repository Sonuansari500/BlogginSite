import React from "react";
import { header } from "../css/header.css";

export default function Header() {
  return (
    <header className="header">
      <div className="information">
        <span>We got a whole lineup of awesome imams preachig islam here!</span>
      </div>

      <div className="social-links">
        <a>
          <i class="fa-brands fa-facebook-f"></i>
        </a>
        <a>
          <i class="fa-brands fa-google"></i>
        </a>
        <a>
          <i class="fa-brands fa-twitter"></i>
        </a>
      </div>
    </header>
  );
}
