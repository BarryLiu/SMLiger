package jing.entity;

public class TPermission {
    private Long id;

    private String perName;

    private Integer perValue;

    private Integer parentValue;

    private Integer perType;

    private String url;

    private String perDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName == null ? null : perName.trim();
    }

    public Integer getPerValue() {
        return perValue;
    }

    public void setPerValue(Integer perValue) {
        this.perValue = perValue;
    }

    public Integer getParentValue() {
        return parentValue;
    }

    public void setParentValue(Integer parentValue) {
        this.parentValue = parentValue;
    }

    public Integer getPerType() {
        return perType;
    }

    public void setPerType(Integer perType) {
        this.perType = perType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPerDesc() {
        return perDesc;
    }

    public void setPerDesc(String perDesc) {
        this.perDesc = perDesc == null ? null : perDesc.trim();
    }
}