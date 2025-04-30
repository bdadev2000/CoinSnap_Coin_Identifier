package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzeqi implements zzexw {
    private final Clock zza;
    private final zzfho zzb;

    public zzeqi(Clock clock, zzfho zzfhoVar) {
        this.zza = clock;
        this.zzb = zzfhoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return zzgft.zzh(new zzeqj(this.zzb, this.zza.currentTimeMillis()));
    }
}
