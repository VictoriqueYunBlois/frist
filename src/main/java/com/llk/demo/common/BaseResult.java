package com.llk.demo.common;

public class BaseResult {
    private boolean isSuccess;

    private  String resultCode;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    @Override
    public String toString() {
        return "BaseResult{" +
                "isSuccess=" + isSuccess +
                '}';
    }
}
