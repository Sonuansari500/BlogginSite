import React from "react";
import Learn from "../../css/home-sections/learnMore.css";
import photo1 from "../../Images/photo1.jpg";

export default function learnMore() {
  return (
    <div className="learn-more">
      <div className="left-panel">
        <img src={photo1} />
      </div>
      <div className="right-panel">
        <div className="main-heading heading">
          <h1>Learn More About Us</h1>
        </div>
        <div className="sub-heading">
          <span>…THERE ARE AN ESTIMATED 1.6 BILLION MUSLIMS IN THE WORLD.</span>
        </div>
        <div className="content">
          <p>
            Famous Muslims in America include Janet Jackson, Muhammad Ali,
            Shaquille O’Neal, Mara Brock Akil (writer/producer of the series
            “The Game” and “Girlfriends”), Mos Def (Yasiin Bey), Mike Tyson,
            Kareem Abdul-Jabbar, Ice Cube, Akon, and Anousheh Ansari, the first
            Muslim woman in space.
          </p>
        </div>
        <div className="author">
          <span>-</span>
          <span>Iqbal Ansari</span>
        </div>
      </div>
    </div>
  );
}
