package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcqw implements zzbqa {
    private final Context zza;
    private final zzbaj zzb;
    private final PowerManager zzc;

    public zzcqw(Context context, zzbaj zzbajVar) {
        this.zza = context;
        this.zzb = zzbajVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcqz zzcqzVar) throws JSONException {
        JSONObject jSONObject;
        Integer valueOf;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzbam zzbamVar = zzcqzVar.zzf;
        if (zzbamVar == null) {
            jSONObject = new JSONObject();
        } else if (this.zzb.zzd() != null) {
            boolean z8 = zzbamVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put(CampaignEx.JSON_KEY_TIMESTAMP, zzcqzVar.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcqzVar.zzb).put("isNative", this.zzb.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzu.zzr().zze()).put("appVolume", com.google.android.gms.ads.internal.zzu.zzr().zza()).put("deviceVolume", com.google.android.gms.ads.internal.util.zzac.zzb(this.zza.getApplicationContext()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfQ)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.zza.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                if (audioManager == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(audioManager.getMode());
                }
                if (valueOf != null) {
                    jSONObject3.put("audioMode", valueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzbamVar.zzb).put("isAttachedToWindow", z8).put("viewBox", new JSONObject().put("top", zzbamVar.zzc.top).put("bottom", zzbamVar.zzc.bottom).put(TtmlNode.LEFT, zzbamVar.zzc.left).put(TtmlNode.RIGHT, zzbamVar.zzc.right)).put("adBox", new JSONObject().put("top", zzbamVar.zzd.top).put("bottom", zzbamVar.zzd.bottom).put(TtmlNode.LEFT, zzbamVar.zzd.left).put(TtmlNode.RIGHT, zzbamVar.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", zzbamVar.zze.top).put("bottom", zzbamVar.zze.bottom).put(TtmlNode.LEFT, zzbamVar.zze.left).put(TtmlNode.RIGHT, zzbamVar.zze.right)).put("globalVisibleBoxVisible", zzbamVar.zzf).put("localVisibleBox", new JSONObject().put("top", zzbamVar.zzg.top).put("bottom", zzbamVar.zzg.bottom).put(TtmlNode.LEFT, zzbamVar.zzg.left).put(TtmlNode.RIGHT, zzbamVar.zzg.right)).put("localVisibleBoxVisible", zzbamVar.zzh).put("hitBox", new JSONObject().put("top", zzbamVar.zzi.top).put("bottom", zzbamVar.zzi.bottom).put(TtmlNode.LEFT, zzbamVar.zzi.left).put(TtmlNode.RIGHT, zzbamVar.zzi.right)).put("screenDensity", this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzcqzVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbq)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzbamVar.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put(TtmlNode.LEFT, rect2.left).put(TtmlNode.RIGHT, rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcqzVar.zze)) {
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
