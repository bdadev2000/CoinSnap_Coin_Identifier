package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcse implements zzgee {
    final /* synthetic */ zzgee zza;
    final /* synthetic */ zzcsf zzb;

    public zzcse(zzcsf zzcsfVar, zzgee zzgeeVar) {
        this.zza = zzgeeVar;
        this.zzb = zzcsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrz
            @Override // java.lang.Runnable
            public final void run() {
                zzcsf.this.zzd();
            }
        });
        this.zza.zza(th2);
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrz
            @Override // java.lang.Runnable
            public final void run() {
                zzcsf.this.zzd();
            }
        });
        this.zza.zzb((zzcrq) obj);
    }
}
