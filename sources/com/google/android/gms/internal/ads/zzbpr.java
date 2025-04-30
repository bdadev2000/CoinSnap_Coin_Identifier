package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbpr implements zzccr {
    final /* synthetic */ zzbps zza;

    public zzbpr(zzbps zzbpsVar) {
        this.zza = zzbpsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccr
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzboo zzbooVar = (zzboo) obj;
        zzcci.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbpq
            @Override // java.lang.Runnable
            public final void run() {
                zzboo zzbooVar2 = zzbooVar;
                zzbooVar2.zzr("/result", zzblo.zzo);
                zzbooVar2.zzc();
            }
        });
    }
}
