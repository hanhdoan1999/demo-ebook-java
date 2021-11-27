package com.demo.demobook;

public class Quotes {
    String desQuotes;
    String authorQuotes;

    public Quotes(String desQuotes, String authorQuotes) {
        this.desQuotes = desQuotes;
        this.authorQuotes = authorQuotes;
    }

    public String getDesQuotes() {
        return desQuotes;
    }

    public void setDesQuotes(String desQuotes) {
        this.desQuotes = desQuotes;
    }

    public String getAuthorQuotes() {
        return authorQuotes;
    }

    public void setAuthorQuotes(String authorQuotes) {
        this.authorQuotes = authorQuotes;
    }
}
