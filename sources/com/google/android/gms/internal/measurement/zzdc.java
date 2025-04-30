package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzdc extends zzdf {
    private final AtomicReference<Bundle> zza = new AtomicReference<>();
    private boolean zzb;

    public final Bundle zza(long j7) {
        Bundle bundle;
        synchronized (this.zza) {
            if (!this.zzb) {
                try {
                    this.zza.wait(j7);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.zza.get();
        }
        return bundle;
    }

    public final Long zzb(long j7) {
        return (Long) zza(zza(j7), Long.class);
    }

    public final String zzc(long j7) {
        return (String) zza(zza(j7), String.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0003, code lost:
    
        r2 = r2.get(com.mbridge.msdk.foundation.entity.CampaignEx.JSON_KEY_AD_R);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> T zza(android.os.Bundle r2, java.lang.Class<T> r3) {
        /*
            r0 = 0
            if (r2 == 0) goto L2d
            java.lang.String r1 = "r"
            java.lang.Object r2 = r2.get(r1)
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r3.cast(r2)     // Catch: java.lang.ClassCastException -> L10
            return r2
        L10:
            r0 = move-exception
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            java.lang.String r1 = "Unexpected object type. Expected, Received: %s, %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            java.lang.String r2 = java.lang.String.format(r1, r2)
            java.lang.String r3 = "AM"
            android.util.Log.w(r3, r2, r0)
            throw r0
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzdc.zza(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.measurement.zzdg
    public final void zza(Bundle bundle) {
        synchronized (this.zza) {
            try {
                try {
                    this.zza.set(bundle);
                    this.zzb = true;
                } finally {
                    this.zza.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
