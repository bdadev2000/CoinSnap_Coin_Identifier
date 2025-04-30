package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
final class zzblf implements zzblp {
    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzchd zzchdVar = (zzchd) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(zzchdVar.getContext()).edit();
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                edit.remove(jSONArray.getString(i9));
            }
            edit.apply();
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "GMSG clear local storage keys handler");
        }
    }
}
