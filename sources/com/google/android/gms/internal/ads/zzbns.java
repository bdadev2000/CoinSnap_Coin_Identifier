package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbns implements zzcas {
    final /* synthetic */ zzbnt zza;

    public zzbns(zzbnt zzbntVar) {
        this.zza = zzbntVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzbmp zzbmpVar = (zzbmp) obj;
        zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnr
            @Override // java.lang.Runnable
            public final void run() {
                zzbmp zzbmpVar2 = zzbmpVar;
                zzbmpVar2.zzr("/result", zzbjq.zzo);
                zzbmpVar2.zzc();
            }
        });
    }
}
