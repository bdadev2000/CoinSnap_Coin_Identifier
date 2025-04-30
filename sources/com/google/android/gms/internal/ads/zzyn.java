package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzyn implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzyn(zzan zzanVar, int i9) {
        this.zza = 1 == (zzanVar.zzf & 1);
        this.zzb = zzze.zzo(i9, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzyn zzynVar) {
        return zzgar.zzk().zze(this.zzb, zzynVar.zzb).zze(this.zza, zzynVar.zza).zza();
    }
}
