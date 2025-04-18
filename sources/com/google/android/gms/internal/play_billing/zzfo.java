package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzfo {
    final Unsafe zza;

    public zzfo(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j3);

    public abstract float zzb(Object obj, long j3);

    public abstract void zzc(Object obj, long j3, boolean z10);

    public abstract void zzd(Object obj, long j3, byte b3);

    public abstract void zze(Object obj, long j3, double d10);

    public abstract void zzf(Object obj, long j3, float f10);

    public abstract boolean zzg(Object obj, long j3);
}
