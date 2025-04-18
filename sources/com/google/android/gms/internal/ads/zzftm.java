package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzftm extends zzftk {
    private static zzftm zzd;

    private zzftm(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzftm zzi(Context context) {
        zzftm zzftmVar;
        synchronized (zzftm.class) {
            if (zzd == null) {
                zzd = new zzftm(context);
            }
            zzftmVar = zzd;
        }
        return zzftmVar;
    }

    public final zzfth zzh(long j3, boolean z10) throws IOException {
        synchronized (zzftm.class) {
            if (!this.zzc.zzd()) {
                return new zzfth();
            }
            return zzb(null, null, j3, z10);
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzftm.class) {
            if (zzg(false)) {
                zzf(false);
            }
        }
    }
}
