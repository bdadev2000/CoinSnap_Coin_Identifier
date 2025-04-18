package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzfqf {
    private JSONObject zza;
    private final zzfqo zzb;

    public zzfqf(zzfqo zzfqoVar) {
        this.zzb = zzfqoVar;
    }

    @VisibleForTesting
    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.zzb(new zzfqp(this));
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long j2) {
        this.zzb.zzb(new zzfqq(this, hashSet, jSONObject, j2));
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long j2) {
        this.zzb.zzb(new zzfqr(this, hashSet, jSONObject, j2));
    }

    @VisibleForTesting
    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
