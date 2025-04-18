package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* loaded from: classes3.dex */
public final class zzapd {
    private int zza = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS;
    private int zzb;

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final void zzc(zzapy zzapyVar) throws zzapy {
        int i10 = this.zzb + 1;
        this.zzb = i10;
        int i11 = this.zza;
        this.zza = i11 + i11;
        if (i10 > 1) {
            throw zzapyVar;
        }
    }
}
