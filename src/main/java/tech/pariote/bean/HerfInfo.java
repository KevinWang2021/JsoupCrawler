package tech.pariote.bean;

public class HerfInfo {
    private  int sourcePageID;
    private  String pictureHerf;
    private  String relativePageHerf;

    @Override
    public String toString() {
        return "HerfInfo{" +
                "sourcePageID=" + sourcePageID +
                ", pictureHerf='" + pictureHerf + '\'' +
                ", relativePageHerf='" + relativePageHerf + '\'' +
                '}';
    }

    public HerfInfo() {
    }

    public int getSourcePageID() {
        return sourcePageID;
    }

    public void setSourcePageID(int sourcePageID) {
        this.sourcePageID = sourcePageID;
    }

    public HerfInfo(int sourcePageID,String pictureHerf, String relativePageHerf) {
        this.sourcePageID = sourcePageID;
        this.pictureHerf = pictureHerf;
        this.relativePageHerf = relativePageHerf;
    }

    public String getPictureHerf() {
        return pictureHerf;
    }

    public void setPictureHerf(String pictureHerf) {
        this.pictureHerf = pictureHerf;
    }

    public String getRelativePageHerf() {
        return relativePageHerf;
    }

    public void setRelativePageHerf(String relativePageHerf) {
        this.relativePageHerf = relativePageHerf;
    }
}
