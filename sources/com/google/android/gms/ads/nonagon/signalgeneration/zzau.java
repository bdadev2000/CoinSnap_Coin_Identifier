package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbcb;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzau {
    private final String zza;

    public /* synthetic */ zzau(zzas zzasVar, zzat zzatVar) {
        String str;
        str = zzasVar.zza;
        this.zza = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final zzbcb.zza.EnumC0122zza zza() {
        char c2;
        String str = this.zza;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 543046670:
                if (str.equals(BrandSafetyUtils.f29188k)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1951953708:
                if (str.equals(BrandSafetyUtils.f29190m)) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        return c2 != 0 ? c2 != 1 ? c2 != 2 ? c2 != 3 ? zzbcb.zza.EnumC0122zza.AD_INITIATER_UNSPECIFIED : zzbcb.zza.EnumC0122zza.REWARD_BASED_VIDEO_AD : zzbcb.zza.EnumC0122zza.AD_LOADER : zzbcb.zza.EnumC0122zza.INTERSTITIAL : zzbcb.zza.EnumC0122zza.BANNER;
    }

    public final String zzb() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    public final Set zzc() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
