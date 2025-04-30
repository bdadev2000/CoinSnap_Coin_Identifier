package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv;

/* loaded from: classes2.dex */
public final class zzdrp implements zzhkp {
    private final zzhlg zza;

    public zzdrp(zzhlg zzhlgVar) {
        this.zza = zzhlgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbdv.zza.EnumC0129zza enumC0129zza;
        if (((zzczc) this.zza).zza().zzo.zza == 3) {
            enumC0129zza = zzbdv.zza.EnumC0129zza.REWARDED_INTERSTITIAL;
        } else {
            enumC0129zza = zzbdv.zza.EnumC0129zza.REWARD_BASED_VIDEO_AD;
        }
        zzhkx.zzb(enumC0129zza);
        return enumC0129zza;
    }
}
