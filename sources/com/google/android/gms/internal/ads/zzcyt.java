package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzcyt {
    private Context zza;
    private zzfho zzb;
    private Bundle zzc;

    @Nullable
    private zzfhg zzd;

    @Nullable
    private zzcyn zze;

    @Nullable
    private zzehq zzf;

    public final zzcyt zzd(@Nullable zzehq zzehqVar) {
        this.zzf = zzehqVar;
        return this;
    }

    public final zzcyt zze(Context context) {
        this.zza = context;
        return this;
    }

    public final zzcyt zzf(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzcyt zzg(@Nullable zzcyn zzcynVar) {
        this.zze = zzcynVar;
        return this;
    }

    public final zzcyt zzh(zzfhg zzfhgVar) {
        this.zzd = zzfhgVar;
        return this;
    }

    public final zzcyt zzi(zzfho zzfhoVar) {
        this.zzb = zzfhoVar;
        return this;
    }

    public final zzcyv zzj() {
        return new zzcyv(this, null);
    }
}
