package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzarp {
    public static final boolean zza = zzarq.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    public final void finalize() throws Throwable {
        if (!this.zzc) {
            zzb("Request on the loose");
            zzarq.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    public final synchronized void zza(String str, long j7) {
        if (!this.zzc) {
            this.zzb.add(new zzaro(str, j7, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    public final synchronized void zzb(String str) {
        long j7;
        this.zzc = true;
        if (this.zzb.size() == 0) {
            j7 = 0;
        } else {
            j7 = ((zzaro) this.zzb.get(r0.size() - 1)).zzc - ((zzaro) this.zzb.get(0)).zzc;
        }
        if (j7 > 0) {
            long j9 = ((zzaro) this.zzb.get(0)).zzc;
            zzarq.zza("(%-4d ms) %s", Long.valueOf(j7), str);
            for (zzaro zzaroVar : this.zzb) {
                long j10 = zzaroVar.zzc;
                zzarq.zza("(+%-4d) [%2d] %s", Long.valueOf(j10 - j9), Long.valueOf(zzaroVar.zzb), zzaroVar.zza);
                j9 = j10;
            }
        }
    }
}
