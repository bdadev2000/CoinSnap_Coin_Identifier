package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes3.dex */
public final class zzcil implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzcil(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbvr zzb() {
        Context zza = ((zzchq) this.zza).zza();
        zzfko zzfkoVar = (zzfko) this.zzb.zzb();
        zzboi zzb = com.google.android.gms.ads.internal.zzv.zzg().zzb(zza, VersionInfoParcel.forPackage(), zzfkoVar);
        zzboc zzbocVar = zzbof.zza;
        zzb.zza("google.afma.request.getAdDictionary", zzbocVar, zzbocVar);
        return new zzbvt(zza, com.google.android.gms.ads.internal.zzv.zzg().zzb(zza, VersionInfoParcel.forPackage(), zzfkoVar).zza("google.afma.sdkConstants.getSdkConstants", zzbocVar, zzbocVar), VersionInfoParcel.forPackage());
    }
}
