import React from "react";
import { PrayerTimings } from "../../css/home-sections/prayerTimings.css";
import Card from "../../common/card";

export default function prayerTimings() {
  const prayerContents = [
    { Name: "Fajr", DayTime: "Morning", Time: "05:00-07:00" },
    { Name: "Duwaye Khubra", DayTime: "Sunrise", Time: "06:00-07:00" },
    { Name: "Zuhr", DayTime: "Afternoon", Time: "01:00-07:00" },
    { Name: "Asr", DayTime: "Mid Afternoon", Time: "04:00-07:00" },
    { Name: "Magrib", DayTime: "Sunset", Time: "05:00-07:00" },
    { Name: "Isha", DayTime: "Night", Time: "07:00-07:00" },
  ];

  return (
    <div className="prayer-timing-container section-height">
      <div className="heading">
        <h1>Prayer Timings</h1>
      </div>
      <div className="timing-cards">
        {prayerContents.map((item) => (
          <Card
            // title={prayer.Name}
            // daytime={prayer.DayTime}
            // time={prayer.Time}
            data={item}
          />
        ))}
      </div>
    </div>
  );
}
