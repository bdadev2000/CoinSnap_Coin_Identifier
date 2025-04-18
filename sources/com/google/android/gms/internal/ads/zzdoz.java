package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbs;

/* loaded from: classes3.dex */
public final class zzdoz implements zzhfx {
    private final zzhgp zza;

    public zzdoz(zzhgp zzhgpVar) {
        this.zza = zzhgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbbs.zza.EnumC0141zza enumC0141zza;
        if (((zzcwd) this.zza).zza().zzo.zza == 3) {
            enumC0141zza = zzbbs.zza.EnumC0141zza.REWARDED_INTERSTITIAL;
        } else {
            enumC0141zza = zzbbs.zza.EnumC0141zza.REWARD_BASED_VIDEO_AD;
        }
        zzhgf.zzb(enumC0141zza);
        return enumC0141zza;
    }
}
