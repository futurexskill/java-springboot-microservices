package com.futurex.services.FutureXCourseCatalog;



import java.math.BigInteger;

public class User {

    private BigInteger userid;

    private BigInteger courseid;
    private String usename;

    public User() {

    }

    public BigInteger getUserid() {
        return userid;
    }

    public void setUserid(BigInteger userid) {
        this.userid = userid;
    }

    public BigInteger getCourseid() {
        return courseid;
    }

    public void setCourseid(BigInteger courseid) {
        this.courseid = courseid;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }
}
