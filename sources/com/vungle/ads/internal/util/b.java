package com.vungle.ads.internal.util;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {
    private b() {
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
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
        } catch (Exception e2) {
            u uVar = v.Companion;
            String TAG = getTAG();
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            uVar.e(TAG, "Cannot launch/find activity to handle the Implicit intent: " + e2);
            if (intent != null) {
                try {
                    com.vungle.ads.s.INSTANCE.logError$vungle_ads_release(312, "Fail to open " + intent.getDataString(), (r13 & 4) != 0 ? null : "", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
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

    public final void addLifecycleListener(d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getInstance().addListener(listener);
    }

    public final long getCONFIG_CHANGE_DELAY() {
        long j3;
        j3 = h.CONFIG_CHANGE_DELAY;
        return j3;
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
        long j3;
        j3 = h.TIMEOUT;
        return j3;
    }

    public final void startWhenForeground(Context context, Intent intent, Intent intent2, c cVar, com.vungle.ads.internal.ui.k kVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        WeakReference weakReference = new WeakReference(context);
        if (getInstance().inForeground()) {
            if (startActivityHandleException(context, intent, intent2, kVar)) {
                getInstance().addOnNextAppLeftCallback(cVar);
                return;
            }
            return;
        }
        getInstance().addListener(new a(weakReference, intent, intent2, kVar, cVar));
    }

    public final void startWhenForeground(Context context, Intent intent, Intent intent2, c cVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        startWhenForeground(context, intent, intent2, cVar, null);
    }
}
