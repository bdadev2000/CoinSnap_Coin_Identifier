package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdbc implements zzhkp {
    private final zzhlg zza;

    public zzdbc(zzhlg zzhlgVar) {
        this.zza = zzhlgVar;
    }

    public static zzdbb zzc(Set set) {
        return new zzdbb(set);
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdbb zzb() {
        return new zzdbb(((zzhld) this.zza).zzb());
    }
}
