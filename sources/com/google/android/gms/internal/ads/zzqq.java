package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzqq {

    @Nullable
    private Exception zza;
    private long zzb = C.TIME_UNSET;
    private long zzc = C.TIME_UNSET;

    public final void zza() {
        this.zza = null;
        this.zzb = C.TIME_UNSET;
        this.zzc = C.TIME_UNSET;
    }

    public final void zzb(Exception exc) throws Exception {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zza == null) {
            this.zza = exc;
        }
        if (this.zzb == C.TIME_UNSET && !zzqw.zzK()) {
            this.zzb = 200 + elapsedRealtime;
        }
        long j3 = this.zzb;
        if (j3 != C.TIME_UNSET && elapsedRealtime >= j3) {
            Exception exc2 = this.zza;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.zza;
            zza();
            throw exc3;
        }
        this.zzc = elapsedRealtime + 50;
    }

    public final boolean zzc() {
        if (this.zza == null) {
            return false;
        }
        if (!zzqw.zzK() && SystemClock.elapsedRealtime() >= this.zzc) {
            return false;
        }
        return true;
    }
}
