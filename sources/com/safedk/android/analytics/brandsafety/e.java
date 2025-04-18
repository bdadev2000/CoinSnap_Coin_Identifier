package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.os.Bundle;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes3.dex */
public class e extends c {
    protected static final String aq = "network_name";
    protected static final String ar = "ad_format";
    protected static final String as = "BANNER";
    protected static final String at = "MREC";
    public static final String au = "NATIVE";
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    boolean aa;
    public String ab;
    boolean ac;
    boolean ad;
    ScheduledFuture<?> ae;
    WeakReference<Activity> af;
    boolean ag;
    boolean ah;
    long ai;
    long aj;
    float ak;
    String al;
    public BannerFinder.a am;
    boolean an;
    String ao;
    String ap;

    public e(String[] strArr, String str, int i2, String str2, Bundle bundle, String str3) {
        this(strArr, str, i2, str2, bundle, str3, BrandSafetyUtils.AdType.BANNER);
    }

    public e(String str, long j2) {
        this(str, j2, BrandSafetyUtils.AdType.BANNER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e(String[] strArr, String str, int i2, String str2, Bundle bundle, String str3, BrandSafetyUtils.AdType adType) {
        super(strArr, i2, bundle, null, str, null, BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED, adType);
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.aa = false;
        this.ab = "";
        this.ac = false;
        this.ad = false;
        this.ag = false;
        this.ah = false;
        this.ai = 0L;
        this.aj = 0L;
        this.ak = 0.0f;
        this.al = null;
        this.am = null;
        this.an = false;
        this.ao = null;
        this.ap = null;
        this.al = str2;
        if (str3 != null) {
            this.L = str3;
        }
    }

    public e(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        this(str, str2, str3, screenShotOrientation, str4, str5, BrandSafetyUtils.AdType.BANNER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5, BrandSafetyUtils.AdType adType) {
        super(str, str2, str3, screenShotOrientation, str4, adType);
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.aa = false;
        this.ab = "";
        this.ac = false;
        this.ad = false;
        this.ag = false;
        this.ah = false;
        this.ai = 0L;
        this.aj = 0L;
        this.ak = 0.0f;
        this.al = null;
        this.am = null;
        this.an = false;
        this.ao = null;
        this.ap = null;
        this.f29383q = str5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e(String str, long j2, BrandSafetyUtils.AdType adType) {
        super(str, j2, adType);
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.aa = false;
        this.ab = "";
        this.ac = false;
        this.ad = false;
        this.ag = false;
        this.ah = false;
        this.ai = 0L;
        this.aj = 0L;
        this.ak = 0.0f;
        this.al = null;
        this.am = null;
        this.an = false;
        this.ao = null;
        this.ap = null;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public String toString() {
        j l2 = l();
        return super.toString() + " webView: " + this.K + " hash: " + (l2 != null ? l2.f29691a : null) + " url: " + e() + " isClicked: " + d() + " touch timestamp: " + v() + " activity address: " + this.B + " activity class name: " + this.C + " filename: " + (l2 != null ? l2.f29692b : null) + " type: " + this.f29382p + ", eventId: " + this.L + ", requestNoSamplingReceived: " + this.O + ", onVideoCompletedEventHasBeenTriggered: " + h().f29747k;
    }

    public boolean E() {
        if (this.A == null || !this.A.containsKey("network_name")) {
            return false;
        }
        return this.A.getString("network_name").contains("NATIVE");
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public void e(boolean z2) {
        super.e(z2);
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.aa = false;
        this.ab = "";
        this.ac = false;
        this.ad = false;
        this.ah = false;
        if (z2) {
            this.ak = 0.0f;
        }
        this.al = null;
        this.T = false;
        if (this.am != null && this.am.d != null) {
            this.am.d.cancel(false);
        }
        this.am = null;
        this.af = null;
        this.an = false;
        this.ao = null;
        this.ap = null;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public void C() {
        super.C();
        this.f29388v = null;
        this.af = null;
        this.al = null;
        this.aa = false;
        this.ag = false;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public void a(d dVar, Bundle bundle, int i2) {
        super.a(dVar, bundle, i2);
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        String[] a2 = b.a(foregroundActivity);
        if (foregroundActivity != null) {
            this.C = a2[0];
            this.B = a2[1];
        }
        this.f29388v = CreativeInfoManager.b(bundle.getString("network_name"));
        this.af = new WeakReference<>(BannerFinder.a(bundle));
        this.al = BrandSafetyUtils.c().name().toLowerCase();
        this.aa = true;
        this.ag = true;
    }

    public boolean F() {
        if (this.A == null || !this.A.containsKey("ad_format")) {
            return false;
        }
        return this.A.getString("ad_format").equals("MREC");
    }
}
