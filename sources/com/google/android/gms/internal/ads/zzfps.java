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

/* loaded from: classes2.dex */
public class zzfps {
    private final String zza;
    private zzfqw zzb;
    private long zzc;
    private int zzd;

    public zzfps(String str) {
        zzb();
        this.zza = str;
        this.zzb = new zzfqw(null);
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

    public final void zzd(String str, long j7) {
        if (j7 >= this.zzc && this.zzd != 3) {
            this.zzd = 3;
            zzfpl.zza().zzg(zza(), this.zza, str);
        }
    }

    public final void zze() {
        zzfpl.zza().zzc(zza(), this.zza);
    }

    public final void zzf(zzfok zzfokVar) {
        zzfpl.zza().zzd(zza(), this.zza, zzfokVar.zzb());
    }

    public final void zzg(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zzfpy.zze(jSONObject, CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(date.getTime()));
        zzfpl.zza().zzf(zza(), jSONObject);
    }

    public final void zzh(String str, long j7) {
        if (j7 >= this.zzc) {
            this.zzd = 2;
            zzfpl.zza().zzg(zza(), this.zza, str);
        }
    }

    public void zzi(zzfon zzfonVar, zzfol zzfolVar) {
        zzj(zzfonVar, zzfolVar, null);
    }

    public final void zzj(zzfon zzfonVar, zzfol zzfolVar, JSONObject jSONObject) {
        String zzh = zzfonVar.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfpy.zze(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        zzfpy.zze(jSONObject2, "adSessionType", zzfolVar.zzd());
        JSONObject jSONObject3 = new JSONObject();
        zzfpy.zze(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        zzfpy.zze(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfpy.zze(jSONObject3, "os", "Android");
        zzfpy.zze(jSONObject2, "deviceInfo", jSONObject3);
        zzfpy.zze(jSONObject2, "deviceCategory", zzfpx.zza().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfpy.zze(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfpy.zze(jSONObject4, "partnerName", zzfolVar.zze().zzb());
        zzfpy.zze(jSONObject4, "partnerVersion", zzfolVar.zze().zzc());
        zzfpy.zze(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfpy.zze(jSONObject5, "libraryVersion", "1.4.10-google_20240110");
        zzfpy.zze(jSONObject5, "appId", zzfpj.zzb().zza().getApplicationContext().getPackageName());
        zzfpy.zze(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject5);
        if (zzfolVar.zzf() != null) {
            zzfpy.zze(jSONObject2, "contentUrl", zzfolVar.zzf());
        }
        if (zzfolVar.zzg() != null) {
            zzfpy.zze(jSONObject2, "customReferenceData", zzfolVar.zzg());
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfolVar.zzh().iterator();
        if (!it.hasNext()) {
            zzfpl.zza().zzi(zza(), zzh, jSONObject2, jSONObject6, jSONObject);
        } else {
            throw null;
        }
    }

    public final void zzk(boolean z8) {
        String str;
        if (this.zzb.get() != 0) {
            if (true != z8) {
                str = "backgrounded";
            } else {
                str = "foregrounded";
            }
            zzfpl.zza().zzh(zza(), this.zza, str);
        }
    }

    public final void zzl(float f9) {
        zzfpl.zza().zze(zza(), this.zza, f9);
    }

    public final void zzm(WebView webView) {
        this.zzb = new zzfqw(webView);
    }

    public void zzn() {
    }
}
