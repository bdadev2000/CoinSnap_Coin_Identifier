package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public final class zzckf implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzckf(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbxo zzb() {
        Context zza = ((zzcjj) this.zza).zza();
        zzfmq zzfmqVar = (zzfmq) this.zzb.zzb();
        zzbqh zzb = com.google.android.gms.ads.internal.zzu.zzf().zzb(zza, VersionInfoParcel.forPackage(), zzfmqVar);
        zzbqb zzbqbVar = zzbqe.zza;
        zzb.zza("google.afma.request.getAdDictionary", zzbqbVar, zzbqbVar);
        return new zzbxq(zza, com.google.android.gms.ads.internal.zzu.zzf().zzb(zza, VersionInfoParcel.forPackage(), zzfmqVar).zza("google.afma.sdkConstants.getSdkConstants", zzbqbVar, zzbqbVar), VersionInfoParcel.forPackage());
    }
}
