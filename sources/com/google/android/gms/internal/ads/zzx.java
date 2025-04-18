package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: classes3.dex */
public final class zzx {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzx zza(int i10) {
        zzdb.zzf(!this.zzb);
        this.zza.append(i10, true);
        return this;
    }

    public final zzz zzb() {
        zzdb.zzf(!this.zzb);
        this.zzb = true;
        return new zzz(this.zza, null);
    }
}
