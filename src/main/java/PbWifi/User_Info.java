package PbWifi;



public class User_Info {

    private Integer ID; // ID
    private Double LAT; // X좌표
    private Double LNT; // Y좌표
    private String VEIW_DATE; // 조회일자

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Double getLAT() {
        return LAT;
    }

    public void setLAT(Double LAT) {
        this.LAT = LAT;
    }

    public Double getLNT() {
        return LNT;
    }

    public void setLNT(Double LNT) {
        this.LNT = LNT;
    }

    public String getVEIW_DATE() {
        return VEIW_DATE;
    }

    public void setVEIW_DATE(String VEIW_DATE) {
        this.VEIW_DATE = VEIW_DATE;
    }
}
