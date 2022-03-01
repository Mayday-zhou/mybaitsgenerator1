package cn.wang.pojo;

import java.math.BigDecimal;

public class Score {
    private Integer scoreid;

    private Integer stuno;

    private Integer courseid;

    private BigDecimal score;

    public Score(Integer scoreid, Integer stuno, Integer courseid, BigDecimal score) {
        this.scoreid = scoreid;
        this.stuno = stuno;
        this.courseid = courseid;
        this.score = score;
    }

    public Score() {
        super();
    }

    public Integer getScoreid() {
        return scoreid;
    }

    public void setScoreid(Integer scoreid) {
        this.scoreid = scoreid;
    }

    public Integer getStuno() {
        return stuno;
    }

    public void setStuno(Integer stuno) {
        this.stuno = stuno;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }
}