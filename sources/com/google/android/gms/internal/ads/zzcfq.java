package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcfq implements zzblp {
    @Nullable
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfp zzcfpVar;
        zzcfh zza;
        zzcee zzceeVar = (zzcee) obj;
        if (com.google.android.gms.ads.internal.util.client.zzm.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzm.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcfi zzy = com.google.android.gms.ads.internal.zzu.zzy();
        if (map.containsKey("abort")) {
            if (!zzy.zzd(zzceeVar)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache abort but no precache task running.");
                return;
            }
            return;
        }
        String str = (String) map.get("src");
        Integer zzb = zzb(map, "periodicReportIntervalMs");
        Integer zzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer zzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzced zzcedVar = new zzced((String) map.get("flags"));
        boolean z8 = zzcedVar.zzl;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                        strArr2[i9] = jSONArray.getString(i9);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z8) {
                Iterator it = zzy.iterator();
                while (true) {
                    if (it.hasNext()) {
                        zzcfh zzcfhVar = (zzcfh) it.next();
                        if (zzcfhVar.zza == zzceeVar && str.equals(zzcfhVar.zze())) {
                            zza = zzcfhVar;
                            break;
                        }
                    } else {
                        zza = null;
                        break;
                    }
                }
            } else {
                zza = zzy.zza(zzceeVar);
            }
            if (zza != null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache task is already running.");
                return;
            }
            if (zzceeVar.zzj() == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache requires a dependency provider.");
                return;
            }
            Integer zzb4 = zzb(map, "player");
            if (zzb4 == null) {
                zzb4 = 0;
            }
            if (zzb != null) {
                zzceeVar.zzA(zzb.intValue());
            }
            if (zzb2 != null) {
                zzceeVar.zzy(zzb2.intValue());
            }
            if (zzb3 != null) {
                zzceeVar.zzx(zzb3.intValue());
            }
            int intValue = zzb4.intValue();
            zzcfb zzcfbVar = zzceeVar.zzj().zzb;
            if (intValue > 0) {
                int i10 = zzcedVar.zzh;
                int zzu = zzcdv.zzu();
                if (zzu < i10) {
                    zzcfpVar = new zzcfy(zzceeVar, zzcedVar);
                } else if (zzu < zzcedVar.zzb) {
                    zzcfpVar = new zzcfv(zzceeVar, zzcedVar);
                } else {
                    zzcfpVar = new zzcft(zzceeVar);
                }
            } else {
                zzcfpVar = new zzcfs(zzceeVar);
            }
            new zzcfh(zzceeVar, zzcfpVar, str, strArr).zzb();
        } else {
            zzcfh zza2 = zzy.zza(zzceeVar);
            if (zza2 != null) {
                zzcfpVar = zza2.zzb;
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache must specify a source.");
                return;
            }
        }
        Integer zzb5 = zzb(map, "minBufferMs");
        if (zzb5 != null) {
            zzcfpVar.zzs(zzb5.intValue());
        }
        Integer zzb6 = zzb(map, "maxBufferMs");
        if (zzb6 != null) {
            zzcfpVar.zzr(zzb6.intValue());
        }
        Integer zzb7 = zzb(map, "bufferForPlaybackMs");
        if (zzb7 != null) {
            zzcfpVar.zzp(zzb7.intValue());
        }
        Integer zzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (zzb8 != null) {
            zzcfpVar.zzq(zzb8.intValue());
        }
    }
}
