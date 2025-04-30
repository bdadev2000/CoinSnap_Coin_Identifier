package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzeki implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzeki(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzekh((Context) this.zza.zzb(), (zzdkd) this.zzb.zzb(), (Executor) this.zzc.zzb());
    }
}
