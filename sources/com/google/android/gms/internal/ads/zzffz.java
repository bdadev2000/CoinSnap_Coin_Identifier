package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzffz implements zzgee {
    final /* synthetic */ zzfga zza;
    final /* synthetic */ int zzb;

    public zzffz(zzfga zzfgaVar, int i10) {
        this.zzb = i10;
        this.zza = zzfgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.zzv.zzp().zzw(th2, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i10 = this.zzb;
        this.zza.zzb((String) obj, i10);
    }
}
