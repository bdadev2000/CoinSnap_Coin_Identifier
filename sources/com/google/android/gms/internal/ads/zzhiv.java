package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes4.dex */
public final class zzhiv {
    private final List zza;
    private final List zzb;

    public /* synthetic */ zzhiv(int i2, int i3, zzhiu zzhiuVar) {
        this.zza = zzhif.zzc(i2);
        this.zzb = zzhif.zzc(i3);
    }

    public final zzhiv zza(zzhir zzhirVar) {
        this.zzb.add(zzhirVar);
        return this;
    }

    public final zzhiv zzb(zzhir zzhirVar) {
        this.zza.add(zzhirVar);
        return this;
    }

    public final zzhiw zzc() {
        return new zzhiw(this.zza, this.zzb, null);
    }
}
