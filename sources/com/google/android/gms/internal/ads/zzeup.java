package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* loaded from: classes3.dex */
public final class zzeup implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;

    public zzeup(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
        this.zzd = zzhgpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeuo(((zzdxg) this.zza).zzb(), (PackageInfo) this.zzb.zzb(), ((zzchq) this.zzc).zza(), (zzdsh) this.zzd.zzb());
    }
}
