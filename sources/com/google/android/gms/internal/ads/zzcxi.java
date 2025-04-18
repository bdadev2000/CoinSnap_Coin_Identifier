package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzcxi {
    private Context zza;
    private zzfhc zzb;
    private Bundle zzc;

    @Nullable
    private zzfgu zzd;

    @Nullable
    private zzcxc zze;

    @Nullable
    private zzegp zzf;

    public final zzcxi zzd(@Nullable zzegp zzegpVar) {
        this.zzf = zzegpVar;
        return this;
    }

    public final zzcxi zze(Context context) {
        this.zza = context;
        return this;
    }

    public final zzcxi zzf(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzcxi zzg(@Nullable zzcxc zzcxcVar) {
        this.zze = zzcxcVar;
        return this;
    }

    public final zzcxi zzh(zzfgu zzfguVar) {
        this.zzd = zzfguVar;
        return this;
    }

    public final zzcxi zzi(zzfhc zzfhcVar) {
        this.zzb = zzfhcVar;
        return this;
    }

    public final zzcxk zzj() {
        return new zzcxk(this, null);
    }
}
