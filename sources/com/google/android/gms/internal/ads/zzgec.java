package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgec {
    public static byte zza(long j7) {
        boolean z8;
        if ((j7 >> 8) == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzfyg.zzg(z8, "out of range: %s", j7);
        return (byte) j7;
    }
}
