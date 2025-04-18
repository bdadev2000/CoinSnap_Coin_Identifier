package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes3.dex */
public final class zzcih implements zzhii {
    private final zzchr zza;

    public zzcih(zzchr zzchrVar) {
        this.zza = zzchrVar;
    }

    public static VersionInfoParcel zzc(zzchr zzchrVar) {
        VersionInfoParcel zze = zzchrVar.zze();
        zzhiq.zzb(zze);
        return zze;
    }

    public final VersionInfoParcel zza() {
        return zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
