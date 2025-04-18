package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class zzfoh {
    private final String zza;
    private zzfpj zzb;
    private long zzc;
    private int zzd;

    public zzfoh(String str) {
        zzb();
        this.zza = str;
        this.zzb = new zzfpj(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView zza() {
        return (WebView) this.zzb.get();
    }

    public final void zzb() {
        this.zzc = System.nanoTime();
        this.zzd = 1;
    }

    public void zzc() {
        this.zzb.clear();
    }

    public final void zzd(String str, long j3) {
        if (j3 < this.zzc || this.zzd == 3) {
            return;
        }
        this.zzd = 3;
        zzfny.zza().zzh(zza(), this.zza, str);
    }

    public final void zze() {
        zzfny.zza().zzc(zza(), this.zza);
    }

    public final void zzf(zzfmx zzfmxVar) {
        zzfny.zza().zzd(zza(), this.zza, zzfmxVar.zzb());
    }

    public final void zzg(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zzfon.zze(jSONObject, CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(date.getTime()));
        zzfny.zza().zzf(zza(), jSONObject);
    }

    public final void zzh(String str, long j3) {
        if (j3 >= this.zzc) {
            this.zzd = 2;
            zzfny.zza().zzh(zza(), this.zza, str);
        }
    }

    public void zzi(zzfna zzfnaVar, zzfmy zzfmyVar) {
        zzj(zzfnaVar, zzfmyVar, null);
    }

    public final void zzj(zzfna zzfnaVar, zzfmy zzfmyVar, JSONObject jSONObject) {
        String zzh = zzfnaVar.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfon.zze(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        zzfon.zze(jSONObject2, "adSessionType", zzfmyVar.zzd());
        JSONObject jSONObject3 = new JSONObject();
        zzfon.zze(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        zzfon.zze(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfon.zze(jSONObject3, "os", "Android");
        zzfon.zze(jSONObject2, "deviceInfo", jSONObject3);
        zzfon.zze(jSONObject2, "deviceCategory", zzfom.zza().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfon.zze(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfon.zze(jSONObject4, "partnerName", zzfmyVar.zze().zzb());
        zzfon.zze(jSONObject4, "partnerVersion", zzfmyVar.zze().zzc());
        zzfon.zze(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfon.zze(jSONObject5, "libraryVersion", "1.4.14-google_20240908");
        zzfon.zze(jSONObject5, "appId", zzfnw.zzb().zza().getApplicationContext().getPackageName());
        zzfon.zze(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject5);
        if (zzfmyVar.zzf() != null) {
            zzfon.zze(jSONObject2, "contentUrl", zzfmyVar.zzf());
        }
        if (zzfmyVar.zzg() != null) {
            zzfon.zze(jSONObject2, "customReferenceData", zzfmyVar.zzg());
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfmyVar.zzh().iterator();
        if (!it.hasNext()) {
            zzfny.zza().zzj(zza(), zzh, jSONObject2, jSONObject6, jSONObject);
        } else {
            throw null;
        }
    }

    public final void zzk(boolean z10) {
        String str;
        if (zzp()) {
            if (true != z10) {
                str = "backgrounded";
            } else {
                str = "foregrounded";
            }
            zzfny.zza().zzi(zza(), this.zza, str);
        }
    }

    public final void zzl(float f10) {
        zzfny.zza().zze(zza(), this.zza, f10);
    }

    public final void zzm(boolean z10) {
        String str;
        if (zzp()) {
            if (true != z10) {
                str = "unlocked";
            } else {
                str = "locked";
            }
            zzfny.zza().zzg(zza(), this.zza, str);
        }
    }

    public final void zzn(WebView webView) {
        this.zzb = new zzfpj(webView);
    }

    public void zzo() {
    }

    public final boolean zzp() {
        return this.zzb.get() != 0;
    }
}
