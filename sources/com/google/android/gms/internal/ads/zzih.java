package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;

/* loaded from: classes2.dex */
public class zzih {
    private int zza;

    public final void zza(int i9) {
        this.zza |= 536870912;
    }

    @CallSuper
    public void zzb() {
        this.zza = 0;
    }

    public final void zzc(int i9) {
        this.zza = i9;
    }

    public final boolean zzd(int i9) {
        return (this.zza & i9) == i9;
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
}
