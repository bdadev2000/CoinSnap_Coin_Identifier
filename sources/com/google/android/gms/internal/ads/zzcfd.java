package com.google.android.gms.internal.ads;

import Q7.n0;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcfd implements zzblp {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i9) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzay.zzb();
                i9 = com.google.android.gms.ads.internal.util.client.zzf.zzy(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder o3 = o.o("Parse pixels for ", str, ", got string ", str2, ", int ");
            o3.append(i9);
            o3.append(".");
            com.google.android.gms.ads.internal.util.zze.zza(o3.toString());
        }
        return i9;
    }

    private static void zzc(zzcds zzcdsVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcdsVar.zzB(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse buffer parameters in loadControl video GMSG: (" + str + ", " + str2 + ")");
                return;
            }
        }
        if (str2 != null) {
            zzcdsVar.zzA(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcdsVar.zzy(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcdsVar.zzz(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcdsVar.zzD(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Integer num;
        Integer num2;
        int min;
        int min2;
        int i9;
        zzcee zzceeVar = (zzcee) obj;
        String str = (String) map.get("action");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Action missing from video GMSG.");
            return;
        }
        Integer num3 = null;
        if (map.containsKey("playerId")) {
            num = Integer.valueOf(Integer.parseInt((String) map.get("playerId")));
        } else {
            num = null;
        }
        if (zzceeVar.zzo() != null) {
            num2 = zzceeVar.zzo().zzb();
        } else {
            num2 = null;
        }
        if (num != null && num2 != null && !num.equals(num2) && !str.equals("load")) {
            Locale locale = Locale.US;
            com.google.android.gms.ads.internal.util.client.zzm.zzi("Event intended for player " + num + ", but sent to player " + num2 + " - event ignored");
            return;
        }
        if (com.google.android.gms.ads.internal.util.client.zzm.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzm.zze("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get(TtmlNode.ATTR_TTS_COLOR);
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzceeVar.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get(TtmlNode.ATTR_TTS_COLOR);
            if (TextUtils.isEmpty(str3)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzceeVar.zzB(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("No MIME types specified for decoder properties inspection.");
                HashMap hashMap = new HashMap();
                hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
                hashMap.put("error", "missingMimeTypes");
                zzceeVar.zzd("onVideoEvent", hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            for (String str5 : str4.split(",")) {
                hashMap2.put(str5, com.google.android.gms.ads.internal.util.zzcn.zza(str5.trim()));
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
            hashMap3.put("mimeTypes", hashMap2);
            zzceeVar.zzd("onVideoEvent", hashMap3);
            return;
        }
        zzcdt zzo = zzceeVar.zzo();
        if (zzo == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = str.equals("new");
        boolean equals2 = str.equals("position");
        if (!equals && !equals2) {
            zzcif zzq = zzceeVar.zzq();
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
                    } catch (NumberFormatException unused3) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                        return;
                    }
                }
                if (str.equals("skip")) {
                    zzq.zzu();
                    return;
                }
            }
            zzcds zza = zzo.zza();
            if (zza == null) {
                HashMap hashMap4 = new HashMap();
                hashMap4.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
                zzceeVar.zzd("onVideoEvent", hashMap4);
                return;
            }
            if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
                Context context = zzceeVar.getContext();
                int zzb = zzb(context, map, "x", 0);
                float zzb2 = zzb(context, map, "y", 0);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, zzb, zzb2, 0);
                zza.zzx(obtain);
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
                    zza.zzw((int) (Float.parseFloat(str7) * 1000.0f));
                    return;
                } catch (NumberFormatException unused4) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                    return;
                }
            }
            if (str.equals("hide")) {
                zza.setVisibility(4);
                return;
            }
            if (str.equals("remove")) {
                zza.setVisibility(8);
                return;
            }
            if (str.equals("load")) {
                zza.zzr(num);
                return;
            }
            if (str.equals("loadControl")) {
                zzc(zza, map);
                return;
            }
            if (str.equals("muted")) {
                if (Boolean.parseBoolean((String) map.get("muted"))) {
                    zza.zzs();
                    return;
                } else {
                    zza.zzI();
                    return;
                }
            }
            if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_PAUSE)) {
                zza.zzu();
                return;
            }
            if (str.equals("play")) {
                zza.zzv();
                return;
            }
            if (str.equals("show")) {
                zza.setVisibility(0);
                return;
            }
            if (str.equals("src")) {
                String str8 = (String) map.get("src");
                if (map.containsKey("periodicReportIntervalMs")) {
                    try {
                        num3 = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                    } catch (NumberFormatException unused5) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                    }
                }
                String[] strArr = {str8};
                String str9 = (String) map.get("demuxed");
                if (str9 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str9);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            strArr2[i10] = jSONArray.getString(i10);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused6) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Malformed demuxed URL list for playback: ".concat(str9));
                        strArr = new String[]{str8};
                    }
                }
                if (num3 != null) {
                    zzceeVar.zzA(num3.intValue());
                }
                zza.zzE(str8, strArr);
                return;
            }
            if (str.equals("touchMove")) {
                Context context2 = zzceeVar.getContext();
                zza.zzH(zzb(context2, map, "dx", 0), zzb(context2, map, "dy", 0));
                if (!this.zza) {
                    zzceeVar.zzu();
                    this.zza = true;
                    return;
                }
                return;
            }
            if (str.equals("volume")) {
                String str10 = (String) map.get("volume");
                if (str10 == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Level parameter missing from volume video GMSG.");
                    return;
                }
                try {
                    zza.zzG(Float.parseFloat(str10));
                    return;
                } catch (NumberFormatException unused7) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse volume parameter from volume video GMSG: ".concat(str10));
                    return;
                }
            }
            if (str.equals(MBridgeConstans.EXTRA_KEY_WM)) {
                zza.zzn();
                return;
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Unknown video action: ".concat(str));
                return;
            }
        }
        Context context3 = zzceeVar.getContext();
        int zzb3 = zzb(context3, map, "x", 0);
        int zzb4 = zzb(context3, map, "y", 0);
        int zzb5 = zzb(context3, map, "w", -1);
        zzbeg zzbegVar = zzbep.zzdR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar)).booleanValue()) {
            if (zzb5 == -1) {
                min = zzceeVar.zzh();
            } else {
                min = Math.min(zzb5, zzceeVar.zzh());
            }
        } else {
            if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                StringBuilder o3 = n0.o(zzb5, zzceeVar.zzh(), "Calculate width with original width ", ", videoHost.getVideoBoundingWidth() ", ", x ");
                o3.append(zzb3);
                o3.append(".");
                com.google.android.gms.ads.internal.util.zze.zza(o3.toString());
            }
            min = Math.min(zzb5, zzceeVar.zzh() - zzb3);
        }
        int i11 = min;
        int zzb6 = zzb(context3, map, "h", -1);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar)).booleanValue()) {
            if (zzb6 == -1) {
                min2 = zzceeVar.zzg();
            } else {
                min2 = Math.min(zzb6, zzceeVar.zzg());
            }
        } else {
            if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                StringBuilder o9 = n0.o(zzb6, zzceeVar.zzg(), "Calculate height with original height ", ", videoHost.getVideoBoundingHeight() ", ", y ");
                o9.append(zzb4);
                o9.append(".");
                com.google.android.gms.ads.internal.util.zze.zza(o9.toString());
            }
            min2 = Math.min(zzb6, zzceeVar.zzg() - zzb4);
        }
        int i12 = min2;
        try {
            i9 = Integer.parseInt((String) map.get("player"));
        } catch (NumberFormatException unused8) {
            i9 = 0;
        }
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
        if (equals && zzo.zza() == null) {
            zzo.zzd(zzb3, zzb4, i11, i12, i9, parseBoolean, new zzced((String) map.get("flags")));
            zzcds zza2 = zzo.zza();
            if (zza2 != null) {
                zzc(zza2, map);
                return;
            }
            return;
        }
        zzo.zzc(zzb3, zzb4, i11, i12);
    }
}
