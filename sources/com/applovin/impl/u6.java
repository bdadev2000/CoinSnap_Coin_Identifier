package com.applovin.impl;

/* loaded from: classes.dex */
public class u6 {

    /* renamed from: a, reason: collision with root package name */
    private final long f11566a;
    private final Object b;

    /* renamed from: c, reason: collision with root package name */
    private String f11567c;

    /* renamed from: d, reason: collision with root package name */
    private String f11568d;

    public u6(Object obj, long j7) {
        String str;
        this.b = obj;
        this.f11566a = j7;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) obj;
            if (bVar.getAdZone().d() != null) {
                str = bVar.getAdZone().d().getLabel();
            } else {
                str = null;
            }
            this.f11567c = str;
            this.f11568d = "AppLovin";
            return;
        }
        if (obj instanceof be) {
            be beVar = (be) obj;
            this.f11567c = beVar.getFormat().getLabel();
            this.f11568d = beVar.getNetworkName();
        }
    }

    public Object a() {
        return this.b;
    }

    public long b() {
        return this.f11566a;
    }

    public String c() {
        String str = this.f11567c;
        if (str == null) {
            return "Unknown";
        }
        return str;
    }

    public String d() {
        String str = this.f11568d;
        if (str == null) {
            return "Unknown";
        }
        return str;
    }
}
