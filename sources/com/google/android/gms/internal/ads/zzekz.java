package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzekz implements zzegm {
    private final Map zza = new HashMap();
    private final zzdru zzb;

    public zzekz(zzdru zzdruVar) {
        this.zzb = zzdruVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegm
    @Nullable
    public final zzegn zza(String str, JSONObject jSONObject) throws zzfhj {
        zzegn zzegnVar;
        synchronized (this) {
            try {
                zzegnVar = (zzegn) this.zza.get(str);
                if (zzegnVar == null) {
                    zzegnVar = new zzegn(this.zzb.zzc(str, jSONObject), new zzeih(), str);
                    this.zza.put(str, zzegnVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzegnVar;
    }
}
