package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzftn {
    private static zzftn zzb;
    final zzftj zza;

    private zzftn(Context context) {
        this.zza = zzftj.zzb(context);
        zzfti.zza(context);
    }

    public static final zzftn zza(Context context) {
        zzftn zzftnVar;
        synchronized (zzftn.class) {
            if (zzb == null) {
                zzb = new zzftn(context);
            }
            zzftnVar = zzb;
        }
        return zzftnVar;
    }

    public final void zzb(@Nullable zzfth zzfthVar) throws IOException {
        synchronized (zzftn.class) {
            this.zza.zze("vendor_scoped_gpid_v2_id");
            this.zza.zze("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
