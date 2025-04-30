package com.vungle.ads.internal.util;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.vungle.ads.C2137s;
import java.lang.ref.WeakReference;

/* renamed from: com.vungle.ads.internal.util.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2109b {
    public /* synthetic */ C2109b(G7.f fVar) {
        this();
    }

    public static /* synthetic */ void getCONFIG_CHANGE_DELAY$annotations() {
    }

    public static /* synthetic */ void getTIMEOUT$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean startActivityHandleException(Context context, Intent intent, Intent intent2, com.vungle.ads.internal.ui.k kVar) {
        if (intent == null && intent2 == null) {
            return false;
        }
        try {
            if (intent != null) {
                context.startActivity(intent);
                if (kVar != null) {
                    kVar.onDeeplinkClick(true);
                }
            } else {
                context.startActivity(intent2);
            }
            return true;
        } catch (Exception e4) {
            u uVar = v.Companion;
            String tag = getTAG();
            G7.j.d(tag, "TAG");
            uVar.e(tag, "Cannot launch/find activity to handle the Implicit intent: " + e4);
            if (intent != null) {
                try {
                    C2137s.INSTANCE.logError$vungle_ads_release(312, "Fail to open " + intent.getDataString(), (r13 & 4) != 0 ? null : "", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
                    if (kVar != null) {
                        kVar.onDeeplinkClick(false);
                    }
                } catch (Exception unused) {
                    return false;
                }
            }
            if (intent != null && intent2 != null) {
                context.startActivity(intent2);
                return true;
            }
            return false;
        }
    }

    public final void addLifecycleListener(C2111d c2111d) {
        G7.j.e(c2111d, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        getInstance().addListener(c2111d);
    }

    public final long getCONFIG_CHANGE_DELAY() {
        long j7;
        j7 = h.CONFIG_CHANGE_DELAY;
        return j7;
    }

    public final h getInstance() {
        h hVar;
        hVar = h.instance;
        return hVar;
    }

    public final String getTAG() {
        String str;
        str = h.TAG;
        return str;
    }

    public final long getTIMEOUT() {
        long j7;
        j7 = h.TIMEOUT;
        return j7;
    }

    public final void startWhenForeground(Context context, Intent intent, Intent intent2, InterfaceC2110c interfaceC2110c, com.vungle.ads.internal.ui.k kVar) {
        G7.j.e(context, "context");
        WeakReference weakReference = new WeakReference(context);
        if (getInstance().inForeground()) {
            if (startActivityHandleException(context, intent, intent2, kVar)) {
                getInstance().addOnNextAppLeftCallback(interfaceC2110c);
                return;
            }
            return;
        }
        getInstance().addListener(new C2108a(weakReference, intent, intent2, kVar, interfaceC2110c));
    }

    private C2109b() {
    }

    public final void startWhenForeground(Context context, Intent intent, Intent intent2, InterfaceC2110c interfaceC2110c) {
        G7.j.e(context, "context");
        startWhenForeground(context, intent, intent2, interfaceC2110c, null);
    }
}
