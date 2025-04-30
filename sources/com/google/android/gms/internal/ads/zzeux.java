package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzeux implements zzexw {
    private final zzgge zza;
    private final zzfho zzb;

    public zzeux(zzgge zzggeVar, zzfho zzfhoVar) {
        this.zza = zzggeVar;
        this.zzb = zzfhoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeux.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeuy zzc() throws Exception {
        return new zzeuy("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzp.zzc(this.zzb.zzd)));
    }
}
