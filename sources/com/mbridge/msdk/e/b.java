package com.mbridge.msdk.e;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.MBConfiguration;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Boolean f15330a;
    private static volatile Boolean b;

    public static boolean a() {
        boolean z8;
        if (f15330a == null) {
            try {
                if (Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 2) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                f15330a = Boolean.valueOf(z8);
                return z8;
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CommonUtils", "isChina", e4);
                }
            }
        }
        if (f15330a == null || !f15330a.booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean b() {
        boolean z8;
        if (b == null) {
            try {
                if (Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                b = Boolean.valueOf(z8);
                return z8;
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CommonUtils", "isOversea", e4);
                }
            }
        }
        if (b == null || !b.booleanValue()) {
            return false;
        }
        return true;
    }
}
