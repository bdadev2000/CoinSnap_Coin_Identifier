package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.os.Bundle;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes3.dex */
public class s extends c {
    boolean V;
    boolean W;
    boolean X;
    ScheduledFuture<?> Y;
    ScheduledFuture<?> Z;
    WeakReference<Activity> aa;
    boolean ab;
    long ac;
    long ad;
    float ae;
    String af;
    boolean ag;

    public s(String[] strArr, String str, int i2, String str2, Bundle bundle, String str3) {
        this(strArr, str, i2, str2, bundle, str3, BrandSafetyUtils.AdType.NATIVE);
    }

    public s(String str, long j2) {
        super(str, j2, BrandSafetyUtils.AdType.NATIVE);
        this.V = false;
        this.W = false;
        this.X = false;
        this.ab = false;
        this.ac = 0L;
        this.ad = 0L;
        this.ae = 0.0f;
        this.af = null;
        this.ag = false;
    }

    public s(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        this(str, str2, str3, screenShotOrientation, str4, str5, BrandSafetyUtils.AdType.NATIVE);
    }

    protected s(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5, BrandSafetyUtils.AdType adType) {
        super(str, str2, str3, screenShotOrientation, str4, adType);
        this.V = false;
        this.W = false;
        this.X = false;
        this.ab = false;
        this.ac = 0L;
        this.ad = 0L;
        this.ae = 0.0f;
        this.af = null;
        this.ag = false;
        this.f29383q = str5;
    }

    private s(String[] strArr, String str, int i2, String str2, Bundle bundle, String str3, BrandSafetyUtils.AdType adType) {
        super(strArr, i2, bundle, null, str, null, BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED, adType);
        this.V = false;
        this.W = false;
        this.X = false;
        this.ab = false;
        this.ac = 0L;
        this.ad = 0L;
        this.ae = 0.0f;
        this.af = null;
        this.ag = false;
        this.af = str2;
        if (str3 != null) {
            this.L = str3;
        }
    }
}
