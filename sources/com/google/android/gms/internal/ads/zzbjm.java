package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
final class zzbjm implements zzbjw {
    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfo zzcfoVar = (zzcfo) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(zzcfoVar.getContext()).edit();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                edit.remove(jSONArray.getString(i2));
            }
            edit.apply();
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "GMSG clear local storage keys handler");
        }
    }
}
