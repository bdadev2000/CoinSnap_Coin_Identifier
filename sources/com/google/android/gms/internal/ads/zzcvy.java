package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzcvy implements zzhfx {
    private final zzcvw zza;
    private final zzhgp zzb;

    public zzcvy(zzcvw zzcvwVar, zzhgp zzhgpVar) {
        this.zza = zzcvwVar;
        this.zzb = zzhgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = this.zza.zza(((zzchq) this.zzb).zza());
        zzhgf.zzb(zza);
        return zza;
    }
}
