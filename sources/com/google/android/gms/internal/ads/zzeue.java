package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* loaded from: classes3.dex */
public final class zzeue implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;

    public zzeue(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4) {
        this.zza = zzhgpVar2;
        this.zzb = zzhgpVar3;
        this.zzc = zzhgpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeuc(zzfin.zzc(), ((zzcwd) this.zza).zza(), (PackageInfo) this.zzb.zzb(), ((zzcho) this.zzc).zzb());
    }
}
