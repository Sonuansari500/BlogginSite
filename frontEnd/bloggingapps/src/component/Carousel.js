import React from "react";
import { Carousel } from "react-responsive-carousel";
import {carouselCSS} from "../css/carousel.css";
import "react-responsive-carousel/lib/styles/carousel.min.css";
import carouselImage1 from "../Images/1.jpg"
import carouselImage2 from "../Images/2.jpg"
var images = [carouselImage1,carouselImage2]


export default () => (
  <Carousel className="carousel-wrapper" autoPlay>
    
      <img  alt="" src={carouselImage1}/>
      <img  alt="" src={carouselImage2}/>
  </Carousel>
);
