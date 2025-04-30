package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public final class zzit {
    final Context zza;

    @Nullable
    String zzb;

    @Nullable
    String zzc;

    @Nullable
    String zzd;

    @Nullable
    Boolean zze;
    long zzf;

    @Nullable
    com.google.android.gms.internal.measurement.zzdo zzg;
    boolean zzh;

    @Nullable
    Long zzi;

    @Nullable
    String zzj;

    public zzit(Context context, @Nullable com.google.android.gms.internal.measurement.zzdo zzdoVar, @Nullable Long l) {
        this.zzh = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zza = applicationContext;
        this.zzi = l;
        if (zzdoVar != null) {
            this.zzg = zzdoVar;
            this.zzb = zzdoVar.zzf;
            this.zzc = zzdoVar.zze;
            this.zzd = zzdoVar.zzd;
            this.zzh = zzdoVar.zzc;
            this.zzf = zzdoVar.zzb;
            this.zzj = zzdoVar.zzh;
            Bundle bundle = zzdoVar.zzg;
            if (bundle != null) {
                this.zze = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
