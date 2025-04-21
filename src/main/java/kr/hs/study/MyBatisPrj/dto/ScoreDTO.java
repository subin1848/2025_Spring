package kr.hs.study.MyBatisPrj.dto;

import lombok.Data;

@Data
public class ScoreDTO {
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int sum;
    private double avg;

}

