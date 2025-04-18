package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzcqt implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzcqt(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcqs zzb() {
        return new zzcqs(((zzcqa) this.zza).zza(), (Executor) this.zzb.zzb());
    }
}
