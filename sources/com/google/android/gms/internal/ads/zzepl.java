package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzepl implements zzexh {
    private final zzgfz zza;
    private final zzfhc zzb;

    public zzepl(zzgfz zzgfzVar, zzfhc zzfhcVar, zzfhr zzfhrVar) {
        this.zza = zzgfzVar;
        this.zzb = zzfhcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepl.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzepm zzc() throws Exception {
        String str = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgR)).booleanValue() && "requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(this.zzb.zzd))) {
            str = zzfhr.zza();
        }
        return new zzepm(str);
    }
}
