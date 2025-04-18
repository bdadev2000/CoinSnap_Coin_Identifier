package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class zzbms {
    public static void zza(zzbmt zzbmtVar, String str, Map map) {
        try {
            zzbmtVar.zze(str, com.google.android.gms.ads.internal.client.zzbc.zzb().zzj(map));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbmt zzbmtVar, String str, JSONObject jSONObject) {
        StringBuilder t2 = androidx.compose.foundation.text.input.a.t("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Dispatching AFMA event: ".concat(t2.toString()));
        zzbmtVar.zza(t2.toString());
    }

    public static void zzc(zzbmt zzbmtVar, String str, String str2) {
        zzbmtVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbmt zzbmtVar, String str, JSONObject jSONObject) {
        zzbmtVar.zzb(str, jSONObject.toString());
    }
}
