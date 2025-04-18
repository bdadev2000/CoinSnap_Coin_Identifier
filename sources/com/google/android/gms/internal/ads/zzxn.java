package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzxn implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzxn(zzad zzadVar, int i10) {
        this.zza = 1 == (zzadVar.zze & 1);
        this.zzb = zzlo.zza(i10, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxn zzxnVar) {
        return zzfzd.zzj().zzd(this.zzb, zzxnVar.zzb).zzd(this.zza, zzxnVar.zza).zza();
    }
}
