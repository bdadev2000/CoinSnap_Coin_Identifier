package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes3.dex */
public final class zzeul implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzeul(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3) {
        this.zza = zzhgpVar2;
        this.zzb = zzhgpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeuj zzb() {
        return new zzeuj(zzfin.zzc(), ((zzchq) this.zza).zza(), (Set) this.zzb.zzb());
    }
}
