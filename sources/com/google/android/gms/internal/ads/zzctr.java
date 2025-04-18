package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzctr implements zzgfk {
    final /* synthetic */ zzgfk zza;
    final /* synthetic */ zzctt zzb;

    public zzctr(zzctt zzcttVar, zzgfk zzgfkVar) {
        this.zza = zzgfkVar;
        this.zzb = zzcttVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctn
            @Override // java.lang.Runnable
            public final void run() {
                zzctt.this.zzd();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzctt.zzb(this.zzb, ((zzctm) obj).zza, this.zza);
    }
}
