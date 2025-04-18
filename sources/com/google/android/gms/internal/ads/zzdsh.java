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

/* loaded from: classes3.dex */
public final class zzdsh {
    private final ConcurrentHashMap zza;
    private final zzcad zzb;
    private final zzffo zzc;
    private final String zzd;
    private final String zze;
    private final com.google.android.gms.ads.internal.zzk zzf;
    private final Bundle zzg = new Bundle();
    private final Context zzh;

    public zzdsh(Context context, zzdsr zzdsrVar, zzcad zzcadVar, zzffo zzffoVar, String str, String str2, com.google.android.gms.ads.internal.zzk zzkVar) {
        ActivityManager.MemoryInfo zzc;
        String str3;
        ConcurrentHashMap zzc2 = zzdsrVar.zzc();
        this.zza = zzc2;
        this.zzb = zzcadVar;
        this.zzc = zzffoVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzkVar;
        this.zzh = context;
        zzc2.put("ad_format", str2.toUpperCase(Locale.ROOT));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzje)).booleanValue()) {
            int zzp = zzkVar.zzp();
            int i10 = zzp - 1;
            if (zzp != 0) {
                if (i10 == 0) {
                    str3 = "1";
                } else if (i10 != 1) {
                    str3 = "na";
                } else {
                    str3 = MBridgeConstans.API_REUQEST_CATEGORY_APP;
                }
                zzc2.put("asv", str3);
            } else {
                throw null;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzci)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            zzc("rt_f", String.valueOf(runtime.freeMemory()));
            zzc("rt_m", String.valueOf(runtime.maxMemory()));
            zzc("rt_t", String.valueOf(runtime.totalMemory()));
            zzc("wv_c", String.valueOf(com.google.android.gms.ads.internal.zzv.zzp().zzb()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcn)).booleanValue() && (zzc = com.google.android.gms.ads.internal.util.client.zzf.zzc(context)) != null) {
                zzc("mem_avl", String.valueOf(zzc.availMem));
                zzc("mem_tt", String.valueOf(zzc.totalMem));
                zzc("low_m", true != zzc.lowMemory ? "0" : "1");
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgO)).booleanValue()) {
            return;
        }
        int zzf = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzf(zzffoVar) - 1;
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
            zzc("ragent", zzffoVar.zzd.zzp);
            zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzffoVar.zzd)));
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

    public final void zzd(zzfff zzfffVar) {
        String str;
        if (!zzfffVar.zzb.zza.isEmpty()) {
            zzfet zzfetVar = (zzfet) zzfffVar.zzb.zza.get(0);
            zzc("ad_format", zzfet.zza(zzfetVar.zzb));
            if (zzfetVar.zzb == 6) {
                ConcurrentHashMap concurrentHashMap = this.zza;
                if (true != this.zzb.zzm()) {
                    str = "0";
                } else {
                    str = "1";
                }
                concurrentHashMap.put("as", str);
            }
        }
        zzc("gqi", zzfffVar.zzb.zzb.zzb);
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
