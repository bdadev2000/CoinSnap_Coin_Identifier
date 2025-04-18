package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes3.dex */
public final class zzcid implements zzhfx {
    private final zzchn zza;

    public zzcid(zzchn zzchnVar) {
        this.zza = zzchnVar;
    }

    public static VersionInfoParcel zzc(zzchn zzchnVar) {
        VersionInfoParcel zze = zzchnVar.zze();
        zzhgf.zzb(zze);
        return zze;
    }

    public final VersionInfoParcel zza() {
        return zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
