export default function Post() {
  return (
    <div className="post">
      <div className="image">
        <img
          src="https://i.pinimg.com/originals/92/85/8e/92858e899f0597d02f1be08dc9dcc889.jpg"
          alt="post image"
        />
      </div>

      <div className="text">
        <h2>Why are meta descriptions important?</h2>
        <p className="info">
          <a className="autho">Iqbal Ansari</a>
          <time>2023-06-06 16:45</time>
        </p>
        <p className="summary">
          Before 2009, meta descriptions and the keywords they contained were an
          important ranking factor..
        </p>
      </div>
    </div>
  );
}
