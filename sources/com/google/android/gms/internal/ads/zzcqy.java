package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Set;

/* loaded from: classes.dex */
public class zzcqy {
    private final zzctc zza;
    private final View zzb;
    private final zzfgi zzc;

    @Nullable
    private final zzcfo zzd;

    public zzcqy(View view, @Nullable zzcfo zzcfoVar, zzctc zzctcVar, zzfgi zzfgiVar) {
        this.zzb = view;
        this.zzd = zzcfoVar;
        this.zza = zzctcVar;
        this.zzc = zzfgiVar;
    }

    public final View zza() {
        return this.zzb;
    }

    @Nullable
    public final zzcfo zzb() {
        return this.zzd;
    }

    public final zzctc zzc() {
        return this.zza;
    }

    public zzczm zzd(Set set) {
        return new zzczm(set);
    }

    public final zzfgi zze() {
        return this.zzc;
    }
}
