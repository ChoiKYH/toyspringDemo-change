package com.demo;

public class baseballDto {

    private int idx;
    private String team;
    private String image;
    private String slogan;
    private String member;
    private String bottom;



    public baseballDto(int idx, String team,String image,String slogan, String member, String bottom){
        this.idx=idx;
        this.team=team;
        this.image=image;
        this.slogan=slogan;
        this.member = member;
        this.bottom=bottom;

    }
    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }
    public String getBottom() {
        return bottom;
    }

    public void setBottom(String bottom) {
        this.bottom = bottom;
    }


    @Override
    public String toString() {
        return "baseballDto{" +
                "idx=" + idx +
                ", team='" + team + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}

