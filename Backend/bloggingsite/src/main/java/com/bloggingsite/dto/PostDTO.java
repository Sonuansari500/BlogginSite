package com.bloggingsite.dto;


import java.io.File;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PostDTO {
    private String title;
    private String summary ;
    private String content;
    private File postImage;
    private Integer categoryID ;
    private String authorName;
}
