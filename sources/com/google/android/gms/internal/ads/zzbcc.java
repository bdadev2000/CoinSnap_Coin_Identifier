package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbcc extends zzbce {
    public zzbcc(int i10, String str, String str2, String str3) {
        super(1, str, str2, str3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final /* bridge */ /* synthetic */ Object zza(JSONObject jSONObject) {
        return jSONObject.optString(zzl(), (String) zzk());
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzl()))) {
            return bundle.getString("com.google.android.gms.ads.flag.".concat(zzl()));
        }
        return (String) zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(zzl(), (String) zzk());
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putString(zzl(), (String) obj);
    }
}
