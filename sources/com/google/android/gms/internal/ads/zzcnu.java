package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcnu implements zzbob {
    private final Context zza;
    private final zzayi zzb;
    private final PowerManager zzc;

    public zzcnu(Context context, zzayi zzayiVar) {
        this.zza = context;
        this.zzb = zzayiVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcnx zzcnxVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzayl zzaylVar = zzcnxVar.zzf;
        if (zzaylVar == null) {
            jSONObject = new JSONObject();
        } else if (this.zzb.zzd() != null) {
            boolean z10 = zzaylVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put(CampaignEx.JSON_KEY_TIMESTAMP, zzcnxVar.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcnxVar.zzb).put("isNative", this.zzb.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzv.zzs().zze()).put("appVolume", com.google.android.gms.ads.internal.zzv.zzs().zza()).put("deviceVolume", com.google.android.gms.ads.internal.util.zzab.zzb(this.zza.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzaylVar.zzb).put("isAttachedToWindow", z10).put("viewBox", new JSONObject().put("top", zzaylVar.zzc.top).put("bottom", zzaylVar.zzc.bottom).put(TtmlNode.LEFT, zzaylVar.zzc.left).put(TtmlNode.RIGHT, zzaylVar.zzc.right)).put("adBox", new JSONObject().put("top", zzaylVar.zzd.top).put("bottom", zzaylVar.zzd.bottom).put(TtmlNode.LEFT, zzaylVar.zzd.left).put(TtmlNode.RIGHT, zzaylVar.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", zzaylVar.zze.top).put("bottom", zzaylVar.zze.bottom).put(TtmlNode.LEFT, zzaylVar.zze.left).put(TtmlNode.RIGHT, zzaylVar.zze.right)).put("globalVisibleBoxVisible", zzaylVar.zzf).put("localVisibleBox", new JSONObject().put("top", zzaylVar.zzg.top).put("bottom", zzaylVar.zzg.bottom).put(TtmlNode.LEFT, zzaylVar.zzg.left).put(TtmlNode.RIGHT, zzaylVar.zzg.right)).put("localVisibleBoxVisible", zzaylVar.zzh).put("hitBox", new JSONObject().put("top", zzaylVar.zzi.top).put("bottom", zzaylVar.zzi.bottom).put(TtmlNode.LEFT, zzaylVar.zzi.left).put(TtmlNode.RIGHT, zzaylVar.zzi.right)).put("screenDensity", this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzcnxVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbw)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzaylVar.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put(TtmlNode.LEFT, rect2.left).put(TtmlNode.RIGHT, rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcnxVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
