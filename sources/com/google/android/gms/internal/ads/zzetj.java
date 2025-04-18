package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzetj implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;

    public zzetj(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4) {
        this.zza = zzhgpVar2;
        this.zzb = zzhgpVar3;
        this.zzc = zzhgpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeth zzb() {
        return new zzeth(zzfin.zzc(), ((zzcpb) this.zza).zza(), (Context) this.zzb.zzb(), ((zzhgl) this.zzc).zzb());
    }
}
