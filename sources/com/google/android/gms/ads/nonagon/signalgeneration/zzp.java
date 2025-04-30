package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzdux;
import com.google.android.gms.internal.ads.zzdvh;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfnc;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class zzp {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzfnc zza(Bundle bundle) {
        char c9;
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (TextUtils.isEmpty(string)) {
            return zzfnc.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
        switch (string.hashCode()) {
            case 1743582862:
                if (string.equals("requester_type_0")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582863:
                if (string.equals("requester_type_1")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582864:
                if (string.equals("requester_type_2")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582865:
                if (string.equals("requester_type_3")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582866:
                if (string.equals("requester_type_4")) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582867:
                if (string.equals("requester_type_5")) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582868:
                if (string.equals("requester_type_6")) {
                    c9 = 6;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582869:
                if (string.equals("requester_type_7")) {
                    c9 = 7;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582870:
                if (string.equals("requester_type_8")) {
                    c9 = '\b';
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 0:
                return zzfnc.SCAR_REQUEST_TYPE_ADMOB;
            case 1:
                return zzfnc.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
            case 2:
                return zzfnc.SCAR_REQUEST_TYPE_GBID;
            case 3:
                return zzfnc.SCAR_REQUEST_TYPE_GOLDENEYE;
            case 4:
                return zzfnc.SCAR_REQUEST_TYPE_YAVIN;
            case 5:
                return zzfnc.SCAR_REQUEST_TYPE_UNITY;
            case 6:
                return zzfnc.SCAR_REQUEST_TYPE_PAW;
            case 7:
                return zzfnc.SCAR_REQUEST_TYPE_GUILDER;
            case '\b':
                return zzfnc.SCAR_REQUEST_TYPE_GAM_S2S;
            default:
                return zzfnc.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String zzb(@Nullable String str) {
        char c9;
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                if (str.equals("requester_type_0")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582863:
                if (str.equals("requester_type_1")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582864:
                if (str.equals("requester_type_2")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582865:
                if (str.equals("requester_type_3")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582866:
                if (str.equals("requester_type_4")) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582867:
                if (str.equals("requester_type_5")) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582868:
                if (str.equals("requester_type_6")) {
                    c9 = 6;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582869:
                if (str.equals("requester_type_7")) {
                    c9 = 7;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582870:
                if (str.equals("requester_type_8")) {
                    c9 = '\b';
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
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
    public static String zzc(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle;
        if (zzlVar != null && (bundle = zzlVar.zzc) != null) {
            return bundle.getString("query_info_type");
        }
        return "unspecified";
    }

    public static void zzd(final zzdvh zzdvhVar, @Nullable zzdux zzduxVar, final String str, final Pair... pairArr) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhj)).booleanValue()) {
            return;
        }
        final zzdux zzduxVar2 = null;
        zzcci.zza.execute(new Runnable(zzduxVar2, str, pairArr) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzo
            public final /* synthetic */ String zzb;
            public final /* synthetic */ Pair[] zzc;

            {
                this.zzb = str;
                this.zzc = pairArr;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzp.zze(zzdvh.this, null, this.zzb, this.zzc);
            }
        });
    }

    public static void zze(zzdvh zzdvhVar, @Nullable zzdux zzduxVar, String str, Pair... pairArr) {
        ConcurrentHashMap zzc = zzdvhVar.zzc();
        zzg(zzc, "action", str);
        for (Pair pair : pairArr) {
            zzg(zzc, (String) pair.first, (String) pair.second);
        }
        zzdvhVar.zzf(zzc);
    }

    public static int zzf(zzfho zzfhoVar) {
        if (zzfhoVar.zzr) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzfhoVar.zzd;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzlVar.zzs;
        if (zzcVar == null && zzlVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzlVar.zzx == null) {
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
