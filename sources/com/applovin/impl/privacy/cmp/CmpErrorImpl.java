package com.applovin.impl.privacy.cmp;

import com.applovin.sdk.AppLovinCmpError;

/* loaded from: classes.dex */
public class CmpErrorImpl implements AppLovinCmpError {

    /* renamed from: a, reason: collision with root package name */
    private final AppLovinCmpError.Code f10082a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10083c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10084d;

    public CmpErrorImpl(AppLovinCmpError.Code code, String str) {
        this(code, str, -1, "");
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public int getCmpCode() {
        return this.f10083c;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getCmpMessage() {
        return this.f10084d;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public AppLovinCmpError.Code getCode() {
        return this.f10082a;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getMessage() {
        return this.b;
    }

    public String toString() {
        return "CmpErrorImpl(code=" + getCode() + ", message=" + getMessage() + ", cmpCode=" + getCmpCode() + ", cmpMessage=" + getCmpMessage() + ")";
    }

    public CmpErrorImpl(AppLovinCmpError.Code code, String str, int i9, String str2) {
        this.f10082a = code;
        this.b = str;
        this.f10083c = i9;
        this.f10084d = str2;
    }
}
