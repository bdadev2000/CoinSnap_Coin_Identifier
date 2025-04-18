package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzean implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzean(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeam zzb() {
        return new zzeam(((zzchq) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
