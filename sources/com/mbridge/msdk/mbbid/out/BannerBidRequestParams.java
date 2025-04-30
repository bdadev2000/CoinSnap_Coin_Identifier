package com.mbridge.msdk.mbbid.out;

/* loaded from: classes3.dex */
public class BannerBidRequestParams extends CommonBidRequestParams {

    /* renamed from: a, reason: collision with root package name */
    private int f16397a;
    private int b;

    public BannerBidRequestParams(String str, String str2, int i9, int i10) {
        super(str, str2);
        this.f16397a = i10;
        this.b = i9;
    }

    public int getHeight() {
        return this.f16397a;
    }

    public int getWidth() {
        return this.b;
    }

    public void setHeight(int i9) {
        this.f16397a = i9;
    }

    public void setWidth(int i9) {
        this.b = i9;
    }

    public BannerBidRequestParams(String str, String str2, String str3, int i9, int i10) {
        super(str, str2, str3);
        this.f16397a = i10;
        this.b = i9;
    }
}
