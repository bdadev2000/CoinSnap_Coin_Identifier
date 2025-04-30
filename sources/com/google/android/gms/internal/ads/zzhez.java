package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzhez {
    final Unsafe zza;

    public zzhez(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract byte zza(long j7);

    public abstract double zzb(Object obj, long j7);

    public abstract float zzc(Object obj, long j7);

    public abstract void zzd(long j7, byte[] bArr, long j9, long j10);

    public abstract void zze(Object obj, long j7, boolean z8);

    public abstract void zzf(Object obj, long j7, byte b);

    public abstract void zzg(Object obj, long j7, double d2);

    public abstract void zzh(Object obj, long j7, float f9);

    public abstract boolean zzi(Object obj, long j7);
}
