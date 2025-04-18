package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes3.dex */
public final class zzcip implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;

    public zzcip(zzhja zzhjaVar, zzhja zzhjaVar2) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbvu zzb() {
        Context zza = ((zzchu) this.zza).zza();
        zzfmd zzfmdVar = (zzfmd) this.zzb.zzb();
        zzbon zzb = com.google.android.gms.ads.internal.zzu.zzf().zzb(zza, VersionInfoParcel.forPackage(), zzfmdVar);
        zzboh zzbohVar = zzbok.zza;
        zzb.zza("google.afma.request.getAdDictionary", zzbohVar, zzbohVar);
        return new zzbvw(zza, com.google.android.gms.ads.internal.zzu.zzf().zzb(zza, VersionInfoParcel.forPackage(), zzfmdVar).zza("google.afma.sdkConstants.getSdkConstants", zzbohVar, zzbohVar), VersionInfoParcel.forPackage());
    }
}
