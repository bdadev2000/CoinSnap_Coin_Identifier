package com.safedk.android.analytics.brandsafety;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public Long f29753a = Long.valueOf(System.currentTimeMillis());

    /* renamed from: b, reason: collision with root package name */
    public Long f29754b = Long.valueOf(SystemClock.elapsedRealtime());

    /* renamed from: c, reason: collision with root package name */
    public String f29755c;
    public String d;
    public String e;

    /* renamed from: f, reason: collision with root package name */
    public String f29756f;

    /* renamed from: g, reason: collision with root package name */
    public m f29757g;

    public m(String str, String str2, String str3, String str4, m mVar) {
        this.f29755c = str;
        this.d = str2;
        this.e = str3;
        this.f29756f = str4;
        this.f29757g = mVar;
    }

    public String toString() {
        return "IntentDetails{ " + this.f29754b + ", " + this.f29755c + ", " + this.d + ", " + this.e + ", " + this.f29756f + " }";
    }
}
