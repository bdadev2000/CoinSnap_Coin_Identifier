package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaqa {
    public static final boolean zza = zzaqb.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    public final void finalize() throws Throwable {
        if (!this.zzc) {
            zzb("Request on the loose");
            zzaqb.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    public final synchronized void zza(String str, long j3) {
        if (!this.zzc) {
            this.zzb.add(new zzapz(str, j3, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    public final synchronized void zzb(String str) {
        long j3;
        this.zzc = true;
        if (this.zzb.size() == 0) {
            j3 = 0;
        } else {
            j3 = ((zzapz) this.zzb.get(r1.size() - 1)).zzc - ((zzapz) this.zzb.get(0)).zzc;
        }
        if (j3 > 0) {
            long j10 = ((zzapz) this.zzb.get(0)).zzc;
            zzaqb.zza("(%-4d ms) %s", Long.valueOf(j3), str);
            for (zzapz zzapzVar : this.zzb) {
                long j11 = zzapzVar.zzc;
                zzaqb.zza("(+%-4d) [%2d] %s", Long.valueOf(j11 - j10), Long.valueOf(zzapzVar.zzb), zzapzVar.zza);
                j10 = j11;
            }
        }
    }
}
