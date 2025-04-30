package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* loaded from: classes2.dex */
public final class zzaqs {
    private int zza = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS;
    private int zzb;

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final void zzc(zzarn zzarnVar) throws zzarn {
        int i9 = this.zzb + 1;
        this.zzb = i9;
        int i10 = this.zza;
        this.zza = i10 + i10;
        if (i9 <= 1) {
        } else {
            throw zzarnVar;
        }
    }
}
