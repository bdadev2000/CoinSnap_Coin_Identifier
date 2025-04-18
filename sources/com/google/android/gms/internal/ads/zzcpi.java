package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcpi implements zzbog {
    private final Context zza;
    private final zzayr zzb;
    private final PowerManager zzc;

    public zzcpi(Context context, zzayr zzayrVar) {
        this.zza = context;
        this.zzb = zzayrVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcpl zzcplVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzayu zzayuVar = zzcplVar.zzf;
        if (zzayuVar == null) {
            jSONObject = new JSONObject();
        } else {
            if (this.zzb.zzd() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z2 = zzayuVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put("timestamp", zzcplVar.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcplVar.zzb).put("isNative", this.zzb.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzu.zzr().zze()).put("appVolume", com.google.android.gms.ads.internal.zzu.zzr().zza()).put("deviceVolume", com.google.android.gms.ads.internal.util.zzac.zzb(this.zza.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzayuVar.zzb).put("isAttachedToWindow", z2).put("viewBox", new JSONObject().put(ViewHierarchyConstants.DIMENSION_TOP_KEY, zzayuVar.zzc.top).put("bottom", zzayuVar.zzc.bottom).put(ViewHierarchyConstants.DIMENSION_LEFT_KEY, zzayuVar.zzc.left).put("right", zzayuVar.zzc.right)).put("adBox", new JSONObject().put(ViewHierarchyConstants.DIMENSION_TOP_KEY, zzayuVar.zzd.top).put("bottom", zzayuVar.zzd.bottom).put(ViewHierarchyConstants.DIMENSION_LEFT_KEY, zzayuVar.zzd.left).put("right", zzayuVar.zzd.right)).put("globalVisibleBox", new JSONObject().put(ViewHierarchyConstants.DIMENSION_TOP_KEY, zzayuVar.zze.top).put("bottom", zzayuVar.zze.bottom).put(ViewHierarchyConstants.DIMENSION_LEFT_KEY, zzayuVar.zze.left).put("right", zzayuVar.zze.right)).put("globalVisibleBoxVisible", zzayuVar.zzf).put("localVisibleBox", new JSONObject().put(ViewHierarchyConstants.DIMENSION_TOP_KEY, zzayuVar.zzg.top).put("bottom", zzayuVar.zzg.bottom).put(ViewHierarchyConstants.DIMENSION_LEFT_KEY, zzayuVar.zzg.left).put("right", zzayuVar.zzg.right)).put("localVisibleBoxVisible", zzayuVar.zzh).put("hitBox", new JSONObject().put(ViewHierarchyConstants.DIMENSION_TOP_KEY, zzayuVar.zzi.top).put("bottom", zzayuVar.zzi.bottom).put(ViewHierarchyConstants.DIMENSION_LEFT_KEY, zzayuVar.zzi.left).put("right", zzayuVar.zzi.right)).put("screenDensity", this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzcplVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbt)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzayuVar.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put(ViewHierarchyConstants.DIMENSION_TOP_KEY, rect2.top).put("bottom", rect2.bottom).put(ViewHierarchyConstants.DIMENSION_LEFT_KEY, rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcplVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
