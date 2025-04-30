package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbec extends zzbeg {
    public zzbec(int i9, String str, Long l, Long l2) {
        super(1, str, l, l2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbeg
    public final /* bridge */ /* synthetic */ Object zza(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(zzn(), ((Long) zzm()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbeg
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzn()))) {
            return Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(zzn())));
        }
        return (Long) zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbeg
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(zzn(), ((Long) zzm()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbeg
    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(zzn(), ((Long) obj).longValue());
    }
}
