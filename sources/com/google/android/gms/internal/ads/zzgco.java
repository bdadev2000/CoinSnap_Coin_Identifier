package com.google.android.gms.internal.ads;

import kotlin.UByte;

/* loaded from: classes3.dex */
public final class zzgco {
    public static char zza(long j3) {
        boolean z10;
        char c10 = (char) j3;
        if (c10 == j3) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfwq.zzh(z10, "Out of range: %s", j3);
        return c10;
    }

    public static char zzb(byte b3, byte b10) {
        return (char) ((b3 << 8) | (b10 & UByte.MAX_VALUE));
    }
}
