package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdgg implements zzhfx {
    private final zzdfn zza;
    private final zzhgp zzb;

    public zzdgg(zzdfn zzdfnVar, zzhgp zzhgpVar) {
        this.zza = zzdfnVar;
        this.zzb = zzhgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzd((Executor) this.zzb.zzb());
    }
}
