// Name : Maryam Ashraf
// Date : April, 10th 2021

package com.company;

public class Student {
    //School Number
    private String sid;
    //Full name
    private String name;
    //Age
    private String age;
    //Residence
    private String address;
    //Construction method
    public Student() {
    }

    //Construct with four parameters
    public Student(String sid, String name, String age, String address) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    //Corresponding get/set methods
    public String getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}