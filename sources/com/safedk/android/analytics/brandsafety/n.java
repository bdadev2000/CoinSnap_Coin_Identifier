package com.safedk.android.analytics.brandsafety;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes3.dex */
public class n extends c {
    public boolean V;
    Set<String> W;
    boolean X;
    boolean Y;
    long Z;
    boolean aa;
    public String ab;
    public String ac;
    public long ad;
    public boolean ae;
    public long af;
    public BrandSafetyUtils.ScreenShotOrientation ag;
    public boolean ah;
    public h ai;
    public boolean aj;
    public ScheduledFuture<?> ak;
    public boolean al;
    public WeakReference<Activity> am;
    boolean an;
    String ao;
    boolean ap;
    private int aq;

    public boolean E() {
        return this.an;
    }

    public void f(boolean z2) {
        this.an = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int F() {
        return this.aq;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G() {
        this.aq++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H() {
        this.aq = 0;
    }

    public n(String str, int i2, Bundle bundle) {
        super(i2, bundle, null, str, null, BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED, BrandSafetyUtils.AdType.INTERSTITIAL);
        this.V = false;
        this.X = true;
        this.Y = true;
        this.aa = false;
        this.ab = null;
        this.ac = null;
        this.ad = 0L;
        this.ae = false;
        this.af = 0L;
        this.ag = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.ah = false;
        this.ai = null;
        this.aj = false;
        this.ak = null;
        this.al = false;
        this.an = false;
        this.aq = 0;
        this.ao = null;
        this.ap = false;
        this.W = new HashSet();
        if (str != null) {
            this.aj = CreativeInfoManager.a(str, AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false);
        }
    }

    public n(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        super(str, str2, str3, screenShotOrientation, str4, BrandSafetyUtils.AdType.INTERSTITIAL);
        this.V = false;
        this.X = true;
        this.Y = true;
        this.aa = false;
        this.ab = null;
        this.ac = null;
        this.ad = 0L;
        this.ae = false;
        this.af = 0L;
        this.ag = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.ah = false;
        this.ai = null;
        this.aj = false;
        this.ak = null;
        this.al = false;
        this.an = false;
        this.aq = 0;
        this.ao = null;
        this.ap = false;
        this.f29383q = str5;
    }

    public synchronized void I() {
        this.X = true;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public String toString() {
        j l2 = l();
        StringBuilder sb = new StringBuilder();
        sb.append("maxSdk: ").append(this.f29388v != null ? this.f29388v : "").append(", hash: ").append((l2 == null || l2.f29691a == null) ? "" : l2.f29691a).append(", orientation: ").append((l2 == null || l2.f29694f == null) ? "" : l2.f29694f.name()).append(", activity address: ").append(this.B != null ? this.B : "").append(", view address: ").append(this.K != null ? this.K : "").append(", interstitial activity name: ").append(this.ac != null ? this.ac : "").append(", eventId: ").append(this.L != null ? this.L : "").append(", isAdFinished: ").append(this.U).append(", number of CIs: ").append(j().size());
        return sb.toString();
    }

    public boolean J() {
        return ((this.am == null || this.am.get() == null) && (!this.aj || i() == null || i().f() == null)) ? false : true;
    }

    public View K() {
        if (this.am != null && this.am.get() != null) {
            return this.am.get().getWindow().getDecorView().findViewById(R.id.content);
        }
        if (this.aj && i() != null) {
            return i().f();
        }
        return null;
    }

    public void a(String str, boolean z2) {
        if (str != null) {
            if (this.ao == null) {
                this.ao = str;
            } else if (!z2 || !this.ao.contains(str)) {
                this.ao += ImpressionLog.P + str;
            }
        }
    }

    public void L() {
        e(this.ao);
    }

    public void M() {
        h().f29747k = true;
        this.ap = true;
        a(ImpressionLog.f29264p, new ImpressionLog.a[0]);
    }
}
