package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcds implements zzbjr {
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

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcdr zzcdrVar;
        zzcdj zza;
        zzccf zzccfVar = (zzccf) obj;
        if (com.google.android.gms.ads.internal.util.client.zzm.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzm.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcdk zzz = com.google.android.gms.ads.internal.zzv.zzz();
        if (map.containsKey("abort")) {
            if (!zzz.zzd(zzccfVar)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache abort but no precache task running.");
                return;
            }
            return;
        }
        String str = (String) map.get("src");
        Integer zzb = zzb(map, "periodicReportIntervalMs");
        Integer zzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer zzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcce zzcceVar = new zzcce((String) map.get("flags"));
        boolean z10 = zzcceVar.zzk;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        strArr2[i10] = jSONArray.getString(i10);
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
            if (z10) {
                Iterator it = zzz.iterator();
                while (true) {
                    if (it.hasNext()) {
                        zzcdj zzcdjVar = (zzcdj) it.next();
                        if (zzcdjVar.zza == zzccfVar && str.equals(zzcdjVar.zze())) {
                            zza = zzcdjVar;
                            break;
                        }
                    } else {
                        zza = null;
                        break;
                    }
                }
            } else {
                zza = zzz.zza(zzccfVar);
            }
            if (zza != null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache task is already running.");
                return;
            }
            if (zzccfVar.zzj() == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache requires a dependency provider.");
                return;
            }
            Integer zzb4 = zzb(map, "player");
            if (zzb4 == null) {
                zzb4 = 0;
            }
            if (zzb != null) {
                zzccfVar.zzA(zzb.intValue());
            }
            if (zzb2 != null) {
                zzccfVar.zzy(zzb2.intValue());
            }
            if (zzb3 != null) {
                zzccfVar.zzx(zzb3.intValue());
            }
            int intValue = zzb4.intValue();
            zzcdc zzcdcVar = zzccfVar.zzj().zzb;
            if (intValue > 0) {
                int i11 = zzcceVar.zzg;
                int zzu = zzcbw.zzu();
                if (zzu < i11) {
                    zzcdrVar = new zzcea(zzccfVar, zzcceVar);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzn)).booleanValue()) {
                        zzu = zzcdx.zzi();
                    }
                    if (zzu < zzcceVar.zzb) {
                        zzcdrVar = new zzcdx(zzccfVar, zzcceVar);
                    } else {
                        zzcdrVar = new zzcdv(zzccfVar);
                    }
                }
            } else {
                zzcdrVar = new zzcdu(zzccfVar);
            }
            new zzcdj(zzccfVar, zzcdrVar, str, strArr).zzb();
        } else {
            zzcdj zza2 = zzz.zza(zzccfVar);
            if (zza2 != null) {
                zzcdrVar = zza2.zzb;
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache must specify a source.");
                return;
            }
        }
        Integer zzb5 = zzb(map, "minBufferMs");
        if (zzb5 != null) {
            zzcdrVar.zzs(zzb5.intValue());
        }
        Integer zzb6 = zzb(map, "maxBufferMs");
        if (zzb6 != null) {
            zzcdrVar.zzr(zzb6.intValue());
        }
        Integer zzb7 = zzb(map, "bufferForPlaybackMs");
        if (zzb7 != null) {
            zzcdrVar.zzp(zzb7.intValue());
        }
        Integer zzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (zzb8 != null) {
            zzcdrVar.zzq(zzb8.intValue());
        }
    }
}
