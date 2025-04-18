package com.applovin.impl.privacy.cmp;

import com.applovin.sdk.AppLovinCmpError;

/* loaded from: classes.dex */
public class CmpErrorImpl implements AppLovinCmpError {
    private final AppLovinCmpError.Code a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7017b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7018c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7019d;

    public CmpErrorImpl(AppLovinCmpError.Code code, String str) {
        this(code, str, -1, "");
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public int getCmpCode() {
        return this.f7018c;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getCmpMessage() {
        return this.f7019d;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public AppLovinCmpError.Code getCode() {
        return this.a;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getMessage() {
        return this.f7017b;
    }

    public String toString() {
        return "CmpErrorImpl(code=" + getCode() + ", message=" + getMessage() + ", cmpCode=" + getCmpCode() + ", cmpMessage=" + getCmpMessage() + ")";
    }

    public CmpErrorImpl(AppLovinCmpError.Code code, String str, int i10, String str2) {
        this.a = code;
        this.f7017b = str;
        this.f7018c = i10;
        this.f7019d = str2;
    }
}
