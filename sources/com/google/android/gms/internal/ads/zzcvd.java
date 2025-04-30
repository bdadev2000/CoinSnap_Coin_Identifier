package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcvd implements zzgfp {
    final /* synthetic */ zzgfp zza;
    final /* synthetic */ zzcve zzb;

    public zzcvd(zzcve zzcveVar, zzgfp zzgfpVar) {
        this.zza = zzgfpVar;
        this.zzb = zzcveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        zzcci.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuy
            @Override // java.lang.Runnable
            public final void run() {
                zzcve.this.zzd();
            }
        });
        this.zza.zza(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcci.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuy
            @Override // java.lang.Runnable
            public final void run() {
                zzcve.this.zzd();
            }
        });
        this.zza.zzb((zzcup) obj);
    }
}
