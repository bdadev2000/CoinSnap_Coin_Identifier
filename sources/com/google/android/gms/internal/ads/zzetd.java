package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzetd implements zzevz {
    private final zzges zza;
    private final zzffo zzb;

    public zzetd(zzges zzgesVar, zzffo zzffoVar) {
        this.zza = zzgesVar;
        this.zzb = zzffoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzetd.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzete zzc() throws Exception {
        return new zzete("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(this.zzb.zzd)));
    }
}
