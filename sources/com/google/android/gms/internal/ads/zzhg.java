package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;

/* loaded from: classes3.dex */
public class zzhg {
    private int zza;

    public final void zza(int i10) {
        this.zza |= 536870912;
    }

    @CallSuper
    public void zzb() {
        this.zza = 0;
    }

    public final void zzc(int i10) {
        this.zza = i10;
    }

    public final boolean zzd(int i10) {
        return (this.zza & i10) == i10;
    }

    public final boolean zze() {
        return zzd(268435456);
    }

    public final boolean zzf() {
        return zzd(4);
    }

    public final boolean zzg() {
        return zzd(1);
    }

    public final boolean zzh() {
        return zzd(536870912);
    }

    public final boolean zzi() {
        return zzd(67108864);
    }
}
