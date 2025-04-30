package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzlm {
    private long zza;
    private float zzb;
    private long zzc;

    public zzlm() {
        this.zza = C.TIME_UNSET;
        this.zzb = -3.4028235E38f;
        this.zzc = C.TIME_UNSET;
    }

    public final zzlm zzd(long j7) {
        boolean z8 = true;
        if (j7 < 0) {
            if (j7 == C.TIME_UNSET) {
                j7 = -9223372036854775807L;
            } else {
                z8 = false;
            }
        }
        zzeq.zzd(z8);
        this.zzc = j7;
        return this;
    }

    public final zzlm zze(long j7) {
        this.zza = j7;
        return this;
    }

    public final zzlm zzf(float f9) {
        boolean z8 = true;
        if (f9 <= 0.0f && f9 != -3.4028235E38f) {
            z8 = false;
        }
        zzeq.zzd(z8);
        this.zzb = f9;
        return this;
    }

    public final zzlo zzg() {
        return new zzlo(this, null);
    }

    public /* synthetic */ zzlm(zzlo zzloVar, zzll zzllVar) {
        this.zza = zzloVar.zza;
        this.zzb = zzloVar.zzb;
        this.zzc = zzloVar.zzc;
    }
}
