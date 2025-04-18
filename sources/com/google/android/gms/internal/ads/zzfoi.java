package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.UUID;

/* loaded from: classes4.dex */
public abstract class zzfoi {
    public static zzfoi zza(zzfoj zzfojVar, zzfok zzfokVar) {
        zzfqb.zza();
        return new zzfom(zzfojVar, zzfokVar, UUID.randomUUID().toString());
    }

    public abstract void zzb(View view, zzfop zzfopVar, @Nullable String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();
}
