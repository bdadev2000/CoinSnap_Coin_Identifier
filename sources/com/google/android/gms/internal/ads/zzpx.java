package com.google.android.gms.internal.ads;

import android.support.v4.media.d;

/* loaded from: classes3.dex */
public final class zzpx extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzaf zzc;

    public zzpx(int i2, zzaf zzafVar, boolean z2) {
        super(d.i("AudioTrack write failed: ", i2));
        this.zzb = z2;
        this.zza = i2;
        this.zzc = zzafVar;
    }
}
