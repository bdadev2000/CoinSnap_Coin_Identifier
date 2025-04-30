package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzcpc implements zzcot {
    f4.c zza;
    private final zzehj zzb;

    public zzcpc(zzehj zzehjVar) {
        this.zzb = zzehjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcot
    public final void zza(Map map) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkt)).booleanValue()) {
            return;
        }
        this.zza = zzgft.zzf(zzgfk.zzu(this.zzb.zza(true)), Throwable.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzcpb
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                Throwable th = (Throwable) obj;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzku)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzx(th, "GetTopicsApiWithRecordObservationActionHandlerUnsampled");
                } else {
                    com.google.android.gms.ads.internal.zzu.zzo().zzv(th, "GetTopicsApiWithRecordObservationActionHandler");
                }
                return zzgft.zzh(new B0.b(zzgbc.zzm()));
            }
        }, zzcci.zza);
    }
}
