import React from "react";
import Fajr from "../Images/fajr.jpg";
import CardDesign from "../css/card.css";

export default function card(props) {
  return (
    <div className="container">
      <div className="card-body">
        <div className="card-heading">
          <div>
            <img src={Fajr} />
          </div>
          <div className="card-button">
            <span>{props.title}</span>
          </div>
        </div>
        <div className="card-content">
          <div className="day-time">
            <span>{props.daytime}</span>
          </div>
          <div className="divider">
            <span>|</span>
          </div>
          <div className="time">
            <span>
              <i class="fa-solid fa-clock"></i>
            </span>
            <span>{props.time}</span>
          </div>
        </div>
      </div>
    </div>
  );
}
