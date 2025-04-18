package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcsd implements zzgee {
    final /* synthetic */ zzgee zza;
    final /* synthetic */ zzcsf zzb;

    public zzcsd(zzcsf zzcsfVar, zzgee zzgeeVar) {
        this.zza = zzgeeVar;
        this.zzb = zzcsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        this.zza.zza(th2);
        zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrz
            @Override // java.lang.Runnable
            public final void run() {
                zzcsf.this.zzd();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcsf.zzb(this.zzb, ((zzcry) obj).zza, this.zza);
    }
}
