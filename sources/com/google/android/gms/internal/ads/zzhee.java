package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzhee {
    final Unsafe zza;

    public zzhee(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract byte zza(long j2);

    public abstract double zzb(Object obj, long j2);

    public abstract float zzc(Object obj, long j2);

    public abstract void zzd(long j2, byte[] bArr, long j3, long j4);

    public abstract void zze(Object obj, long j2, boolean z2);

    public abstract void zzf(Object obj, long j2, byte b2);

    public abstract void zzg(Object obj, long j2, double d);

    public abstract void zzh(Object obj, long j2, float f2);

    public abstract boolean zzi(Object obj, long j2);
}
