package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbca extends zzbce {
    public zzbca(int i10, String str, Long l10, Long l11) {
        super(1, str, l10, l11, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final /* bridge */ /* synthetic */ Object zza(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(zzl(), ((Long) zzk()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzl()))) {
            return Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(zzl())));
        }
        return (Long) zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(zzl(), ((Long) zzk()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(zzl(), ((Long) obj).longValue());
    }
}
