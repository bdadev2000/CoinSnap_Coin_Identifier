package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcxb implements zzhkp {
    private final zzcxa zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzcxb(zzcxa zzcxaVar, zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzcxaVar;
        this.zzb = zzhlgVar;
        this.zzc = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new com.google.android.gms.ads.internal.zzb((Context) this.zzb.zzb(), (zzcaf) this.zzc.zzb(), null);
    }
}
