package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
abstract class zzfr {
    public abstract int zza(int i9, byte[] bArr, int i10, int i11);

    public final boolean zzb(byte[] bArr, int i9, int i10) {
        if (zza(0, bArr, i9, i10) != 0) {
            return false;
        }
        return true;
    }
}
