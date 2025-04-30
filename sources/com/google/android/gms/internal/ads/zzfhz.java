package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfhz implements zzgfp {
    final /* synthetic */ zzfia zza;
    final /* synthetic */ int zzb;

    public zzfhz(zzfia zzfiaVar, int i9) {
        this.zzb = i9;
        this.zza = zzfiaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i9 = this.zzb;
        this.zza.zzb((String) obj, i9);
    }
}
