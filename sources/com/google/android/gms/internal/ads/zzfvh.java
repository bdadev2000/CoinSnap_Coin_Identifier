package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzfvh extends zzfve {
    private static zzfvh zzc;

    private zzfvh(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzfvh zzi(Context context) {
        zzfvh zzfvhVar;
        synchronized (zzfvh.class) {
            try {
                if (zzc == null) {
                    zzc = new zzfvh(context);
                }
                zzfvhVar = zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfvhVar;
    }

    public final zzfvd zzh(long j7, boolean z8) throws IOException {
        synchronized (zzfvh.class) {
            try {
                if (!zzo()) {
                    return new zzfvd();
                }
                return zzb(null, null, j7, z8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzfvh.class) {
            try {
                if (zzg(false)) {
                    zzf(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzk() throws IOException {
        this.zzb.zze("paidv2_publisher_option");
    }

    public final void zzl() throws IOException {
        this.zzb.zze("paidv2_user_option");
    }

    public final void zzm(boolean z8) throws IOException {
        this.zzb.zzd("paidv2_user_option", Boolean.valueOf(z8));
    }

    public final void zzn(boolean z8) throws IOException {
        this.zzb.zzd("paidv2_publisher_option", Boolean.valueOf(z8));
        if (!z8) {
            zzj();
        }
    }

    public final boolean zzo() {
        return this.zzb.zzf("paidv2_publisher_option", true);
    }

    public final boolean zzp() {
        return this.zzb.zzf("paidv2_user_option", true);
    }
}
