import React from "react";
import { footer } from "../css/footer.css";

export default function Footer() {
  return (
    <div className="footer-container">
      <div className="address">
        <span>Chamkipur, Palhinandan - 1, Nawalparasi, Nepal</span>
      </div>

      <div className="social-media">
        <ul>
          <li>
            <a>
              <i class="fa-brands fa-instagram"></i>
            </a>
          </li>
          <li>
            <a>
              <i class="fa-brands fa-facebook-f"></i>
            </a>
          </li>
          <li>
            <a>
              <i class="fa-brands fa-google"></i>
            </a>
          </li>
          <li>
            <a>
              <i class="fa-brands fa-twitter"></i>
            </a>
          </li>
          <li>
            <a>
              <i class="fa-brands fa-instagram"></i>
            </a>
          </li>
          <li>
            <a>
              <i class="fa-brands fa-youtube"></i>
            </a>
          </li>
        </ul>
      </div>

      <div className="copyright">
        <span>
          © 2023 All rights reserved by Islamic Blogs.{" "}
          <span className="terms">Terms Privacy</span>
        </span>
      </div>
    </div>
  );
}
