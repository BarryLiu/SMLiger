package jing.entity;

public class TFundType {
    private Long id;

    private String name;

    private String desc;

    private Integer cipherTo;

    private String cipherDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Integer getCipherTo() {
        return cipherTo;
    }

    public void setCipherTo(Integer cipherTo) {
        this.cipherTo = cipherTo;
    }

    public String getCipherDesc() {
        return cipherDesc;
    }

    public void setCipherDesc(String cipherDesc) {
        this.cipherDesc = cipherDesc == null ? null : cipherDesc.trim();
    }
}