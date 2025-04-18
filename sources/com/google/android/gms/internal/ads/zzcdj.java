package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.support.v4.media.d;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.safedk.android.analytics.events.MaxEvent;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcdj implements zzbjw {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i2) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzbc.zzb();
                i2 = com.google.android.gms.ads.internal.util.client.zzf.zzy(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder t2 = androidx.compose.foundation.text.input.a.t("Parse pixels for ", str, ", got string ", str2, ", int ");
            t2.append(i2);
            t2.append(".");
            com.google.android.gms.ads.internal.util.zze.zza(t2.toString());
        }
        return i2;
    }

    private static void zzc(zzcbx zzcbxVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcbxVar.zzB(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzcbxVar.zzA(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcbxVar.zzy(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcbxVar.zzz(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcbxVar.zzD(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int min;
        int min2;
        int i2;
        zzccj zzccjVar = (zzccj) obj;
        String str = (String) map.get("action");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Action missing from video GMSG.");
            return;
        }
        Integer num = null;
        Integer valueOf = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer zzb = zzccjVar.zzo() != null ? zzccjVar.zzo().zzb() : null;
        if (valueOf != null && zzb != null && !valueOf.equals(zzb) && !str.equals("load")) {
            com.google.android.gms.ads.internal.util.client.zzm.zzi(String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", valueOf, zzb));
            return;
        }
        if (com.google.android.gms.ads.internal.util.client.zzm.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzm.zze("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzccjVar.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzccjVar.zzB(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        int i3 = 0;
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("No MIME types specified for decoder properties inspection.");
                HashMap hashMap = new HashMap();
                hashMap.put(MaxEvent.f29810a, "decoderProps");
                hashMap.put("error", "missingMimeTypes");
                zzccjVar.zzd("onVideoEvent", hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            String[] split = str4.split(",");
            int length = split.length;
            while (i3 < length) {
                String str5 = split[i3];
                hashMap2.put(str5, com.google.android.gms.ads.internal.util.zzcj.zza(str5.trim()));
                i3++;
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put(MaxEvent.f29810a, "decoderProps");
            hashMap3.put("mimeTypes", hashMap2);
            zzccjVar.zzd("onVideoEvent", hashMap3);
            return;
        }
        zzcby zzo = zzccjVar.zzo();
        if (zzo == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = str.equals("new");
        boolean equals2 = str.equals("position");
        if (equals || equals2) {
            Context context = zzccjVar.getContext();
            int zzb2 = zzb(context, map, "x", 0);
            int zzb3 = zzb(context, map, "y", 0);
            int zzb4 = zzb(context, map, "w", -1);
            zzbcm zzbcmVar = zzbcv.zzdO;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).booleanValue()) {
                min = zzb4 == -1 ? zzccjVar.zzh() : Math.min(zzb4, zzccjVar.zzh());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    StringBuilder u2 = d.u("Calculate width with original width ", zzb4, ", videoHost.getVideoBoundingWidth() ", zzccjVar.zzh(), ", x ");
                    u2.append(zzb2);
                    u2.append(".");
                    com.google.android.gms.ads.internal.util.zze.zza(u2.toString());
                }
                min = Math.min(zzb4, zzccjVar.zzh() - zzb2);
            }
            int i4 = min;
            int zzb5 = zzb(context, map, "h", -1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).booleanValue()) {
                min2 = zzb5 == -1 ? zzccjVar.zzg() : Math.min(zzb5, zzccjVar.zzg());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    StringBuilder u3 = d.u("Calculate height with original height ", zzb5, ", videoHost.getVideoBoundingHeight() ", zzccjVar.zzg(), ", y ");
                    u3.append(zzb3);
                    u3.append(".");
                    com.google.android.gms.ads.internal.util.zze.zza(u3.toString());
                }
                min2 = Math.min(zzb5, zzccjVar.zzg() - zzb3);
            }
            int i5 = min2;
            try {
                i2 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i2 = 0;
            }
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (!equals || zzo.zza() != null) {
                zzo.zzc(zzb2, zzb3, i4, i5);
                return;
            }
            zzo.zzd(zzb2, zzb3, i4, i5, i2, parseBoolean, new zzcci((String) map.get("flags")));
            zzcbx zza = zzo.zza();
            if (zza != null) {
                zzc(zza, map);
                return;
            }
            return;
        }
        zzcgq zzq = zzccjVar.zzq();
        if (zzq != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzq.zzt(Float.parseFloat(str6));
                    return;
                } catch (NumberFormatException unused4) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                zzq.zzu();
                return;
            }
        }
        zzcbx zza2 = zzo.zza();
        if (zza2 == null) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put(MaxEvent.f29810a, "no_video_view");
            zzccjVar.zzd("onVideoEvent", hashMap4);
            return;
        }
        if (str.equals("click")) {
            Context context2 = zzccjVar.getContext();
            int zzb6 = zzb(context2, map, "x", 0);
            float zzb7 = zzb(context2, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, zzb6, zzb7, 0);
            zza2.zzx(obtain);
            obtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zza2.zzw((int) (Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            zza2.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            zza2.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            zza2.zzr(valueOf);
            return;
        }
        if (str.equals("loadControl")) {
            zzc(zza2, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zza2.zzs();
                return;
            } else {
                zza2.zzI();
                return;
            }
        }
        if (str.equals("pause")) {
            zza2.zzu();
            return;
        }
        if (str.equals("play")) {
            zza2.zzv();
            return;
        }
        if (str.equals("show")) {
            zza2.setVisibility(0);
            return;
        }
        if (str.equals("src")) {
            String str8 = (String) map.get("src");
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    num = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                }
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    String[] strArr2 = new String[jSONArray.length()];
                    while (i3 < jSONArray.length()) {
                        strArr2[i3] = jSONArray.getString(i3);
                        i3++;
                    }
                    strArr = strArr2;
                } catch (JSONException unused7) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (num != null) {
                zzccjVar.zzA(num.intValue());
            }
            zza2.zzE(str8, strArr);
            return;
        }
        if (str.equals("touchMove")) {
            Context context3 = zzccjVar.getContext();
            zza2.zzH(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
            if (this.zza) {
                return;
            }
            zzccjVar.zzu();
            this.zza = true;
            return;
        }
        if (!str.equals("volume")) {
            if (str.equals("watermark")) {
                zza2.zzn();
                return;
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            zza2.zzG(Float.parseFloat(str10));
        } catch (NumberFormatException unused8) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
