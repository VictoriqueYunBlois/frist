package com.llk.demo.common;

public class BaseModelExample {

    private int pageSize;
    private int rowIndex;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    @Override
    public String toString() {
        return "BaseModelExample{" +
                "pageSize=" + pageSize +
                ", rowIndex=" + rowIndex +
                '}';
    }
}
