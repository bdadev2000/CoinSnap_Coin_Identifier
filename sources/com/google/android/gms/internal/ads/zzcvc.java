package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcvc implements zzgfp {
    final /* synthetic */ zzgfp zza;
    final /* synthetic */ zzcve zzb;

    public zzcvc(zzcve zzcveVar, zzgfp zzgfpVar) {
        this.zza = zzgfpVar;
        this.zzb = zzcveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzcci.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuy
            @Override // java.lang.Runnable
            public final void run() {
                zzcve.this.zzd();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcve.zzb(this.zzb, ((zzcux) obj).zza, this.zza);
    }
}
