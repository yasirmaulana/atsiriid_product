package id.atsiri.essential;

public class Product {
    private String name;
    private String remark;
    private String photo;
    private String price;
    private String manfaatutama;
    private String manfaatlain;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getManfaatutama() { return manfaatutama; }

    public void setManfaatutama(String manfaatutama) {
        this.manfaatutama = manfaatutama;
    }

    public String getManfaatlain() {
        return manfaatlain;
    }

    public void setManfaatlain(String manfaatlain) {
        this.manfaatlain = manfaatlain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
