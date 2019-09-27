package com.llk.demo.common;

public class QueryParams {
    private int limit;
    private int offset;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "QueryParams{" +
                "limit=" + limit +
                ", offset=" + offset +
                '}';
    }
}
