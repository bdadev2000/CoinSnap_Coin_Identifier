package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzbyq implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;

    public zzbyq(zzhja zzhjaVar, zzhja zzhjaVar2) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbyp zzb() {
        return new zzbyp((Clock) this.zza.zzb(), (zzbyn) this.zzb.zzb());
    }
}
