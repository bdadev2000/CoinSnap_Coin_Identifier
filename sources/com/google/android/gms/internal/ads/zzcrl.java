package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcrl implements zzhkp {
    private final zzhlg zza;

    public zzcrl(zzhlg zzhlgVar) {
        this.zza = zzhlgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcvg) this.zza).zza().zzA);
        } catch (JSONException unused) {
            return null;
        }
    }
}
