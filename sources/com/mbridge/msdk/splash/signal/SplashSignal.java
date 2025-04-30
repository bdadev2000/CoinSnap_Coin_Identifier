package com.mbridge.msdk.splash.signal;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.L;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class SplashSignal extends AbsFeedBackForH5 {

    /* renamed from: a, reason: collision with root package name */
    private static String f17958a = "SplashSignal";

    /* renamed from: e, reason: collision with root package name */
    private c f17959e;

    public void getFileInfo(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                d.a(obj, new JSONObject(str));
            }
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        if (obj != null) {
            try {
                WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b;
                if (windVaneWebView != null && windVaneWebView.getWebViewListener() != null) {
                    windVaneWebView.getWebViewListener().a(windVaneWebView, 0, str.toString(), windVaneWebView.getUrl());
                }
            } catch (Throwable th) {
                ad.b(f17958a, "handlerH5Exception", th);
            }
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        try {
            d.b(obj, new JSONObject(str));
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    public void init(Object obj, String str) {
        L.B("initialize", str, f17958a);
        c cVar = this.f17959e;
        if (cVar != null) {
            cVar.a(obj, str);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.h
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof c)) {
                this.f17959e = (c) windVaneWebView.getObject();
            }
        } catch (Throwable th) {
            ad.b(f17958a, "initialize", th);
        }
    }

    public void install(Object obj, String str) {
        c cVar = this.f17959e;
        if (cVar != null) {
            cVar.d(obj, str);
        }
    }

    public void onSignalCommunication(Object obj, String str) {
        try {
            ad.b(f17958a, "onSignalCommunication");
            c cVar = this.f17959e;
            if (cVar != null) {
                cVar.i(obj, str);
            }
        } catch (Throwable th) {
            ad.b(f17958a, "onSignalCommunication", th);
        }
    }

    public void openURL(Object obj, String str) {
        L.B("openURL", str, f17958a);
        c cVar = this.f17959e;
        if (cVar != null) {
            cVar.e(obj, str);
        }
    }

    public void pauseCountDown(Object obj, String str) {
        try {
            ad.b(f17958a, "pauseCountDown");
            c cVar = this.f17959e;
            if (cVar != null) {
                cVar.j(obj, str);
            }
        } catch (Throwable th) {
            ad.b(f17958a, "pauseCountDown", th);
        }
    }

    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                int optInt = new JSONObject(str).optInt("isReady", 1);
                WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b;
                if (windVaneWebView != null && windVaneWebView.getWebViewListener() != null) {
                    windVaneWebView.getWebViewListener().a(windVaneWebView, optInt);
                }
            } catch (Throwable th) {
                ad.b(f17958a, "readyStatus", th);
            }
        }
    }

    public void reportUrls(Object obj, String str) {
        try {
            ad.b(f17958a, "reportUrls");
            c cVar = this.f17959e;
            if (cVar != null) {
                cVar.h(obj, str);
            }
        } catch (Throwable th) {
            ad.b(f17958a, "reportUrls", th);
        }
    }

    public void resetCountdown(Object obj, String str) {
        L.B("resetCountdown", str, f17958a);
        c cVar = this.f17959e;
        if (cVar != null) {
            cVar.f(obj, str);
        }
    }

    public void resumeCountDown(Object obj, String str) {
        try {
            ad.b(f17958a, "resumeCountDown");
            c cVar = this.f17959e;
            if (cVar != null) {
                cVar.k(obj, str);
            }
        } catch (Throwable th) {
            ad.b(f17958a, "resumeCountDown", th);
        }
    }

    public void sendImpressions(Object obj, String str) {
        try {
            ad.b(f17958a, "sendImpressions");
            c cVar = this.f17959e;
            if (cVar != null) {
                cVar.g(obj, str);
            }
        } catch (Throwable th) {
            ad.b(f17958a, "sendImpressions", th);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        L.B("toggleCloseBtn", str, f17958a);
        c cVar = this.f17959e;
        if (cVar != null) {
            cVar.b(obj, str);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        L.B("triggerCloseBtn", str, f17958a);
        c cVar = this.f17959e;
        if (cVar != null) {
            cVar.c(obj, str);
        }
    }
}
