package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
final class zzavc implements zzfsc {
    final /* synthetic */ zzfqz zza;

    public zzavc(zzfqz zzfqzVar) {
        this.zza = zzfqzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final void zza(int i2, long j2) {
        this.zza.zzd(i2, System.currentTimeMillis() - j2);
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final void zzb(int i2, long j2, String str) {
        this.zza.zze(i2, System.currentTimeMillis() - j2, str);
    }
}
