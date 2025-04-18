package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzefv implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzefv(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzefu zzb() {
        return new zzefu((Context) this.zza.zzb(), (zzcor) this.zzb.zzb());
    }
}
