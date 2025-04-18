package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzhbt {
    final Unsafe zza;

    public zzhbt(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract byte zza(long j3);

    public abstract double zzb(Object obj, long j3);

    public abstract float zzc(Object obj, long j3);

    public abstract void zzd(long j3, byte[] bArr, long j10, long j11);

    public abstract void zze(Object obj, long j3, boolean z10);

    public abstract void zzf(Object obj, long j3, byte b3);

    public abstract void zzg(Object obj, long j3, double d10);

    public abstract void zzh(Object obj, long j3, float f10);

    public abstract boolean zzi(Object obj, long j3);
}
