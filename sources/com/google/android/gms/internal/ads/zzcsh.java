package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcsh implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;

    public zzcsh(zzhja zzhjaVar, zzhja zzhjaVar2) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcsg zzb() {
        return new zzcsg(((zzcro) this.zza).zza(), (Executor) this.zzb.zzb());
    }
}
