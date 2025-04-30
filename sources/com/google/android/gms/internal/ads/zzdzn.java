package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzdzn implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzdzn(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        final zzaxd zzaxdVar = (zzaxd) this.zza.zzb();
        final Context zza = ((zzcjj) this.zzb).zza();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        f4.c zzb = zzggeVar.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzaxd.this.zzc().zzg(zza);
            }
        });
        zzhkx.zzb(zzb);
        return zzb;
    }
}
