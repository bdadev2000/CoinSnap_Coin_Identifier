package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class zzdux {
    private final ConcurrentHashMap zza;
    private final zzccc zzb;
    private final zzfho zzc;
    private final String zzd;
    private final String zze;
    private final com.google.android.gms.ads.internal.zzj zzf;
    private final Bundle zzg = new Bundle();
    private final Context zzh;

    public zzdux(Context context, zzdvh zzdvhVar, zzccc zzcccVar, zzfho zzfhoVar, String str, String str2, com.google.android.gms.ads.internal.zzj zzjVar) {
        ActivityManager.MemoryInfo zzc;
        String str3;
        ConcurrentHashMap zzc2 = zzdvhVar.zzc();
        this.zza = zzc2;
        this.zzb = zzcccVar;
        this.zzc = zzfhoVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzjVar;
        this.zzh = context;
        zzc2.put("ad_format", str2.toUpperCase(Locale.ROOT));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjz)).booleanValue()) {
            int zzj = zzjVar.zzj();
            int i9 = zzj - 1;
            if (zzj != 0) {
                if (i9 == 0) {
                    str3 = "1";
                } else if (i9 != 1) {
                    str3 = "na";
                } else {
                    str3 = MBridgeConstans.API_REUQEST_CATEGORY_APP;
                }
                zzc2.put("asv", str3);
            } else {
                throw null;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            zzc("rt_f", String.valueOf(runtime.freeMemory()));
            zzc("rt_m", String.valueOf(runtime.maxMemory()));
            zzc("rt_t", String.valueOf(runtime.totalMemory()));
            zzc("wv_c", String.valueOf(com.google.android.gms.ads.internal.zzu.zzo().zzb()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcf)).booleanValue() && (zzc = com.google.android.gms.ads.internal.util.client.zzf.zzc(context)) != null) {
                zzc("mem_avl", String.valueOf(zzc.availMem));
                zzc("mem_tt", String.valueOf(zzc.totalMem));
                zzc("low_m", true != zzc.lowMemory ? "0" : "1");
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhj)).booleanValue()) {
            return;
        }
        int zzf = com.google.android.gms.ads.nonagon.signalgeneration.zzp.zzf(zzfhoVar) - 1;
        if (zzf != 0) {
            if (zzf != 1) {
                if (zzf != 2) {
                    if (zzf != 3) {
                        zzc2.put("se", "r_both");
                    } else {
                        zzc2.put("se", "r_adstring");
                    }
                } else {
                    zzc2.put("se", "r_adinfo");
                }
            } else {
                zzc2.put("request_id", str);
                zzc2.put("se", "query_g");
            }
            zzc2.put("scar", "true");
            zzc("ragent", zzfhoVar.zzd.zzp);
            zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzp.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzp.zzc(zzfhoVar.zzd)));
            return;
        }
        zzc2.put("request_id", str);
        zzc2.put("scar", "false");
    }

    public final Bundle zza() {
        return this.zzg;
    }

    public final Map zzb() {
        return this.zza;
    }

    public final void zzc(String str, @Nullable String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zza.put(str, str2);
        }
    }

    public final void zzd(zzfhf zzfhfVar) {
        String str;
        if (!zzfhfVar.zzb.zza.isEmpty()) {
            zzfgt zzfgtVar = (zzfgt) zzfhfVar.zzb.zza.get(0);
            zzc("ad_format", zzfgt.zza(zzfgtVar.zzb));
            if (zzfgtVar.zzb == 6) {
                ConcurrentHashMap concurrentHashMap = this.zza;
                if (true != this.zzb.zzm()) {
                    str = "0";
                } else {
                    str = "1";
                }
                concurrentHashMap.put("as", str);
            }
        }
        zzc("gqi", zzfhfVar.zzb.zzb.zzb);
    }

    public final void zze(Bundle bundle) {
        if (bundle != null) {
            if (bundle.containsKey("cnt")) {
                zzc("network_coarse", Integer.toString(bundle.getInt("cnt")));
            }
            if (bundle.containsKey("gnt")) {
                zzc("network_fine", Integer.toString(bundle.getInt("gnt")));
            }
        }
    }
}
