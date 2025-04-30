package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class zzdky implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzdky(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdhc((Context) this.zza.zzb(), new HashSet(), ((zzcvg) this.zzb).zza());
    }
}
