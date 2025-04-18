package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzfhn implements zzgfk {
    final /* synthetic */ zzfho zza;
    final /* synthetic */ int zzb;

    public zzfhn(zzfho zzfhoVar, int i2) {
        this.zzb = i2;
        this.zza = zzfhoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i2 = this.zzb;
        this.zza.zzb((String) obj, i2);
    }
}
