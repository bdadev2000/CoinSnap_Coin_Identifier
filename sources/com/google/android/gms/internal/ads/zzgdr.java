package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes4.dex */
public final class zzgdr {
    public static char zza(long j2) {
        char c2 = (char) j2;
        zzfxz.zzg(((long) c2) == j2, "Out of range: %s", j2);
        return c2;
    }

    public static char zzb(byte b2, byte b3) {
        return (char) ((b2 << 8) | (b3 & UnsignedBytes.MAX_VALUE));
    }
}
