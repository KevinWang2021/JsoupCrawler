package tech.pariote.bean;

public class HerfInfoRequest {
    private  int  sourcePageID;

    public HerfInfoRequest() {
    }

    public HerfInfoRequest(int sourcePageID) {
        this.sourcePageID = sourcePageID;
    }

    public int getSourcePageID() {
        return sourcePageID;
    }

    public void setSourcePageID(int sourcePageID) {
        this.sourcePageID = sourcePageID;
    }
}

