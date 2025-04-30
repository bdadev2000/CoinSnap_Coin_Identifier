package com.mbridge.msdk.mbbid.out;

/* loaded from: classes3.dex */
public class AdvancedNativeBidRequestParams extends CommonBidRequestParams {

    /* renamed from: a, reason: collision with root package name */
    private int f16396a;
    private int b;

    public AdvancedNativeBidRequestParams(String str, String str2, int i9, int i10) {
        super(str, str2);
        this.f16396a = i10;
        this.b = i9;
    }

    public int getHeight() {
        return this.f16396a;
    }

    public int getWidth() {
        return this.b;
    }

    public void setHeight(int i9) {
        this.f16396a = i9;
    }

    public void setWidth(int i9) {
        this.b = i9;
    }

    public AdvancedNativeBidRequestParams(String str, String str2, String str3, int i9, int i10) {
        super(str, str2, str3);
        this.f16396a = i10;
        this.b = i9;
    }
}
