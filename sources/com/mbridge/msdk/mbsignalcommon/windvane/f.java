package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import com.mbridge.msdk.mbsignalcommon.communication.BannerSignalPlugin;
import com.mbridge.msdk.mbsignalcommon.mraid.MraidSignalCommunication;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebGLCheckSignal;
import com.mbridge.msdk.splash.signal.SplashSignal;
import com.mbridge.msdk.video.signal.communication.RewardSignal;
import com.mbridge.msdk.video.signal.communication.VideoCommunication;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class f {
    private static HashMap<String, Class> a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private Context f14163b;

    /* renamed from: c, reason: collision with root package name */
    private Object f14164c;

    /* renamed from: d, reason: collision with root package name */
    private WindVaneWebView f14165d;

    public f(Context context, WindVaneWebView windVaneWebView) {
        this.f14163b = context;
        this.f14165d = windVaneWebView;
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.a, Class.forName("com.mbridge.msdk.interstitial.signalcommon.interstitial"));
        } catch (ClassNotFoundException unused) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f14076b, RewardSignal.class);
        } catch (ClassNotFoundException unused2) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f14077c, VideoCommunication.class);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f14079e, MraidSignalCommunication.class);
        } catch (ClassNotFoundException unused4) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f14080f, BannerSignalPlugin.class);
        } catch (ClassNotFoundException unused5) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f14081g, SplashSignal.class);
        } catch (ClassNotFoundException unused6) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f14082h, WebGLCheckSignal.class);
        } catch (ClassNotFoundException unused7) {
        }
        try {
            if (com.mbridge.msdk.e.b.a()) {
                Class<?> cls = Class.forName("com.mbridge.msdk.mbsignalcommon.confirmation.bridge.ConfirmationJsBridgePlugin");
                a(cls.getSimpleName(), cls);
            }
        } catch (Exception unused8) {
        }
    }

    public final void a(Context context) {
        this.f14163b = context;
    }

    public final void a(Object obj) {
        this.f14164c = obj;
    }

    private Object a(String str, WindVaneWebView windVaneWebView, Context context) {
        Class cls = a.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!h.class.isAssignableFrom(cls)) {
                return null;
            }
            h hVar = (h) cls.newInstance();
            hVar.initialize(context, windVaneWebView);
            hVar.initialize(this.f14164c, windVaneWebView);
            return hVar;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final void a(String str, Class cls) {
        if (a == null) {
            a = new HashMap<>();
        }
        a.put(str, cls);
    }

    public final Object a(String str) {
        if (a == null) {
            a = new HashMap<>();
        }
        return a(str, this.f14165d, this.f14163b);
    }
}
