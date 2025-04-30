package com.facebook.internal;

import androidx.core.view.ViewCompat;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f13653a = new Object();
    public static final HashMap b = new HashMap();

    public static final void a(InterfaceC1846o interfaceC1846o, p pVar) {
        G7.j.e(pVar, "feature");
        s.c(new q(interfaceC1846o, pVar));
    }

    public static final boolean b(p pVar) {
        p a6;
        boolean z8;
        G7.j.e(pVar, "feature");
        boolean z9 = false;
        if (p.Unknown == pVar) {
            return false;
        }
        if (p.Core == pVar) {
            return true;
        }
        String string = com.facebook.r.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(G7.j.j(pVar, "FBSDKFeature"), null);
        if (string != null && string.equals("16.1.3")) {
            return false;
        }
        int i9 = pVar.b;
        if ((i9 & 255) > 0) {
            a6 = AbstractC1839h.a(i9 & (-256));
        } else if ((65280 & i9) > 0) {
            a6 = AbstractC1839h.a(i9 & (-65536));
        } else if ((16711680 & i9) > 0) {
            a6 = AbstractC1839h.a(i9 & ViewCompat.MEASURED_STATE_MASK);
        } else {
            a6 = AbstractC1839h.a(0);
        }
        if (a6 == pVar) {
            switch (pVar.ordinal()) {
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
                case 29:
                case AD_PLAY_RESET_ON_DEINIT_VALUE:
                case 31:
                    break;
                case 25:
                case 26:
                case 27:
                case 28:
                default:
                    z9 = true;
                    break;
            }
            AtomicBoolean atomicBoolean = s.f13654a;
            return s.b(G7.j.j(pVar, "FBSDKFeature"), com.facebook.r.b(), z9);
        }
        if (!b(a6)) {
            return false;
        }
        switch (pVar.ordinal()) {
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
            case 29:
            case AD_PLAY_RESET_ON_DEINIT_VALUE:
            case 31:
                z8 = false;
                break;
            case 25:
            case 26:
            case 27:
            case 28:
            default:
                z8 = true;
                break;
        }
        AtomicBoolean atomicBoolean2 = s.f13654a;
        if (!s.b(G7.j.j(pVar, "FBSDKFeature"), com.facebook.r.b(), z8)) {
            return false;
        }
        return true;
    }
}
