package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzeqm implements zzexw {
    private final zzgge zza;
    private final zzfho zzb;
    private final zzfid zzc;

    public zzeqm(zzgge zzggeVar, zzfho zzfhoVar, zzfid zzfidVar) {
        this.zza = zzggeVar;
        this.zzb = zzfhoVar;
        this.zzc = zzfidVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeql
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqm.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeqn zzc() throws Exception {
        String str = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhr)).booleanValue() && "requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzp.zzc(this.zzb.zzd))) {
            str = zzfid.zza();
        }
        return new zzeqn(str);
    }
}
