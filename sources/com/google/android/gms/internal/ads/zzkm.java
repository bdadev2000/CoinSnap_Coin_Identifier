package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class zzkm {
    private long zza;
    private float zzb;
    private long zzc;

    public zzkm() {
        this.zza = C.TIME_UNSET;
        this.zzb = -3.4028235E38f;
        this.zzc = C.TIME_UNSET;
    }

    public final zzkm zzd(long j3) {
        boolean z10 = true;
        if (j3 < 0) {
            if (j3 == C.TIME_UNSET) {
                j3 = -9223372036854775807L;
            } else {
                z10 = false;
            }
        }
        zzdb.zzd(z10);
        this.zzc = j3;
        return this;
    }

    public final zzkm zze(long j3) {
        this.zza = j3;
        return this;
    }

    public final zzkm zzf(float f10) {
        boolean z10 = true;
        if (f10 <= 0.0f && f10 != -3.4028235E38f) {
            z10 = false;
        }
        zzdb.zzd(z10);
        this.zzb = f10;
        return this;
    }

    public final zzko zzg() {
        return new zzko(this, null);
    }

    public /* synthetic */ zzkm(zzko zzkoVar, zzkn zzknVar) {
        this.zza = zzkoVar.zza;
        this.zzb = zzkoVar.zzb;
        this.zzc = zzkoVar.zzc;
    }
}
