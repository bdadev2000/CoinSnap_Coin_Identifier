package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class zzdic implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzdic(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdef((Context) this.zza.zzb(), new HashSet(), ((zzcsh) this.zzb).zza());
    }
}
