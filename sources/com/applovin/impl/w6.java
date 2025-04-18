package com.applovin.impl;

import com.facebook.internal.AnalyticsEvents;

/* loaded from: classes2.dex */
public class w6 {

    /* renamed from: a, reason: collision with root package name */
    private final long f27698a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f27699b;

    /* renamed from: c, reason: collision with root package name */
    private String f27700c;
    private String d;

    public w6(Object obj, long j2) {
        this.f27699b = obj;
        this.f27698a = j2;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) obj;
            this.f27700c = bVar.getAdZone().d() != null ? bVar.getAdZone().d().getLabel() : null;
            this.d = "AppLovin";
        } else if (obj instanceof ge) {
            ge geVar = (ge) obj;
            this.f27700c = geVar.getFormat().getLabel();
            this.d = geVar.getNetworkName();
        }
    }

    public Object a() {
        return this.f27699b;
    }

    public long b() {
        return this.f27698a;
    }

    public String c() {
        String str = this.f27700c;
        return str != null ? str : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public String d() {
        String str = this.d;
        return str != null ? str : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }
}
