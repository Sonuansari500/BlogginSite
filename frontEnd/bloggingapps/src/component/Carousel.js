import React from "react";
import { Carousel } from "react-responsive-carousel";
import { carouselCSS } from "../css/carousel.css";
import "react-responsive-carousel/lib/styles/carousel.min.css";
import carouselImage1 from "../Images/1.jpg";
import carouselImage2 from "../Images/2.jpg";
var images = [carouselImage1, carouselImage2];

export default () => (
  <Carousel className="carousel-wrapper" autoPlay>
    <div>
      <img src={carouselImage1} />
      <div className="legends">
        <h1>Range of center</h1>
        <p>We got a whole lineup of awesome imams preachig islam here!</p>
        <button>Read More...</button>
      </div>
    </div>
    <div>
      <img src={carouselImage2} />
      <div className="legends">
        <h1>Range of center</h1>
        <p>We got a whole lineup of awesome imams preachig islam here!</p>
        <button>Read More...</button>
      </div>
    </div>
    <div>
      <img src={carouselImage1} />
      <div className="legends">
        <h1>Range of center</h1>
        <p>We got a whole lineup of awesome imams preachig islam here!</p>
        <button>Read More...</button>
      </div>
    </div>
    <div>
      <img src={carouselImage2} />
      <div className="legends">
        <h1>Range of center</h1>
        <p>We got a whole lineup of awesome imams preachig islam here!</p>
        <button>Read More...</button>
      </div>
    </div>
  </Carousel>
);
