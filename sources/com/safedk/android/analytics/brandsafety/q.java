package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.os.Bundle;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class q extends BannerFinder {
    public q(int i2) {
        super(BrandSafetyUtils.AdType.MREC, Arrays.asList(BrandSafetyUtils.f29192o), "MrecFinder", i2);
    }

    @Override // com.safedk.android.analytics.brandsafety.BannerFinder, com.safedk.android.analytics.brandsafety.b
    protected c a(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        return new r(str, str2, str3, screenShotOrientation, str4, str5);
    }

    @Override // com.safedk.android.analytics.brandsafety.BannerFinder
    protected e a(Activity activity, String str, int i2, String str2, Bundle bundle, String str3) {
        r rVar = new r(a(com.safedk.android.internal.b.getInstance().getForegroundActivity()), str, i2, str2, bundle, str3);
        rVar.af = new WeakReference<>(activity);
        return rVar;
    }

    @Override // com.safedk.android.analytics.brandsafety.BannerFinder
    protected boolean g(String str, String str2) {
        boolean a2 = CreativeInfoManager.a(str2, AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, false);
        String a3 = CreativeInfoManager.a(str2, AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, (String) null);
        Logger.d(this.f29366a, "sdk " + str2 + ": config item SUPPORTS_MREC_IMPRESSION_TRACKING is " + a2 + ", config item AD_NETWORK_TO_IGNORE is " + a3 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (a2 && !str.equals(a3)) {
            return true;
        }
        Logger.d(this.f29366a, "MREC tracking is not supported for this ad network (" + str + ")");
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.BannerFinder
    protected boolean a(e eVar) {
        if (eVar == null) {
            return false;
        }
        if (!SafeDK.getInstance().G()) {
            CreativeInfo i2 = eVar.i();
            if (i2 == null) {
                Logger.d(this.f29366a, "don't take screenshot, no creative info yet");
                return false;
            }
            if (BrandSafetyUtils.f29192o.equals(i2.I())) {
                boolean a2 = CreativeInfoManager.a(eVar.f29388v, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                if (i2.ah() && !a2) {
                    Logger.d(this.f29366a, "don't take screenshot, multi ad, sdk: " + eVar.f29388v);
                    return false;
                }
                if (j(eVar.c())) {
                    if (!i2.v()) {
                        Logger.d(this.f29366a, "take screenshot, MREC ad is not a video ad");
                        return true;
                    }
                    if (eVar.h().f29747k) {
                        Logger.d(this.f29366a, "take screenshot, MREC video ad finished playing or sdk configured to take screenshots throughout the impression. ");
                        return true;
                    }
                    Logger.d(this.f29366a, "don't take screenshot, MREC video hasn't finished playing yet, waiting for video completed event");
                    return false;
                }
                Logger.d(this.f29366a, "take screenshot, sdk " + eVar.c() + " Mrec EOV is not supported");
                return true;
            }
            Logger.d(this.f29366a, "take screenshot, MREC ad, take screenshot");
            return true;
        }
        Logger.d(this.f29366a, "take screenshot, SafeDK Config item 'AlwaysTakeScreenshot' is true");
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.BannerFinder
    protected boolean j(String str) {
        boolean a2 = CreativeInfoManager.a(str, AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, false);
        Logger.d(this.f29366a, "take screenshot, supports Mrec EOV value is " + a2);
        return a2;
    }

    @Override // com.safedk.android.analytics.brandsafety.BannerFinder, com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, boolean z2) {
        boolean z3;
        synchronized (BannerFinder.class) {
            Logger.d(this.f29366a, "on video completed - keys : " + I.keySet() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            Iterator<e> it = I.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z3 = false;
                    break;
                }
                e next = it.next();
                if (next.K != null && next.K.equals(str2)) {
                    if (z2) {
                        next.a(ImpressionLog.f29264p, new ImpressionLog.a[0]);
                    } else {
                        next.a(ImpressionLog.f29263o, new ImpressionLog.a(ImpressionLog.K, "webview"));
                    }
                    CreativeInfo i2 = next.i();
                    Logger.d(this.f29366a, "on video completed - view address: " + str2 + ", ad format: " + (i2 != null ? i2.I() : null) + ", video completed: " + z2 + ", current value: " + next.h().f29747k);
                    if (i2 != null) {
                        Logger.d(this.f29366a, "on mrec video event triggered - setting ci ad as video ad.");
                        i2.d(true);
                        if (i2.I() == null) {
                            Logger.d(this.f29366a, "on video completed - setting CI ad format, based on view address match");
                            i2.p(BrandSafetyUtils.f29192o);
                        }
                        if (!next.h().f29747k && z2) {
                            b(next);
                            if (!i2.v()) {
                                Logger.d(this.f29366a, "on video completed - setting CI as video ad");
                                i2.d(true);
                            }
                            Logger.d(this.f29366a, "on video completed - setting to: " + z2);
                            next.h().f29747k = true;
                            next.a(ImpressionLog.f29264p, new ImpressionLog.a[0]);
                            if (j(next.c())) {
                                if (next.am != null) {
                                    Logger.d(this.f29366a, "on video completed - impressionHandlerTask = " + next.am + ", taskFuture = " + next.am.d);
                                    if (next.am.d != null) {
                                        Logger.d(this.f29366a, "on video completed - cancelling existing taskFuture " + next.am.d);
                                        next.am.d.cancel(false);
                                        next.am.d = null;
                                    }
                                    int U = SafeDK.getInstance().U() * 1000;
                                    Logger.d(this.f29366a, "on video completed - start taking screenshots for view: " + ((next.am.f29166b == null || next.am.f29166b.get() == null) ? "null" : next.am.f29166b.get()) + ", samplingInterval = " + U);
                                    next.am.d = this.D.scheduleAtFixedRate(next.am, 500L, U, TimeUnit.MILLISECONDS);
                                }
                            } else {
                                Logger.d(this.f29366a, "on video completed - Info impressionHandlerTask is null : " + next);
                            }
                        } else if (!z2) {
                            next.h().f29747k = false;
                            next.a(ImpressionLog.f29263o, new ImpressionLog.a(ImpressionLog.K, "webview"));
                        }
                    }
                    z3 = true;
                }
            }
        }
        return z3;
    }

    private void b(e eVar) {
        if (!eVar.h().f29747k && !eVar.I) {
            Logger.d(this.f29366a, "Video is marked as completed, clearing any images taken previously, isOnUiThread = " + com.safedk.android.utils.k.c());
            for (l lVar : eVar.g()) {
                if (lVar.e() != null && eVar.K.equals(lVar.e().af())) {
                    a(lVar);
                }
            }
            eVar.I = true;
            return;
        }
        Logger.d(this.f29366a, "avoid clearing any images taken previously: onVideoCompletedEventHasBeenTriggered=" + eVar.h().f29747k + ", impressionScreenshotsRemoved=" + eVar.I);
    }
}
