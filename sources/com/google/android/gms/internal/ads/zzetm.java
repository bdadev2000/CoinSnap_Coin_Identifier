package com.google.android.gms.internal.ads;

import android.content.Intent;

/* loaded from: classes3.dex */
public final class zzetm implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzetm(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzetk zzb() {
        return new zzetk(((zzchq) this.zza).zza(), (Intent) this.zzb.zzb());
    }
}
