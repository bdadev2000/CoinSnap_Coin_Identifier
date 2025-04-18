package com.bytedance.sdk.openadsdk.api.model;

/* loaded from: classes.dex */
public class PAGErrorModel {
    private final String Sg;
    private final int YFl;

    public PAGErrorModel(int i10, String str) {
        this.YFl = i10;
        this.Sg = str;
    }

    public int getErrorCode() {
        return this.YFl;
    }

    public String getErrorMessage() {
        return this.Sg;
    }
}
