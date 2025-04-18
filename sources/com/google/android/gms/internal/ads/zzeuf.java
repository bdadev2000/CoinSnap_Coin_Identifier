package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeuf implements zzexh {
    private final zzgfz zza;
    private final zzfhc zzb;

    public zzeuf(zzgfz zzgfzVar, zzfhc zzfhcVar) {
        this.zza = zzgfzVar;
        this.zzb = zzfhcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeue
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeuf.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeug zzc() throws Exception {
        return new zzeug("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(this.zzb.zzd)));
    }
}
