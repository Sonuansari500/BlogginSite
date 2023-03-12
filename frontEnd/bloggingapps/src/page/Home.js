import React from "react";
import Carousel from "../component/Carousel";
import LearnMore from "../component/home-sections/learnMore";
import PrayerTimings from "../component/home-sections/prayerTimings";
export default function Home() {
  return (
    <>
      <Carousel />
      <LearnMore />
      <PrayerTimings />
    </>
  );
}
