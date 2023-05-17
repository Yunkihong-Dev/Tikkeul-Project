package com.tikkeul.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class SavingLevelVO {
    private Long levelId;
    private String name;
    private int goalMoney;
    private int dailyMoney;

}
