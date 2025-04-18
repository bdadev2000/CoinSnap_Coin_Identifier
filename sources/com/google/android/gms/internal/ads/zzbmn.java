package com.google.android.gms.internal.ads;

import a4.j;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class zzbmn {
    public static void zza(zzbmo zzbmoVar, String str, Map map) {
        try {
            zzbmoVar.zze(str, com.google.android.gms.ads.internal.client.zzbc.zzb().zzj(map));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbmo zzbmoVar, String str, JSONObject jSONObject) {
        StringBuilder p10 = j.p("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Dispatching AFMA event: ".concat(p10.toString()));
        zzbmoVar.zza(p10.toString());
    }

    public static void zzc(zzbmo zzbmoVar, String str, String str2) {
        zzbmoVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbmo zzbmoVar, String str, JSONObject jSONObject) {
        zzbmoVar.zzb(str, jSONObject.toString());
    }
}
