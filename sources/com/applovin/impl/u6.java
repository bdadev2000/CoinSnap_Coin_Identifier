package com.applovin.impl;

/* loaded from: classes.dex */
public class u6 {
    private final long a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f8353b;

    /* renamed from: c, reason: collision with root package name */
    private String f8354c;

    /* renamed from: d, reason: collision with root package name */
    private String f8355d;

    public u6(Object obj, long j3) {
        String str;
        this.f8353b = obj;
        this.a = j3;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) obj;
            if (bVar.getAdZone().d() != null) {
                str = bVar.getAdZone().d().getLabel();
            } else {
                str = null;
            }
            this.f8354c = str;
            this.f8355d = "AppLovin";
            return;
        }
        if (obj instanceof be) {
            be beVar = (be) obj;
            this.f8354c = beVar.getFormat().getLabel();
            this.f8355d = beVar.getNetworkName();
        }
    }

    public Object a() {
        return this.f8353b;
    }

    public long b() {
        return this.a;
    }

    public String c() {
        String str = this.f8354c;
        return str != null ? str : "Unknown";
    }

    public String d() {
        String str = this.f8355d;
        return str != null ? str : "Unknown";
    }
}
