package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes3.dex */
public final class zzboe {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbon zzc;
    private zzbon zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzbon zza(Context context, VersionInfoParcel versionInfoParcel, @Nullable zzfmd zzfmdVar) {
        zzbon zzbonVar;
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    this.zzc = new zzbon(zzc(context), versionInfoParcel, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zza), zzfmdVar);
                }
                zzbonVar = this.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbonVar;
    }

    public final zzbon zzb(Context context, VersionInfoParcel versionInfoParcel, zzfmd zzfmdVar) {
        zzbon zzbonVar;
        synchronized (this.zzb) {
            try {
                if (this.zzd == null) {
                    this.zzd = new zzbon(zzc(context), versionInfoParcel, (String) zzbfb.zza.zze(), zzfmdVar);
                }
                zzbonVar = this.zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbonVar;
    }
}
