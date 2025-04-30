package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzeif implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzeif(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeie zzb() {
        return new zzeie((Context) this.zza.zzb(), (zzcrt) this.zzb.zzb());
    }
}
