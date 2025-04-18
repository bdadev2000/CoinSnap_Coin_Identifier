package com.mbridge.msdk.mbbid.out;

/* loaded from: classes4.dex */
public class AdvancedNativeBidRequestParams extends CommonBidRequestParams {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f13918b;

    public AdvancedNativeBidRequestParams(String str, String str2, int i10, int i11) {
        super(str, str2);
        this.a = i11;
        this.f13918b = i10;
    }

    public int getHeight() {
        return this.a;
    }

    public int getWidth() {
        return this.f13918b;
    }

    public void setHeight(int i10) {
        this.a = i10;
    }

    public void setWidth(int i10) {
        this.f13918b = i10;
    }

    public AdvancedNativeBidRequestParams(String str, String str2, String str3, int i10, int i11) {
        super(str, str2, str3);
        this.a = i11;
        this.f13918b = i10;
    }
}
