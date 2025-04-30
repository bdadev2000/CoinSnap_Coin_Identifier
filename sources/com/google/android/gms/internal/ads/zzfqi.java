package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfqi {
    private JSONObject zza;
    private final zzfqr zzb;

    public zzfqi(zzfqr zzfqrVar) {
        this.zzb = zzfqrVar;
    }

    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.zzb(new zzfqs(this));
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long j7) {
        this.zzb.zzb(new zzfqt(this, hashSet, jSONObject, j7));
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long j7) {
        this.zzb.zzb(new zzfqu(this, hashSet, jSONObject, j7));
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
