package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzaur implements zzfqs {
    final /* synthetic */ zzfpp zza;

    public zzaur(zzfpp zzfppVar) {
        this.zza = zzfppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfqs
    public final void zza(int i10, long j3) {
        this.zza.zzd(i10, System.currentTimeMillis() - j3);
    }

    @Override // com.google.android.gms.internal.ads.zzfqs
    public final void zzb(int i10, long j3, String str) {
        this.zza.zze(i10, System.currentTimeMillis() - j3, str);
    }
}
