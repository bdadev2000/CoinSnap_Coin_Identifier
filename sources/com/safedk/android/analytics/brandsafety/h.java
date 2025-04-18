package com.safedk.android.analytics.brandsafety;

import com.safedk.android.utils.Logger;

/* loaded from: classes3.dex */
public class h {
    private static final String d = "ClickUrlCandidate";

    /* renamed from: a, reason: collision with root package name */
    public long f29658a;

    /* renamed from: b, reason: collision with root package name */
    public String f29659b;

    /* renamed from: c, reason: collision with root package name */
    public String f29660c;

    public h(long j2, String str, String str2) {
        this.f29658a = 0L;
        Logger.d(d, "click URL candidate, current time: " + j2 + ", click URL: " + str + ", view address: " + str2);
        this.f29658a = j2;
        this.f29659b = str;
        this.f29660c = str2;
    }

    public h(long j2, String str) {
        this.f29658a = 0L;
        Logger.d(d, "click url candidate, currentTime=" + j2 + ", clickUrl=" + str);
        this.f29658a = j2;
        this.f29659b = str;
    }
}
