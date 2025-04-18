package com.safedk.android.analytics.brandsafety;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    String f29691a = null;

    /* renamed from: b, reason: collision with root package name */
    String f29692b = null;

    /* renamed from: c, reason: collision with root package name */
    long f29693c = 0;
    int d = 0;
    int e = 0;

    /* renamed from: f, reason: collision with root package name */
    BrandSafetyUtils.ScreenShotOrientation f29694f = null;

    /* renamed from: g, reason: collision with root package name */
    boolean f29695g = false;

    public j(String str, String str2, long j2, int i2, int i3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, boolean z2) {
        a(str, str2, j2, i2, i3, screenShotOrientation, z2);
    }

    public j(String str, String str2, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation) {
        a(str, str2, 0L, 0, 0, screenShotOrientation, false);
    }

    private void a(String str, String str2, long j2, int i2, int i3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, boolean z2) {
        this.f29691a = str;
        this.f29692b = str2;
        this.f29693c = j2;
        this.d = i2;
        this.e = i3;
        this.f29694f = screenShotOrientation;
        this.f29695g = z2;
    }

    public float a(int i2) {
        return (this.d * 100) / i2;
    }

    public String toString() {
        return "fileName=" + this.f29692b + ", hashValue=" + this.f29691a;
    }
}
