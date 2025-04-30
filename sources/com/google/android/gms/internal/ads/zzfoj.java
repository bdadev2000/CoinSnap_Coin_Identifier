package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class zzfoj {
    public static zzfoj zza(zzfok zzfokVar, zzfol zzfolVar) {
        zzfqd.zza();
        return new zzfon(zzfokVar, zzfolVar, UUID.randomUUID().toString());
    }

    public abstract void zzb(View view, zzfoq zzfoqVar, @Nullable String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();
}
