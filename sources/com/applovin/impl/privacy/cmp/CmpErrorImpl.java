package com.applovin.impl.privacy.cmp;

import com.applovin.sdk.AppLovinCmpError;

/* loaded from: classes.dex */
public class CmpErrorImpl implements AppLovinCmpError {

    /* renamed from: a, reason: collision with root package name */
    private final AppLovinCmpError.Code f26094a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26095b;

    /* renamed from: c, reason: collision with root package name */
    private final int f26096c;
    private final String d;

    public CmpErrorImpl(AppLovinCmpError.Code code, String str) {
        this(code, str, -1, "");
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public int getCmpCode() {
        return this.f26096c;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getCmpMessage() {
        return this.d;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public AppLovinCmpError.Code getCode() {
        return this.f26094a;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getMessage() {
        return this.f26095b;
    }

    public String toString() {
        return "CmpErrorImpl(code=" + getCode() + ", message=" + getMessage() + ", cmpCode=" + getCmpCode() + ", cmpMessage=" + getCmpMessage() + ")";
    }

    public CmpErrorImpl(AppLovinCmpError.Code code, String str, int i2, String str2) {
        this.f26094a = code;
        this.f26095b = str;
        this.f26096c = i2;
        this.d = str2;
    }
}
