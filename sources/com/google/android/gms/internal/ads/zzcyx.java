package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcyx implements zzhkp {
    private final zzcyv zza;
    private final zzhlg zzb;

    public zzcyx(zzcyv zzcyvVar, zzhlg zzhlgVar) {
        this.zza = zzcyvVar;
        this.zzb = zzhlgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = this.zza.zza(((zzcjj) this.zzb).zza());
        zzhkx.zzb(zza);
        return zza;
    }
}
