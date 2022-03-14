package com.eazybytes.eazyschool.model;

public class Contact {

    private String name;
    private String mobileNum;
    private String email;
    private String subject;
    private String message;

    



    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the mobileNum
     */
    public String getMobileNum() {
        return mobileNum;
    }

    /**
     * @param mobileNum the mobileNum to set
     */
    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return String return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString () {
        return "Contact['" + name + "', '" + email + "']";
    }

}
