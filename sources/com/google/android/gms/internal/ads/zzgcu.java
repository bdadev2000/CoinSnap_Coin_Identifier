package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgcu {
    public static byte zza(long j3) {
        boolean z10;
        if ((j3 >> 8) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfwq.zzh(z10, "out of range: %s", j3);
        return (byte) j3;
    }
}
