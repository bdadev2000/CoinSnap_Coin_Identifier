package com.mbridge.msdk.foundation.controller.authoritycontroller;

import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;

/* loaded from: classes4.dex */
public class c extends b {

    /* renamed from: c, reason: collision with root package name */
    private static volatile c f13048c;

    private c() {
        c();
    }

    public static void c(boolean z10) {
    }

    public static c j() {
        if (f13048c == null) {
            synchronized (c.class) {
                if (f13048c == null) {
                    f13048c = new c();
                }
            }
        }
        return f13048c;
    }

    public static boolean k() {
        return true;
    }

    @Override // com.mbridge.msdk.foundation.controller.authoritycontroller.b
    public final int b(String str) {
        g d10 = e.d(h.a());
        if (d10 == null) {
            h.a();
            d10 = i.a();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return d10.at();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return d10.as();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
            return d10.au();
        }
        return -1;
    }

    public final boolean c(String str) {
        boolean z10;
        g d10 = e.d(h.a());
        if (d10 == null) {
            h.a();
            d10 = i.a();
            z10 = true;
        } else {
            z10 = false;
        }
        int ah2 = d10.ah();
        boolean z11 = ah2 != 0 ? ah2 == 1 && b(str) == 1 : a(str) == 1 && b(str) == 1;
        if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
            z11 = a(str) == 1;
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID) && j().g() == 2) {
            return (d10.aE() || z10 || a(str) != 1) ? false : true;
        }
        return z11;
    }
}
