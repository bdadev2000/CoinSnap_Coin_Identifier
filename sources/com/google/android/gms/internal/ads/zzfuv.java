package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzfuv extends zzfut {
    private static zzfuv zzc;

    private zzfuv(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzfuv zzi(Context context) {
        zzfuv zzfuvVar;
        synchronized (zzfuv.class) {
            try {
                if (zzc == null) {
                    zzc = new zzfuv(context);
                }
                zzfuvVar = zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfuvVar;
    }

    public final zzfur zzh(long j2, boolean z2) throws IOException {
        synchronized (zzfuv.class) {
            try {
                if (zzo()) {
                    return zzb(null, null, j2, z2);
                }
                return new zzfur();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzfuv.class) {
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

    public final void zzm(boolean z2) throws IOException {
        this.zzb.zzd("paidv2_user_option", Boolean.valueOf(z2));
    }

    public final void zzn(boolean z2) throws IOException {
        this.zzb.zzd("paidv2_publisher_option", Boolean.valueOf(z2));
        if (z2) {
            return;
        }
        zzj();
    }

    public final boolean zzo() {
        return this.zzb.zzf("paidv2_publisher_option", true);
    }

    public final boolean zzp() {
        return this.zzb.zzf("paidv2_user_option", true);
    }
}
