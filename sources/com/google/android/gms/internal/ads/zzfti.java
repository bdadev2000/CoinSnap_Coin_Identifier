package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzfti {
    private static zzfti zzb;
    final zzftj zza;

    private zzfti(Context context) {
        this.zza = zzftj.zzb(context);
    }

    public static final zzfti zza(Context context) {
        zzfti zzftiVar;
        synchronized (zzfti.class) {
            if (zzb == null) {
                zzb = new zzfti(context);
            }
            zzftiVar = zzb;
        }
        return zzftiVar;
    }

    public final void zzb(boolean z10) throws IOException {
        synchronized (zzfti.class) {
            this.zza.zzd("paidv2_user_option", Boolean.valueOf(z10));
        }
    }

    public final void zzc(boolean z10) throws IOException {
        synchronized (zzfti.class) {
            this.zza.zzd("paidv2_publisher_option", Boolean.valueOf(z10));
            if (!z10) {
                this.zza.zze("paidv2_creation_time");
                this.zza.zze("paidv2_id");
                this.zza.zze("vendor_scoped_gpid_v2_id");
                this.zza.zze("vendor_scoped_gpid_v2_creation_time");
            }
        }
    }

    public final boolean zzd() {
        boolean zzf;
        synchronized (zzfti.class) {
            zzf = this.zza.zzf("paidv2_publisher_option", true);
        }
        return zzf;
    }

    public final boolean zze() {
        boolean zzf;
        synchronized (zzfti.class) {
            zzf = this.zza.zzf("paidv2_user_option", true);
        }
        return zzf;
    }
}
