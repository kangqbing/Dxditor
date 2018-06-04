package itor.topnetwork.com.dxditor.bean;

/**
 * Created by D.Han on 2017/11/20.
 */

public class GjxxBean {
    private int typeCode;
    private String typeName;
    private int typeCount;
    private double typeProportion;

    public GjxxBean(int typeCode, String typeName, int typeCount, double typeProportion) {
        this.typeCode = typeCode;
        this.typeName = typeName;
        this.typeCount = typeCount;
        this.typeProportion = typeProportion;
    }

    public int getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(int typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getTypeCount() {
        return typeCount;
    }

    public void setTypeCount(int typeCount) {
        this.typeCount = typeCount;
    }

    public double getTypeProportion() {
        return typeProportion;
    }

    public void setTypeProportion(double typeProportion) {
        this.typeProportion = typeProportion;
    }
}
