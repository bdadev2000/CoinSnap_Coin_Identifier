package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class zzcvl {
    private final Object zza = new Object();
    private final ConcurrentHashMap zzb = new ConcurrentHashMap();
    private final ConcurrentHashMap zzc = new ConcurrentHashMap();
    private final ConcurrentHashMap zzd = new ConcurrentHashMap();

    @VisibleForTesting
    public zzcvl() {
    }

    public final int zza(String str) {
        Integer num = (Integer) this.zzb.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long zzb(String str) {
        Long l2 = (Long) this.zzd.get(str);
        if (l2 == null) {
            return -1L;
        }
        return l2.longValue();
    }

    public final void zzc(String str) {
        synchronized (this.zza) {
            try {
                Integer num = (Integer) this.zzb.get(str);
                this.zzb.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(String str, String str2, long j2) {
        Long l2 = (Long) this.zzc.get(str2);
        if (l2 == null) {
            return;
        }
        this.zzc.remove(str2);
        this.zzd.put(str, Long.valueOf(j2 - l2.longValue()));
    }

    public final void zze(String str, long j2) {
        this.zzc.put(str, Long.valueOf(j2));
    }
}
