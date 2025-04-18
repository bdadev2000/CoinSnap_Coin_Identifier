package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbbs;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzau {
    private final String zza;

    public /* synthetic */ zzau(zzas zzasVar, zzat zzatVar) {
        String str;
        str = zzasVar.zza;
        this.zza = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final zzbbs.zza.EnumC0141zza zza() {
        char c10;
        String str = this.zza;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        return zzbbs.zza.EnumC0141zza.AD_INITIATER_UNSPECIFIED;
                    }
                    return zzbbs.zza.EnumC0141zza.REWARD_BASED_VIDEO_AD;
                }
                return zzbbs.zza.EnumC0141zza.AD_LOADER;
            }
            return zzbbs.zza.EnumC0141zza.INTERSTITIAL;
        }
        return zzbbs.zza.EnumC0141zza.BANNER;
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
