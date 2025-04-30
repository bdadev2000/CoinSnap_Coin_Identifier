package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import com.mbridge.msdk.mbsignalcommon.communication.BannerSignalPlugin;
import com.mbridge.msdk.mbsignalcommon.mraid.MraidSignalCommunication;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebGLCheckSignal;
import com.mbridge.msdk.splash.signal.SplashSignal;
import com.mbridge.msdk.video.signal.communication.RewardSignal;
import com.mbridge.msdk.video.signal.communication.VideoCommunication;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, Class> f16693a = new HashMap<>();
    private Context b;

    /* renamed from: c, reason: collision with root package name */
    private Object f16694c;

    /* renamed from: d, reason: collision with root package name */
    private WindVaneWebView f16695d;

    public f(Context context, WindVaneWebView windVaneWebView) {
        this.b = context;
        this.f16695d = windVaneWebView;
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f16586a, Class.forName("com.mbridge.msdk.interstitial.signalcommon.interstitial"));
        } catch (ClassNotFoundException unused) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.b, RewardSignal.class);
        } catch (ClassNotFoundException unused2) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f16587c, VideoCommunication.class);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f16589e, MraidSignalCommunication.class);
        } catch (ClassNotFoundException unused4) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f16590f, BannerSignalPlugin.class);
        } catch (ClassNotFoundException unused5) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f16591g, SplashSignal.class);
        } catch (ClassNotFoundException unused6) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f16592h, WebGLCheckSignal.class);
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
        this.b = context;
    }

    public final void a(Object obj) {
        this.f16694c = obj;
    }

    private Object a(String str, WindVaneWebView windVaneWebView, Context context) {
        Class cls = f16693a.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!h.class.isAssignableFrom(cls)) {
                return null;
            }
            h hVar = (h) cls.newInstance();
            hVar.initialize(context, windVaneWebView);
            hVar.initialize(this.f16694c, windVaneWebView);
            return hVar;
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public final void a(String str, Class cls) {
        if (f16693a == null) {
            f16693a = new HashMap<>();
        }
        f16693a.put(str, cls);
    }

    public final Object a(String str) {
        if (f16693a == null) {
            f16693a = new HashMap<>();
        }
        return a(str, this.f16695d, this.b);
    }
}
