package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Set;

/* loaded from: classes3.dex */
public class zzcpk {
    private final zzcro zza;
    private final View zzb;
    private final zzfeu zzc;

    @Nullable
    private final zzcfk zzd;

    public zzcpk(View view, @Nullable zzcfk zzcfkVar, zzcro zzcroVar, zzfeu zzfeuVar) {
        this.zzb = view;
        this.zzd = zzcfkVar;
        this.zza = zzcroVar;
        this.zzc = zzfeuVar;
    }

    public final View zza() {
        return this.zzb;
    }

    @Nullable
    public final zzcfk zzb() {
        return this.zzd;
    }

    public final zzcro zzc() {
        return this.zza;
    }

    public zzcxy zzd(Set set) {
        return new zzcxy(set);
    }

    public final zzfeu zze() {
        return this.zzc;
    }
}
