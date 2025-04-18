package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzhgk {
    private final List zza;
    private final List zzb;

    public /* synthetic */ zzhgk(int i10, int i11, zzhgj zzhgjVar) {
        this.zza = zzhfu.zzc(i10);
        this.zzb = zzhfu.zzc(i11);
    }

    public final zzhgk zza(zzhgg zzhggVar) {
        this.zzb.add(zzhggVar);
        return this;
    }

    public final zzhgk zzb(zzhgg zzhggVar) {
        this.zza.add(zzhggVar);
        return this;
    }

    public final zzhgl zzc() {
        return new zzhgl(this.zza, this.zzb, null);
    }
}
