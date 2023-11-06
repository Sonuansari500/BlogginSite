import React, { useContext, useState } from "react";
import ReactQuill from "react-quill";
import "react-quill/dist/quill.snow.css";
import { userContext } from "../context/UserContext";

function CreatePost() {
  const { userInfo } = useContext(userContext);
  var categories = "categories" in userInfo ? userInfo.categories : null;
  const [post, setPost] = useState({
    title: "",
    summary: "",
    category: "",
  });
  const [content, setContent] = useState("");
  const [image, setImage] = useState("");

  const modules = {
    toolbar: [
      ["bold", "italic", "underline", "strike"], // toggled buttons
      ["blockquote", "code-block"],

      [{ list: "ordered" }, { list: "bullet" }],
      [{ script: "sub" }, { script: "super" }], // superscript/subscript
      [{ indent: "-1" }, { indent: "+1" }], // outdent/indent
      [{ direction: "rtl" }], // text direction

      [{ size: ["small", false, "large", "huge"] }], // custom dropdown
      [{ header: [1, 2, 3, 4, 5, 6, false] }],

      [{ color: [] }, { background: [] }], // dropdown with defaults from theme
      [{ font: [] }],
      [{ align: [] }],
      ["link", "image"],
      ["clean"], // remove formatting button
    ],
  };
  function handleChange(e) {
    var name = e.target.name;
    var value = e.target.value;
    setPost((prev) => ({ ...prev, [name]: value }));
  }
  function handleSubmit(e) {
    e.preventDefault();
    var formData = new FormData();
    formData.title = post.title;
    formData.summary = post.title;
    formData.content = content;
    formData.postImage = image[0];
    formData.categoryID = post.category;
    formData.authorName = "ansaris500@gmail.com";

    console.log(formData);
  }
  return (
    <form className="post" onSubmit={handleSubmit}>
      <h1>New Post</h1>
      <label>Select the Post Category</label>
      <select name="category" onChange={handleChange}>
        <option value="">Select Category</option>
        {categories
          ? categories.map(function (item) {
              return <option value={item.cid}>{item.c_name}</option>;
            })
          : ""}
      </select>
      <label>Title</label>
      <input
        type="title"
        placeholder="Title"
        name="title"
        onChange={handleChange}
      />
      <label>Summary</label>
      <input
        type="summary"
        placeholder="Summary"
        name="summary"
        onChange={handleChange}
      />
      <label>Post Attachment</label>
      <input
        type="file"
        name="image"
        onChange={(e) => setImage(e.target.files)}
      />
      <label>About Post </label>
      <ReactQuill
        value={content}
        modules={modules}
        onChange={(newvalue) => setContent(newvalue)}
      />
      <button type="submit" style={{ marginTop: "5px" }}>
        Create post
      </button>
    </form>
  );
}

export default CreatePost;
