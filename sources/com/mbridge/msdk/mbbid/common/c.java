package com.mbridge.msdk.mbbid.common;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private String f16393a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f16394c;

    public c(String str, String str2) {
        this.f16393a = str;
        this.b = str2;
    }

    public String getmFloorPrice() {
        return this.f16394c;
    }

    public String getmPlacementId() {
        return this.f16393a;
    }

    public String getmUnitId() {
        return this.b;
    }

    public void setmFloorPrice(String str) {
        this.f16394c = str;
    }

    public void setmPlacementId(String str) {
        this.f16393a = str;
    }

    public void setmUnitId(String str) {
        this.b = str;
    }

    public c(String str, String str2, String str3) {
        this.f16393a = str;
        this.b = str2;
        this.f16394c = str3;
    }
}
