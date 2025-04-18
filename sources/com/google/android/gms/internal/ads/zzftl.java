package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzftl extends zzftk {
    private static zzftl zzd;

    private zzftl(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzftl zzj(Context context) {
        zzftl zzftlVar;
        synchronized (zzftl.class) {
            if (zzd == null) {
                zzd = new zzftl(context);
            }
            zzftlVar = zzd;
        }
        return zzftlVar;
    }

    public final zzfth zzh(long j3, boolean z10) throws IOException {
        zzfth zzb;
        synchronized (zzftl.class) {
            zzb = zzb(null, null, j3, z10);
        }
        return zzb;
    }

    public final zzfth zzi(String str, String str2, long j3, boolean z10) throws IOException {
        zzfth zzb;
        synchronized (zzftl.class) {
            zzb = zzb(str, str2, j3, z10);
        }
        return zzb;
    }

    public final void zzk() throws IOException {
        synchronized (zzftl.class) {
            zzf(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzftl.class) {
            zzf(true);
        }
    }
}
