package com.mbridge.msdk.mbbid.common;

/* loaded from: classes4.dex */
public abstract class c {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private String f13916b;

    /* renamed from: c, reason: collision with root package name */
    private String f13917c;

    public c(String str, String str2) {
        this.a = str;
        this.f13916b = str2;
    }

    public String getmFloorPrice() {
        return this.f13917c;
    }

    public String getmPlacementId() {
        return this.a;
    }

    public String getmUnitId() {
        return this.f13916b;
    }

    public void setmFloorPrice(String str) {
        this.f13917c = str;
    }

    public void setmPlacementId(String str) {
        this.a = str;
    }

    public void setmUnitId(String str) {
        this.f13916b = str;
    }

    public c(String str, String str2, String str3) {
        this.a = str;
        this.f13916b = str2;
        this.f13917c = str3;
    }
}
