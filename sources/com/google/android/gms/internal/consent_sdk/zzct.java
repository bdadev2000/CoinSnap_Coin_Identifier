package com.google.android.gms.internal.consent_sdk;

import android.os.Build;

/* loaded from: classes4.dex */
public final class zzct {
    public static boolean zza(boolean z2) {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator") || Build.HARDWARE.contains("ranchu");
    }
}
