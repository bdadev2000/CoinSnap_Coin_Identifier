package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzawt implements zzfsl {
    final /* synthetic */ zzfre zza;

    public zzawt(zzfre zzfreVar) {
        this.zza = zzfreVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    public final void zza(int i9, long j7) {
        this.zza.zzd(i9, System.currentTimeMillis() - j7);
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    public final void zzb(int i9, long j7, String str) {
        this.zza.zze(i9, System.currentTimeMillis() - j7, str);
    }
}
