package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes3.dex */
public final class zzbnz {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzboi zzc;
    private zzboi zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzboi zza(Context context, VersionInfoParcel versionInfoParcel, @Nullable zzfko zzfkoVar) {
        zzboi zzboiVar;
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = new zzboi(zzc(context), versionInfoParcel, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zza), zzfkoVar);
            }
            zzboiVar = this.zzc;
        }
        return zzboiVar;
    }

    public final zzboi zzb(Context context, VersionInfoParcel versionInfoParcel, zzfko zzfkoVar) {
        zzboi zzboiVar;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                this.zzd = new zzboi(zzc(context), versionInfoParcel, (String) zzbex.zza.zze(), zzfkoVar);
            }
            zzboiVar = this.zzd;
        }
        return zzboiVar;
    }
}
