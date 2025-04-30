package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgdx {
    public static char zza(long j7) {
        boolean z8;
        char c9 = (char) j7;
        if (c9 == j7) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzfyg.zzg(z8, "Out of range: %s", j7);
        return c9;
    }

    public static char zzb(byte b, byte b8) {
        return (char) ((b << 8) | (b8 & 255));
    }
}
