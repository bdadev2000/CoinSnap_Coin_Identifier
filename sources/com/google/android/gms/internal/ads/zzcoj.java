package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcoj implements zzhfx {
    private final zzhgp zza;

    public zzcoj(zzhgp zzhgpVar) {
        this.zza = zzhgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcsh) this.zza).zza().zzz);
        } catch (JSONException unused) {
            return null;
        }
    }
}
