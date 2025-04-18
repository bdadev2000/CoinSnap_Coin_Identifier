package com.mbridge.msdk.e;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.MBConfiguration;

/* loaded from: classes4.dex */
public final class b {
    private static volatile Boolean a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Boolean f12972b;

    public static boolean a() {
        boolean z10;
        if (a == null) {
            try {
                if (Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean valueOf = Boolean.valueOf(z10);
                a = valueOf;
                return valueOf.booleanValue();
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CommonUtils", "isChina", e2);
                }
            }
        }
        if (a != null && a.booleanValue()) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        boolean z10;
        if (f12972b == null) {
            try {
                if (Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean valueOf = Boolean.valueOf(z10);
                f12972b = valueOf;
                return valueOf.booleanValue();
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CommonUtils", "isOversea", e2);
                }
            }
        }
        if (f12972b == null || !f12972b.booleanValue()) {
            return false;
        }
        return true;
    }
}
