package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzfo {
    final Unsafe zza;

    public zzfo(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j7);

    public abstract float zzb(Object obj, long j7);

    public abstract void zzc(Object obj, long j7, boolean z8);

    public abstract void zzd(Object obj, long j7, byte b);

    public abstract void zze(Object obj, long j7, double d2);

    public abstract void zzf(Object obj, long j7, float f9);

    public abstract boolean zzg(Object obj, long j7);
}
