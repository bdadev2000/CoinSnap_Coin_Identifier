package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzcvu {
    private Context zza;
    private zzffo zzb;
    private Bundle zzc;

    @Nullable
    private zzffg zzd;

    @Nullable
    private zzcvo zze;

    @Nullable
    private zzefg zzf;

    public final zzcvu zzd(@Nullable zzefg zzefgVar) {
        this.zzf = zzefgVar;
        return this;
    }

    public final zzcvu zze(Context context) {
        this.zza = context;
        return this;
    }

    public final zzcvu zzf(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzcvu zzg(@Nullable zzcvo zzcvoVar) {
        this.zze = zzcvoVar;
        return this;
    }

    public final zzcvu zzh(zzffg zzffgVar) {
        this.zzd = zzffgVar;
        return this;
    }

    public final zzcvu zzi(zzffo zzffoVar) {
        this.zzb = zzffoVar;
        return this;
    }

    public final zzcvw zzj() {
        return new zzcvw(this, null);
    }
}
