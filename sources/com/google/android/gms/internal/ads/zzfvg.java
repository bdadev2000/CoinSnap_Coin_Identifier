package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzfvg extends zzfve {
    private static zzfvg zzc;

    private zzfvg(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzfvg zzj(Context context) {
        zzfvg zzfvgVar;
        synchronized (zzfvg.class) {
            try {
                if (zzc == null) {
                    zzc = new zzfvg(context);
                }
                zzfvgVar = zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfvgVar;
    }

    public final zzfvd zzh(long j7, boolean z8) throws IOException {
        zzfvd zzb;
        synchronized (zzfvg.class) {
            zzb = zzb(null, null, j7, z8);
        }
        return zzb;
    }

    public final zzfvd zzi(String str, String str2, long j7, boolean z8) throws IOException {
        zzfvd zzb;
        synchronized (zzfvg.class) {
            zzb = zzb(str, str2, j7, z8);
        }
        return zzb;
    }

    public final void zzk() throws IOException {
        synchronized (zzfvg.class) {
            zzf(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzfvg.class) {
            zzf(true);
        }
    }
}
