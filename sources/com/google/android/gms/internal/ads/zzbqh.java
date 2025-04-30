package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public final class zzbqh {
    static final com.google.android.gms.ads.internal.util.zzbd zza = new zzbqf();
    static final com.google.android.gms.ads.internal.util.zzbd zzb = new zzbqg();
    private final zzbpt zzc;

    public zzbqh(Context context, VersionInfoParcel versionInfoParcel, String str, zzfmq zzfmqVar) {
        this.zzc = new zzbpt(context, versionInfoParcel, str, zza, zzb, zzfmqVar);
    }

    public final zzbpx zza(String str, zzbqa zzbqaVar, zzbpz zzbpzVar) {
        return new zzbql(this.zzc, str, zzbqaVar, zzbpzVar);
    }

    public final zzbqq zzb() {
        return new zzbqq(this.zzc);
    }
}
