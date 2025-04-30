package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public final class zzcjv implements zzhkp {
    private final zzcjg zza;

    public zzcjv(zzcjg zzcjgVar) {
        this.zza = zzcjgVar;
    }

    public final VersionInfoParcel zza() {
        VersionInfoParcel zze = this.zza.zze();
        zzhkx.zzb(zze);
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* synthetic */ Object zzb() {
        VersionInfoParcel zze = this.zza.zze();
        zzhkx.zzb(zze);
        return zze;
    }
}
