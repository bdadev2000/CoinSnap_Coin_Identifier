package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class zzerb implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;

    public zzerb(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeqp(((zzens) this.zza).zzb(), 2147483647L, (Clock) this.zzb.zzb(), zzfin.zzc(), (zzdsm) this.zzc.zzb());
    }
}
