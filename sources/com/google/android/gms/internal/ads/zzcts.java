package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcts implements zzgfk {
    final /* synthetic */ zzgfk zza;
    final /* synthetic */ zzctt zzb;

    public zzcts(zzctt zzcttVar, zzgfk zzgfkVar) {
        this.zza = zzgfkVar;
        this.zzb = zzcttVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctn
            @Override // java.lang.Runnable
            public final void run() {
                zzctt.this.zzd();
            }
        });
        this.zza.zza(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctn
            @Override // java.lang.Runnable
            public final void run() {
                zzctt.this.zzd();
            }
        });
        this.zza.zzb((zzcte) obj);
    }
}
