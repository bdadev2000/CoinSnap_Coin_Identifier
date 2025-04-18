package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfov {
    private JSONObject zza;
    private final zzfpe zzb;

    public zzfov(zzfpe zzfpeVar) {
        this.zzb = zzfpeVar;
    }

    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.zzb(new zzfpf(this));
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long j3) {
        this.zzb.zzb(new zzfpg(this, hashSet, jSONObject, j3));
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long j3) {
        this.zzb.zzb(new zzfph(this, hashSet, jSONObject, j3));
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
