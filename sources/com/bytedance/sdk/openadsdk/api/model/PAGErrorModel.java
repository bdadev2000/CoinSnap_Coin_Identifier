package com.bytedance.sdk.openadsdk.api.model;

/* loaded from: classes.dex */
public class PAGErrorModel {
    private final String lMd;
    private final int zp;

    public PAGErrorModel(int i9, String str) {
        this.zp = i9;
        this.lMd = str;
    }

    public int getErrorCode() {
        return this.zp;
    }

    public String getErrorMessage() {
        return this.lMd;
    }
}
