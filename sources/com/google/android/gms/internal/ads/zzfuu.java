package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzfuu extends zzfut {
    private static zzfuu zzc;

    private zzfuu(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzfuu zzj(Context context) {
        zzfuu zzfuuVar;
        synchronized (zzfuu.class) {
            try {
                if (zzc == null) {
                    zzc = new zzfuu(context);
                }
                zzfuuVar = zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfuuVar;
    }

    public final zzfur zzh(long j2, boolean z2) throws IOException {
        zzfur zzb;
        synchronized (zzfuu.class) {
            zzb = zzb(null, null, j2, z2);
        }
        return zzb;
    }

    public final zzfur zzi(String str, String str2, long j2, boolean z2) throws IOException {
        zzfur zzb;
        synchronized (zzfuu.class) {
            zzb = zzb(str, str2, j2, z2);
        }
        return zzb;
    }

    public final void zzk() throws IOException {
        synchronized (zzfuu.class) {
            zzf(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzfuu.class) {
            zzf(true);
        }
    }
}
