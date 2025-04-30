package com.mbridge.msdk.foundation.controller.authoritycontroller;

import com.applovin.impl.L;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;

/* loaded from: classes3.dex */
public class c extends b {

    /* renamed from: c, reason: collision with root package name */
    private static volatile c f15403c;

    private c() {
        c();
    }

    public static void c(boolean z8) {
    }

    public static c j() {
        if (f15403c == null) {
            synchronized (c.class) {
                try {
                    if (f15403c == null) {
                        f15403c = new c();
                    }
                } finally {
                }
            }
        }
        return f15403c;
    }

    public static boolean k() {
        return true;
    }

    @Override // com.mbridge.msdk.foundation.controller.authoritycontroller.b
    public final int b(String str) {
        g f9 = L.f(h.a());
        if (f9 == null) {
            h.a();
            f9 = i.a();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return f9.at();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return f9.as();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
            return f9.au();
        }
        return -1;
    }

    public final boolean c(String str) {
        boolean z8;
        g f9 = L.f(h.a());
        if (f9 == null) {
            h.a();
            f9 = i.a();
            z8 = true;
        } else {
            z8 = false;
        }
        int ah = f9.ah();
        boolean z9 = ah != 0 ? ah == 1 && b(str) == 1 : a(str) == 1 && b(str) == 1;
        if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
            z9 = a(str) == 1;
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID) && j().g() == 2) {
            return (f9.aE() || z8 || a(str) != 1) ? false : true;
        }
        return z9;
    }
}
