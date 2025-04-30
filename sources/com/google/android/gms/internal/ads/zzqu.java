package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes2.dex */
public final class zzqu extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzan zzc;

    public zzqu(int i9, zzan zzanVar, boolean z8) {
        super(o.h(i9, "AudioTrack write failed: "));
        this.zzb = z8;
        this.zza = i9;
        this.zzc = zzanVar;
    }
}
