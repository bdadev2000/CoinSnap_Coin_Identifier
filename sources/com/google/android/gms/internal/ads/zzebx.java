package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzebx implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;

    public zzebx(zzhja zzhjaVar, zzhja zzhjaVar2) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzebw zzb() {
        return new zzebw(((zzchu) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
