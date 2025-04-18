package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzdty;
import com.google.android.gms.internal.ads.zzdui;
import com.google.android.gms.internal.ads.zzfhc;
import com.google.android.gms.internal.ads.zzfmg;
import com.google.firebase.ktx.BuildConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class zzv {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzfmg zza(Bundle bundle) {
        char c2;
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (TextUtils.isEmpty(string)) {
            return zzfmg.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
        switch (string.hashCode()) {
            case 1743582862:
                if (string.equals("requester_type_0")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1743582863:
                if (string.equals("requester_type_1")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1743582864:
                if (string.equals("requester_type_2")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1743582865:
                if (string.equals("requester_type_3")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1743582866:
                if (string.equals("requester_type_4")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1743582867:
                if (string.equals("requester_type_5")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 1743582868:
                if (string.equals("requester_type_6")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1743582869:
                if (string.equals("requester_type_7")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 1743582870:
                if (string.equals("requester_type_8")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return zzfmg.SCAR_REQUEST_TYPE_ADMOB;
            case 1:
                return zzfmg.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
            case 2:
                return zzfmg.SCAR_REQUEST_TYPE_GBID;
            case 3:
                return zzfmg.SCAR_REQUEST_TYPE_GOLDENEYE;
            case 4:
                return zzfmg.SCAR_REQUEST_TYPE_YAVIN;
            case 5:
                return zzfmg.SCAR_REQUEST_TYPE_UNITY;
            case 6:
                return zzfmg.SCAR_REQUEST_TYPE_PAW;
            case 7:
                return zzfmg.SCAR_REQUEST_TYPE_GUILDER;
            case '\b':
                return zzfmg.SCAR_REQUEST_TYPE_GAM_S2S;
            default:
                return zzfmg.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String zzb(@Nullable String str) {
        char c2;
        if (TextUtils.isEmpty(str)) {
            return BuildConfig.VERSION_NAME;
        }
        switch (str.hashCode()) {
            case 1743582862:
                if (str.equals("requester_type_0")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1743582863:
                if (str.equals("requester_type_1")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1743582864:
                if (str.equals("requester_type_2")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1743582865:
                if (str.equals("requester_type_3")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1743582866:
                if (str.equals("requester_type_4")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1743582867:
                if (str.equals("requester_type_5")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 1743582868:
                if (str.equals("requester_type_6")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1743582869:
                if (str.equals("requester_type_7")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 1743582870:
                if (str.equals("requester_type_8")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return AppEventsConstants.EVENT_PARAM_VALUE_NO;
            case 1:
                return AppEventsConstants.EVENT_PARAM_VALUE_YES;
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
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
        return (zzmVar == null || (bundle = zzmVar.zzc) == null) ? BuildConfig.VERSION_NAME : bundle.getString("query_info_type");
    }

    public static void zzd(final zzdui zzduiVar, @Nullable zzdty zzdtyVar, final String str, final Pair... pairArr) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgK)).booleanValue()) {
            final zzdty zzdtyVar2 = null;
            zzcan.zza.execute(new Runnable(zzdtyVar2, str, pairArr) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
                public final /* synthetic */ String zzb;
                public final /* synthetic */ Pair[] zzc;

                {
                    this.zzb = str;
                    this.zzc = pairArr;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzv.zze(zzdui.this, null, this.zzb, this.zzc);
                }
            });
        }
    }

    @VisibleForTesting
    public static void zze(zzdui zzduiVar, @Nullable zzdty zzdtyVar, String str, Pair... pairArr) {
        ConcurrentHashMap zzc = zzduiVar.zzc();
        zzg(zzc, "action", str);
        for (Pair pair : pairArr) {
            zzg(zzc, (String) pair.first, (String) pair.second);
        }
        zzduiVar.zzf(zzc);
    }

    public static int zzf(zzfhc zzfhcVar) {
        if (zzfhcVar.zzr) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfhcVar.zzd;
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
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }
}
