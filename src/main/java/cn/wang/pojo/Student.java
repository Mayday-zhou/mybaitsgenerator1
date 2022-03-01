package cn.wang.pojo;

public class Student {
    private Integer stuno;

    private String name;

    private String sex;

    private String sgrade;

    private String address;

    private String email;

    public Student(Integer stuno, String name, String sex, String sgrade, String address, String email) {
        this.stuno = stuno;
        this.name = name;
        this.sex = sex;
        this.sgrade = sgrade;
        this.address = address;
        this.email = email;
    }

    public Student() {
        super();
    }

    public Integer getStuno() {
        return stuno;
    }

    public void setStuno(Integer stuno) {
        this.stuno = stuno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getSgrade() {
        return sgrade;
    }

    public void setSgrade(String sgrade) {
        this.sgrade = sgrade == null ? null : sgrade.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}