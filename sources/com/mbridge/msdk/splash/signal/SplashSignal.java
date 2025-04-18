package com.mbridge.msdk.splash.signal;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class SplashSignal extends AbsFeedBackForH5 {
    private static String a = "SplashSignal";

    /* renamed from: e, reason: collision with root package name */
    private c f15254e;

    public void getFileInfo(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                d.a(obj, new JSONObject(str));
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        if (obj != null) {
            try {
                WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b;
                if (windVaneWebView != null && windVaneWebView.getWebViewListener() != null) {
                    windVaneWebView.getWebViewListener().a(windVaneWebView, 0, str.toString(), windVaneWebView.getUrl());
                }
            } catch (Throwable th2) {
                ad.b(a, "handlerH5Exception", th2);
            }
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        try {
            d.b(obj, new JSONObject(str));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void init(Object obj, String str) {
        e.z("initialize", str, a);
        c cVar = this.f15254e;
        if (cVar != null) {
            cVar.a(obj, str);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.h
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof c)) {
                this.f15254e = (c) windVaneWebView.getObject();
            }
        } catch (Throwable th2) {
            ad.b(a, "initialize", th2);
        }
    }

    public void install(Object obj, String str) {
        c cVar = this.f15254e;
        if (cVar != null) {
            cVar.d(obj, str);
        }
    }

    public void onSignalCommunication(Object obj, String str) {
        try {
            ad.b(a, "onSignalCommunication");
            c cVar = this.f15254e;
            if (cVar != null) {
                cVar.i(obj, str);
            }
        } catch (Throwable th2) {
            ad.b(a, "onSignalCommunication", th2);
        }
    }

    public void openURL(Object obj, String str) {
        e.z("openURL", str, a);
        c cVar = this.f15254e;
        if (cVar != null) {
            cVar.e(obj, str);
        }
    }

    public void pauseCountDown(Object obj, String str) {
        try {
            ad.b(a, "pauseCountDown");
            c cVar = this.f15254e;
            if (cVar != null) {
                cVar.j(obj, str);
            }
        } catch (Throwable th2) {
            ad.b(a, "pauseCountDown", th2);
        }
    }

    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                int optInt = new JSONObject(str).optInt("isReady", 1);
                WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b;
                if (windVaneWebView != null && windVaneWebView.getWebViewListener() != null) {
                    windVaneWebView.getWebViewListener().a(windVaneWebView, optInt);
                }
            } catch (Throwable th2) {
                ad.b(a, "readyStatus", th2);
            }
        }
    }

    public void reportUrls(Object obj, String str) {
        try {
            ad.b(a, "reportUrls");
            c cVar = this.f15254e;
            if (cVar != null) {
                cVar.h(obj, str);
            }
        } catch (Throwable th2) {
            ad.b(a, "reportUrls", th2);
        }
    }

    public void resetCountdown(Object obj, String str) {
        e.z("resetCountdown", str, a);
        c cVar = this.f15254e;
        if (cVar != null) {
            cVar.f(obj, str);
        }
    }

    public void resumeCountDown(Object obj, String str) {
        try {
            ad.b(a, "resumeCountDown");
            c cVar = this.f15254e;
            if (cVar != null) {
                cVar.k(obj, str);
            }
        } catch (Throwable th2) {
            ad.b(a, "resumeCountDown", th2);
        }
    }

    public void sendImpressions(Object obj, String str) {
        try {
            ad.b(a, "sendImpressions");
            c cVar = this.f15254e;
            if (cVar != null) {
                cVar.g(obj, str);
            }
        } catch (Throwable th2) {
            ad.b(a, "sendImpressions", th2);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        e.z("toggleCloseBtn", str, a);
        c cVar = this.f15254e;
        if (cVar != null) {
            cVar.b(obj, str);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        e.z("triggerCloseBtn", str, a);
        c cVar = this.f15254e;
        if (cVar != null) {
            cVar.c(obj, str);
        }
    }
}
