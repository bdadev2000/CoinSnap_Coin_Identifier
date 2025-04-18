package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzfqa {
    private final Context zza;
    private final Looper zzb;

    public zzfqa(@NonNull Context context, @NonNull Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(@NonNull String str) {
        zzfqn zza = zzfqq.zza();
        zza.zza(this.zza.getPackageName());
        zza.zzc(2);
        zzfqk zza2 = zzfqm.zza();
        zza2.zza(str);
        zza2.zzb(2);
        zza.zzb(zza2);
        new zzfqb(this.zza, this.zzb, (zzfqq) zza.zzbr()).zza();
    }
}
