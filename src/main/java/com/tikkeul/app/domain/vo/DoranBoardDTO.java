package com.tikkeul.app.domain.vo;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class DoranBoardDTO {
    private Long id;
    private String title;
    private String content;
    private int viewCount;
    private String registerDate;
    private String updateDate;
    private Long userId;
    private Long itemId;
}
