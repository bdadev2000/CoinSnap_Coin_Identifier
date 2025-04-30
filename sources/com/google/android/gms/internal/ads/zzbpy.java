package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public final class zzbpy {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbqh zzc;
    private zzbqh zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }

    public final zzbqh zza(Context context, VersionInfoParcel versionInfoParcel, @Nullable zzfmq zzfmqVar) {
        zzbqh zzbqhVar;
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    this.zzc = new zzbqh(zzc(context), versionInfoParcel, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zza), zzfmqVar);
                }
                zzbqhVar = this.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbqhVar;
    }

    public final zzbqh zzb(Context context, VersionInfoParcel versionInfoParcel, zzfmq zzfmqVar) {
        zzbqh zzbqhVar;
        synchronized (this.zzb) {
            try {
                if (this.zzd == null) {
                    this.zzd = new zzbqh(zzc(context), versionInfoParcel, (String) zzbgu.zzb.zze(), zzfmqVar);
                }
                zzbqhVar = this.zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbqhVar;
    }
}
