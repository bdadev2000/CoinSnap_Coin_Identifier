package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
/* loaded from: classes4.dex */
public final class zzfrk {
    private final Context zza;
    private final Looper zzb;

    public zzfrk(@NonNull Context context, @NonNull Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(@NonNull String str) {
        zzfry zza = zzfsa.zza();
        zza.zza(this.zza.getPackageName());
        zza.zzc(2);
        zzfrv zza2 = zzfrw.zza();
        zza2.zza(str);
        zza2.zzb(2);
        zza.zzb(zza2);
        new zzfrl(this.zza, this.zzb, (zzfsa) zza.zzbr()).zza();
    }
}
