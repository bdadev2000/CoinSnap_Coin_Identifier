package com.safedk.android.analytics.brandsafety.creatives;

import android.os.Bundle;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Bundle f29501a = new Bundle();

    public boolean a(AdNetworkConfiguration adNetworkConfiguration) {
        return this.f29501a.containsKey(adNetworkConfiguration.name());
    }

    public boolean b(AdNetworkConfiguration adNetworkConfiguration) {
        return this.f29501a.getBoolean(adNetworkConfiguration.name());
    }

    public boolean a(AdNetworkConfiguration adNetworkConfiguration, boolean z2) {
        return this.f29501a.getBoolean(adNetworkConfiguration.name(), z2);
    }

    public String c(AdNetworkConfiguration adNetworkConfiguration) {
        return this.f29501a.getString(adNetworkConfiguration.name());
    }

    public String a(AdNetworkConfiguration adNetworkConfiguration, String str) {
        return this.f29501a.getString(adNetworkConfiguration.name(), str);
    }

    public float d(AdNetworkConfiguration adNetworkConfiguration) {
        return this.f29501a.getFloat(adNetworkConfiguration.name());
    }

    public long e(AdNetworkConfiguration adNetworkConfiguration) {
        return this.f29501a.getLong(adNetworkConfiguration.name());
    }

    public void b(AdNetworkConfiguration adNetworkConfiguration, boolean z2) {
        this.f29501a.putBoolean(adNetworkConfiguration.name(), z2);
    }

    public void b(AdNetworkConfiguration adNetworkConfiguration, String str) {
        this.f29501a.putString(adNetworkConfiguration.name(), str);
    }

    public void a(AdNetworkConfiguration adNetworkConfiguration, float f2) {
        this.f29501a.putFloat(adNetworkConfiguration.name(), f2);
    }

    public void a(AdNetworkConfiguration adNetworkConfiguration, long j2) {
        this.f29501a.putLong(adNetworkConfiguration.name(), j2);
    }

    public String toString() {
        return this.f29501a.toString();
    }
}
