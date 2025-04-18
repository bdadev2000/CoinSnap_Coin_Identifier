package com.google.android.gms.common.util;

import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;
import j0.b;
import kotlin.jvm.internal.Intrinsics;

@KeepForSdk
/* loaded from: classes3.dex */
public final class PlatformVersion {
    private PlatformVersion() {
    }

    @KeepForSdk
    public static boolean isAtLeastHoneycomb() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastHoneycombMR1() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastIceCreamSandwich() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastIceCreamSandwichMR1() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastJellyBean() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastJellyBeanMR1() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastJellyBeanMR2() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastKitKat() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastKitKatWatch() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastLollipop() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastLollipopMR1() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastM() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastN() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @KeepForSdk
    public static boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @KeepForSdk
    public static boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @KeepForSdk
    public static boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @KeepForSdk
    public static boolean isAtLeastS() {
        return Build.VERSION.SDK_INT >= 31;
    }

    @KeepForSdk
    public static boolean isAtLeastSv2() {
        return Build.VERSION.SDK_INT >= 32;
    }

    @KeepForSdk
    public static boolean isAtLeastT() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @KeepForSdk
    public static boolean isAtLeastU() {
        if (!isAtLeastT()) {
            return false;
        }
        int i10 = b.a;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 34) {
            if (i11 < 33) {
                return false;
            }
            String CODENAME = Build.VERSION.CODENAME;
            Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
            if (!b.a("UpsideDownCake", CODENAME)) {
                return false;
            }
        }
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastV() {
        if (!isAtLeastU()) {
            return false;
        }
        int i10 = b.a;
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
        if (!b.a("VanillaIceCream", CODENAME)) {
            return false;
        }
        return true;
    }
}
