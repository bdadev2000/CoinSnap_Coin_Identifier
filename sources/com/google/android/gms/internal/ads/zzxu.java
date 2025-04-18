package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzxu implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzxu(zzaf zzafVar, int i2) {
        this.zza = 1 == (zzafVar.zze & 1);
        this.zzb = zzls.zza(i2, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxu zzxuVar) {
        return zzgam.zzj().zzd(this.zzb, zzxuVar.zzb).zzd(this.zza, zzxuVar.zza).zza();
    }
}
