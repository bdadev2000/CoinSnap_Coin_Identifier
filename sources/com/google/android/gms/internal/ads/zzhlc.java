package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzhlc {
    private final List zza;
    private final List zzb;

    public /* synthetic */ zzhlc(int i9, int i10, zzhlb zzhlbVar) {
        this.zza = zzhkm.zzc(i9);
        this.zzb = zzhkm.zzc(i10);
    }

    public final zzhlc zza(zzhky zzhkyVar) {
        this.zzb.add(zzhkyVar);
        return this;
    }

    public final zzhlc zzb(zzhky zzhkyVar) {
        this.zza.add(zzhkyVar);
        return this;
    }

    public final zzhld zzc() {
        return new zzhld(this.zza, this.zzb, null);
    }
}
