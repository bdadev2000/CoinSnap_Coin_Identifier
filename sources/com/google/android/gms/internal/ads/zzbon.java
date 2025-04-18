package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes4.dex */
public final class zzbon {

    @VisibleForTesting
    static final com.google.android.gms.ads.internal.util.zzbd zza = new zzbol();

    @VisibleForTesting
    static final com.google.android.gms.ads.internal.util.zzbd zzb = new zzbom();
    private final zzbnz zzc;

    public zzbon(Context context, VersionInfoParcel versionInfoParcel, String str, zzfmd zzfmdVar) {
        this.zzc = new zzbnz(context, versionInfoParcel, str, zza, zzb, zzfmdVar);
    }

    public final zzbod zza(String str, zzbog zzbogVar, zzbof zzbofVar) {
        return new zzbor(this.zzc, str, zzbogVar, zzbofVar);
    }

    public final zzbow zzb() {
        return new zzbow(this.zzc);
    }
}
