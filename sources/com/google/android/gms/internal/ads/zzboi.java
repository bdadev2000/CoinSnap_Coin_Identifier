package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes3.dex */
public final class zzboi {
    static final com.google.android.gms.ads.internal.util.zzbc zza = new zzbog();
    static final com.google.android.gms.ads.internal.util.zzbc zzb = new zzboh();
    private final zzbnu zzc;

    public zzboi(Context context, VersionInfoParcel versionInfoParcel, String str, zzfko zzfkoVar) {
        this.zzc = new zzbnu(context, versionInfoParcel, str, zza, zzb, zzfkoVar);
    }

    public final zzbny zza(String str, zzbob zzbobVar, zzboa zzboaVar) {
        return new zzbom(this.zzc, str, zzbobVar, zzboaVar);
    }

    public final zzbor zzb() {
        return new zzbor(this.zzc);
    }
}
