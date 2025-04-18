package com.google.android.gms.internal.ads;

import eb.j;

/* loaded from: classes3.dex */
public final class zzpt extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzad zzc;

    public zzpt(int i10, zzad zzadVar, boolean z10) {
        super(j.i("AudioTrack write failed: ", i10));
        this.zzb = z10;
        this.zza = i10;
        this.zzc = zzadVar;
    }
}
