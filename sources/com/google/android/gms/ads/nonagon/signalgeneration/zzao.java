package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbdv;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzao {
    private final String zza;

    public /* synthetic */ zzao(zzam zzamVar, zzan zzanVar) {
        String str;
        str = zzamVar.zza;
        this.zza = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final zzbdv.zza.EnumC0129zza zza() {
        char c9;
        String str = this.zza;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        if (c9 != 0) {
            if (c9 != 1) {
                if (c9 != 2) {
                    if (c9 != 3) {
                        return zzbdv.zza.EnumC0129zza.AD_INITIATER_UNSPECIFIED;
                    }
                    return zzbdv.zza.EnumC0129zza.REWARD_BASED_VIDEO_AD;
                }
                return zzbdv.zza.EnumC0129zza.AD_LOADER;
            }
            return zzbdv.zza.EnumC0129zza.INTERSTITIAL;
        }
        return zzbdv.zza.EnumC0129zza.BANNER;
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
