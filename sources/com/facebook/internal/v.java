package com.facebook.internal;

import android.content.SharedPreferences;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v {
    public static final v a = new v();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f11103b = new HashMap();

    public static final void a(s callback, t feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(callback, "callback");
        w.c(new u(callback, feature));
    }

    public static boolean b(t tVar) {
        boolean z10;
        switch (tVar.ordinal()) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case NOTIFICATION_REDIRECT_VALUE:
            case 30:
            case TEMPLATE_HTML_SIZE_VALUE:
                z10 = false;
                break;
            case 25:
            case 26:
            case 27:
            case 28:
            default:
                z10 = true;
                break;
        }
        AtomicBoolean atomicBoolean = w.a;
        return w.b(Intrinsics.stringPlus("FBSDKFeature", tVar), com.facebook.x.b(), z10);
    }

    public static final boolean c(t feature) {
        t k10;
        Intrinsics.checkNotNullParameter(feature, "feature");
        if (t.Unknown == feature) {
            return false;
        }
        if (t.Core == feature) {
            return true;
        }
        SharedPreferences sharedPreferences = com.facebook.x.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0);
        feature.getClass();
        String string = sharedPreferences.getString(Intrinsics.stringPlus("FBSDKFeature", feature), null);
        if (string != null && Intrinsics.areEqual(string, "16.1.3")) {
            return false;
        }
        int i10 = feature.f11100b;
        if ((i10 & 255) > 0) {
            k10 = m.k(i10 & (-256));
        } else if ((65280 & i10) > 0) {
            k10 = m.k(i10 & (-65536));
        } else if ((16711680 & i10) > 0) {
            k10 = m.k(i10 & ViewCompat.MEASURED_STATE_MASK);
        } else {
            k10 = m.k(0);
        }
        if (k10 == feature) {
            return b(feature);
        }
        if (!c(k10) || !b(feature)) {
            return false;
        }
        return true;
    }
}
