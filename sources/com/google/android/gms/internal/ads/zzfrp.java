package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
/* loaded from: classes2.dex */
public final class zzfrp {
    private final Context zza;
    private final Looper zzb;

    public zzfrp(@NonNull Context context, @NonNull Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(@NonNull String str) {
        zzfsf zza = zzfsj.zza();
        zza.zza(this.zza.getPackageName());
        zza.zzc(zzfsi.BLOCKED_IMPRESSION);
        zzfsc zza2 = zzfsd.zza();
        zza2.zzb(str);
        zza2.zza(zzfsb.BLOCKED_REASON_BACKGROUND);
        zza.zzb(zza2);
        new zzfrq(this.zza, this.zzb, (zzfsj) zza.zzbr()).zza();
    }
}
