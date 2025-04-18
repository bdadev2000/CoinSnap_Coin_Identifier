package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.internal.ads.zzdsr;
import com.google.android.gms.internal.ads.zzffo;
import com.google.android.gms.internal.ads.zzfkq;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class zzv {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzfkq zza(Bundle bundle) {
        char c10;
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (TextUtils.isEmpty(string)) {
            return zzfkq.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
        switch (string.hashCode()) {
            case 1743582862:
                if (string.equals("requester_type_0")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582863:
                if (string.equals("requester_type_1")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582864:
                if (string.equals("requester_type_2")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582865:
                if (string.equals("requester_type_3")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582866:
                if (string.equals("requester_type_4")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582867:
                if (string.equals("requester_type_5")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582868:
                if (string.equals("requester_type_6")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582869:
                if (string.equals("requester_type_7")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582870:
                if (string.equals("requester_type_8")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                return zzfkq.SCAR_REQUEST_TYPE_ADMOB;
            case 1:
                return zzfkq.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
            case 2:
                return zzfkq.SCAR_REQUEST_TYPE_GBID;
            case 3:
                return zzfkq.SCAR_REQUEST_TYPE_GOLDENEYE;
            case 4:
                return zzfkq.SCAR_REQUEST_TYPE_YAVIN;
            case 5:
                return zzfkq.SCAR_REQUEST_TYPE_UNITY;
            case 6:
                return zzfkq.SCAR_REQUEST_TYPE_PAW;
            case 7:
                return zzfkq.SCAR_REQUEST_TYPE_GUILDER;
            case '\b':
                return zzfkq.SCAR_REQUEST_TYPE_GAM_S2S;
            default:
                return zzfkq.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String zzb(@Nullable String str) {
        char c10;
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                if (str.equals("requester_type_0")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582863:
                if (str.equals("requester_type_1")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582864:
                if (str.equals("requester_type_2")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582865:
                if (str.equals("requester_type_3")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582866:
                if (str.equals("requester_type_4")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582867:
                if (str.equals("requester_type_5")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582868:
                if (str.equals("requester_type_6")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582869:
                if (str.equals("requester_type_7")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582870:
                if (str.equals("requester_type_8")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return MBridgeConstans.API_REUQEST_CATEGORY_APP;
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return CampaignEx.CLICKMODE_ON;
            case 6:
                return "6";
            case 7:
                return "7";
            case '\b':
                return "8";
            default:
                return str;
        }
    }

    @Nullable
    public static String zzc(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        return (zzmVar == null || (bundle = zzmVar.zzc) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    public static void zzd(final zzdsr zzdsrVar, @Nullable zzdsh zzdshVar, final String str, final Pair... pairArr) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgO)).booleanValue()) {
            return;
        }
        final zzdsh zzdshVar2 = null;
        zzcaj.zza.execute(new Runnable(zzdshVar2, str, pairArr) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
            public final /* synthetic */ String zzb;
            public final /* synthetic */ Pair[] zzc;

            {
                this.zzb = str;
                this.zzc = pairArr;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzv.zze(zzdsr.this, null, this.zzb, this.zzc);
            }
        });
    }

    public static void zze(zzdsr zzdsrVar, @Nullable zzdsh zzdshVar, String str, Pair... pairArr) {
        ConcurrentHashMap zzc = zzdsrVar.zzc();
        zzg(zzc, "action", str);
        for (Pair pair : pairArr) {
            zzg(zzc, (String) pair.first, (String) pair.second);
        }
        zzdsrVar.zzf(zzc);
    }

    public static int zzf(zzffo zzffoVar) {
        if (zzffoVar.zzr) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzffoVar.zzd;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzmVar.zzs;
        if (zzcVar == null && zzmVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzmVar.zzx == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }

    private static void zzg(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }
}
